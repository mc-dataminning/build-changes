import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class eca extends ecj {
   private final ih c;
   private final dtt d;
   private final dtt e;
   private final int f;
   public static final Codec<eca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ih.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dtt.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dtt.b.optionalFieldOf("allowed_search_condition", dtt.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, eca::new)
   );

   private eca(ih $$0, dtt $$1, dtt $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static eca a(ih $$0, dtt $$1, dtt $$2, int $$3) {
      return new eca($$0, $$1, $$2, $$3);
   }

   public static eca a(ih $$0, dtt $$1, int $$2) {
      return a($$0, $$1, dtt.e(), $$2);
   }

   @Override
   public Stream<ib> a_(ech $$0, axd $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      cxu $$4 = $$0.d();
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
   public eck<?> b() {
      return eck.j;
   }
}
