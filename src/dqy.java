import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dqy extends drh {
   private final ha c;
   private final dir d;
   private final dir e;
   private final int f;
   public static final Codec<dqy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ha.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dir.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dir.b.optionalFieldOf("allowed_search_condition", dir.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dqy::new)
   );

   private dqy(ha $$0, dir $$1, dir $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dqy a(ha $$0, dir $$1, dir $$2, int $$3) {
      return new dqy($$0, $$1, $$2, $$3);
   }

   public static dqy a(ha $$0, dir $$1, int $$2) {
      return a($$0, $$1, dir.e(), $$2);
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      cng $$4 = $$0.d();
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
   public dri<?> b() {
      return dri.j;
   }
}
