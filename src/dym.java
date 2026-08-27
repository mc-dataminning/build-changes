import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dym extends dyv {
   private final ic c;
   private final dqf d;
   private final dqf e;
   private final int f;
   public static final Codec<dym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ic.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dqf.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dqf.b.optionalFieldOf("allowed_search_condition", dqf.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dym::new)
   );

   private dym(ic $$0, dqf $$1, dqf $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dym a(ic $$0, dqf $$1, dqf $$2, int $$3) {
      return new dym($$0, $$1, $$2, $$3);
   }

   public static dym a(ic $$0, dqf $$1, int $$2) {
      return a($$0, $$1, dqf.e(), $$2);
   }

   @Override
   public Stream<hx> a_(dyt $$0, auw $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      cus $$4 = $$0.d();
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
   public dyw<?> b() {
      return dyw.j;
   }
}
