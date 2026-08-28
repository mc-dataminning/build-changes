import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eio extends eiy {
   private final ji c;
   private final eaf d;
   private final eaf e;
   private final int f;
   public static final MapCodec<eio> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ji.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eaf.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eaf.b.optionalFieldOf("allowed_search_condition", eaf.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eio::new)
   );

   private eio(ji $$0, eaf $$1, eaf $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eio a(ji $$0, eaf $$1, eaf $$2, int $$3) {
      return new eio($$0, $$1, $$2, $$3);
   }

   public static eio a(ji $$0, eaf $$1, int $$2) {
      return a($$0, $$1, eaf.e(), $$2);
   }

   @Override
   public Stream<jd> a_(eiw $$0, ayw $$1, jd $$2) {
      jd.a $$3 = $$2.k();
      dds $$4 = $$0.d();
      if (!this.e.test($$4, $$3)) {
         return Stream.of();
      } else {
         for (int $$5 = 0; $$5 < this.f; $$5++) {
            if (this.d.test($$4, $$3)) {
               return Stream.of($$3);
            }

            $$3.c(this.c);
            if ($$4.d($$3.v())) {
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
   public eiz<?> b() {
      return eiz.j;
   }
}
