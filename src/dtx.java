import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtx extends dug {
   private final ha c;
   private final dlq d;
   private final dlq e;
   private final int f;
   public static final Codec<dtx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ha.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dlq.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dlq.b.optionalFieldOf("allowed_search_condition", dlq.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtx::new)
   );

   private dtx(ha $$0, dlq $$1, dlq $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dtx a(ha $$0, dlq $$1, dlq $$2, int $$3) {
      return new dtx($$0, $$1, $$2, $$3);
   }

   public static dtx a(ha $$0, dlq $$1, int $$2) {
      return a($$0, $$1, dlq.e(), $$2);
   }

   @Override
   public Stream<gu> a_(due $$0, aru $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      cqg $$4 = $$0.d();
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
   public duh<?> b() {
      return duh.j;
   }
}
