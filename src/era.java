import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class era extends erk {
   private final jc c;
   private final eim d;
   private final eim e;
   private final int f;
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jc.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eim.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eim.b.optionalFieldOf("allowed_search_condition", eim.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, era::new)
   );

   private era(jc $$0, eim $$1, eim $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static era a(jc $$0, eim $$1, eim $$2, int $$3) {
      return new era($$0, $$1, $$2, $$3);
   }

   public static era a(jc $$0, eim $$1, int $$2) {
      return a($$0, $$1, eim.e(), $$2);
   }

   @Override
   public Stream<iw> a_(eri $$0, azz $$1, iw $$2) {
      iw.a $$3 = $$2.k();
      dky $$4 = $$0.d();
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
   public erl<?> b() {
      return erl.j;
   }
}
