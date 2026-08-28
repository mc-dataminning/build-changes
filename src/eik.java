import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eik extends eit {
   private final ji c;
   private final eac d;
   private final eac e;
   private final int f;
   public static final MapCodec<eik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ji.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eac.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eac.b.optionalFieldOf("allowed_search_condition", eac.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eik::new)
   );

   private eik(ji $$0, eac $$1, eac $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eik a(ji $$0, eac $$1, eac $$2, int $$3) {
      return new eik($$0, $$1, $$2, $$3);
   }

   public static eik a(ji $$0, eac $$1, int $$2) {
      return a($$0, $$1, eac.e(), $$2);
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      jd.a $$3 = $$2.j();
      ddq $$4 = $$0.d();
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
   public eiu<?> b() {
      return eiu.j;
   }
}
