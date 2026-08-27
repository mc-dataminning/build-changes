import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dye extends dyn {
   private final ic c;
   private final dpx d;
   private final dpx e;
   private final int f;
   public static final Codec<dye> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ic.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dpx.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dpx.b.optionalFieldOf("allowed_search_condition", dpx.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dye::new)
   );

   private dye(ic $$0, dpx $$1, dpx $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dye a(ic $$0, dpx $$1, dpx $$2, int $$3) {
      return new dye($$0, $$1, $$2, $$3);
   }

   public static dye a(ic $$0, dpx $$1, int $$2) {
      return a($$0, $$1, dpx.e(), $$2);
   }

   @Override
   public Stream<hx> a_(dyl $$0, auv $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      cuk $$4 = $$0.d();
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
   public dyo<?> b() {
      return dyo.j;
   }
}
