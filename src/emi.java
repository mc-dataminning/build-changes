import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class emi extends ems {
   private final jn c;
   private final edy d;
   private final edy e;
   private final int f;
   public static final MapCodec<emi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jn.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               edy.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               edy.b.optionalFieldOf("allowed_search_condition", edy.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, emi::new)
   );

   private emi(jn $$0, edy $$1, edy $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static emi a(jn $$0, edy $$1, edy $$2, int $$3) {
      return new emi($$0, $$1, $$2, $$3);
   }

   public static emi a(jn $$0, edy $$1, int $$2) {
      return a($$0, $$1, edy.e(), $$2);
   }

   @Override
   public Stream<ji> a_(emq $$0, azh $$1, ji $$2) {
      ji.a $$3 = $$2.k();
      dhf $$4 = $$0.d();
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
   public emt<?> b() {
      return emt.j;
   }
}
