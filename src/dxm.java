import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dxm extends dxv {
   private final ia c;
   private final dpf d;
   private final dpf e;
   private final int f;
   public static final Codec<dxm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ia.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dpf.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dpf.b.optionalFieldOf("allowed_search_condition", dpf.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dxm::new)
   );

   private dxm(ia $$0, dpf $$1, dpf $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dxm a(ia $$0, dpf $$1, dpf $$2, int $$3) {
      return new dxm($$0, $$1, $$2, $$3);
   }

   public static dxm a(ia $$0, dpf $$1, int $$2) {
      return a($$0, $$1, dpf.e(), $$2);
   }

   @Override
   public Stream<hv> a_(dxt $$0, auf $$1, hv $$2) {
      hv.a $$3 = $$2.j();
      ctt $$4 = $$0.d();
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
   public dxw<?> b() {
      return dxw.j;
   }
}
