import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class erk extends eru {
   private final jc c;
   private final eiw d;
   private final eiw e;
   private final int f;
   public static final MapCodec<erk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jc.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               eiw.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               eiw.b.optionalFieldOf("allowed_search_condition", eiw.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, erk::new)
   );

   private erk(jc $$0, eiw $$1, eiw $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static erk a(jc $$0, eiw $$1, eiw $$2, int $$3) {
      return new erk($$0, $$1, $$2, $$3);
   }

   public static erk a(jc $$0, eiw $$1, int $$2) {
      return a($$0, $$1, eiw.e(), $$2);
   }

   @Override
   public Stream<iw> a_(ers $$0, bai $$1, iw $$2) {
      iw.a $$3 = $$2.k();
      dli $$4 = $$0.d();
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
   public erv<?> b() {
      return erv.j;
   }
}
