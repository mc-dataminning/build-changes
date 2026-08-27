import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class dtv extends due {
   private final hb c;
   private final dlo d;
   private final dlo e;
   private final int f;
   public static final Codec<dtv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               hb.h.fieldOf("direction_of_search").forGetter($$0x -> $$0x.c),
               dlo.b.fieldOf("target_condition").forGetter($$0x -> $$0x.d),
               dlo.b.optionalFieldOf("allowed_search_condition", dlo.e()).forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 32).fieldOf("max_steps").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dtv::new)
   );

   private dtv(hb $$0, dlo $$1, dlo $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static dtv a(hb $$0, dlo $$1, dlo $$2, int $$3) {
      return new dtv($$0, $$1, $$2, $$3);
   }

   public static dtv a(hb $$0, dlo $$1, int $$2) {
      return a($$0, $$1, dlo.e(), $$2);
   }

   @Override
   public Stream<gv> a_(duc $$0, art $$1, gv $$2) {
      gv.a $$3 = $$2.j();
      cqe $$4 = $$0.d();
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
   public duf<?> b() {
      return duf.j;
   }
}
