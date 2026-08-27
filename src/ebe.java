import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class ebe extends ebn {
   private final ih c;
   private final dsx d;
   private final dsx e;
   private final int f;
   public static final Codec<ebe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ih.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dsx.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dsx.b.optionalFieldOf("allowed_search_condition", dsx.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ebe::new)
   );

   private ebe(ih $$0, dsx $$1, dsx $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ebe a(ih $$0, dsx $$1, dsx $$2, int $$3) {
      return new ebe($$0, $$1, $$2, $$3);
   }

   public static ebe a(ih $$0, dsx $$1, int $$2) {
      return a($$0, $$1, dsx.e(), $$2);
   }

   @Override
   public Stream<ib> a_(ebl $$0, awt $$1, ib $$2) {
      ib.a $$3 = $$2.j();
      cwz $$4 = $$0.d();
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
   public ebo<?> b() {
      return ebo.j;
   }
}
