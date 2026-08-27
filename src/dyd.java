import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dyd extends dym {
   private final ic c;
   private final dpw d;
   private final dpw e;
   private final int f;
   public static final Codec<dyd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ic.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dpw.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dpw.b.optionalFieldOf("allowed_search_condition", dpw.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dyd::new)
   );

   private dyd(ic $$0, dpw $$1, dpw $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dyd a(ic $$0, dpw $$1, dpw $$2, int $$3) {
      return new dyd($$0, $$1, $$2, $$3);
   }

   public static dyd a(ic $$0, dpw $$1, int $$2) {
      return a($$0, $$1, dpw.e(), $$2);
   }

   @Override
   public Stream<hx> a_(dyk $$0, auu $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      cuj $$4 = $$0.d();
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
   public dyn<?> b() {
      return dyn.j;
   }
}
