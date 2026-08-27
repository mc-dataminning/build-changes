import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dug extends dup {
   private final ha c;
   private final dlz d;
   private final dlz e;
   private final int f;
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ha.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dlz.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dlz.b.optionalFieldOf("allowed_search_condition", dlz.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dug::new)
   );

   private dug(ha $$0, dlz $$1, dlz $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dug a(ha $$0, dlz $$1, dlz $$2, int $$3) {
      return new dug($$0, $$1, $$2, $$3);
   }

   public static dug a(ha $$0, dlz $$1, int $$2) {
      return a($$0, $$1, dlz.e(), $$2);
   }

   @Override
   public Stream<gw> a_(dun $$0, asc $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      cqp $$4 = $$0.d();
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
   public duq<?> b() {
      return duq.j;
   }
}
