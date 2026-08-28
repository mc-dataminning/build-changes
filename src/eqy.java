import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eqy extends eri {
   private final jb c;
   private final eik d;
   private final eik e;
   private final int f;
   public static final MapCodec<eqy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jb.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eik.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eik.b.optionalFieldOf("allowed_search_condition", eik.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eqy::new)
   );

   private eqy(jb $$0, eik $$1, eik $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eqy a(jb $$0, eik $$1, eik $$2, int $$3) {
      return new eqy($$0, $$1, $$2, $$3);
   }

   public static eqy a(jb $$0, eik $$1, int $$2) {
      return a($$0, $$1, eik.e(), $$2);
   }

   @Override
   public Stream<iv> a_(erg $$0, azx $$1, iv $$2) {
      iv.a $$3 = $$2.k();
      dkw $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.e($$3.v())) {
               return Stream.of();
            }

            if (!this.e.test($$4, $$3)) {
               break;
            }
         }

         return this.d.test($$4, $$3) ? Stream.of($$3) : Stream.of();
      }
   }

   @Override
   public erj<?> b() {
      return erj.j;
   }
}
