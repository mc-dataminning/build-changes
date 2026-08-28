import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ehi extends ehr {
   private final je c;
   private final dzb d;
   private final dzb e;
   private final int f;
   public static final MapCodec<ehi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               je.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dzb.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dzb.b.optionalFieldOf("allowed_search_condition", dzb.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ehi::new)
   );

   private ehi(je $$0, dzb $$1, dzb $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ehi a(je $$0, dzb $$1, dzb $$2, int $$3) {
      return new ehi($$0, $$1, $$2, $$3);
   }

   public static ehi a(je $$0, dzb $$1, int $$2) {
      return a($$0, $$1, dzb.e(), $$2);
   }

   @Override
   public Stream<iz> a_(ehp $$0, azh $$1, iz $$2) {
      iz.a $$3 = $$2.j();
      dct $$4 = $$0.d();
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
   public ehs<?> b() {
      return ehs.j;
   }
}
