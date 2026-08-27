import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ecc extends ecl {
   private final ih c;
   private final dtv d;
   private final dtv e;
   private final int f;
   public static final Codec<ecc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ih.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dtv.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dtv.b.optionalFieldOf("allowed_search_condition", dtv.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ecc::new)
   );

   private ecc(ih $$0, dtv $$1, dtv $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ecc a(ih $$0, dtv $$1, dtv $$2, int $$3) {
      return new ecc($$0, $$1, $$2, $$3);
   }

   public static ecc a(ih $$0, dtv $$1, int $$2) {
      return a($$0, $$1, dtv.e(), $$2);
   }

   @Override
   public Stream<ib> a_(ecj $$0, axd $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      cxw $$4 = $$0.d();
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
   public ecm<?> b() {
      return ecm.j;
   }
}
