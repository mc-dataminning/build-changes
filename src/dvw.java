import com.mojang.serialization.Codec;
import java.util.List;

public class dvw extends dvy {
   public static final Codec<dvw> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dvw::new, $$0 -> $$0.b).codec();
   private final float b;

   public dvw(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dvz<?> a() {
      return dvz.c;
   }

   @Override
   public void a(dvy.a $$0) {
      auf $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hv> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ia $$3x : ia.c.a) {
               if ($$1.i() <= 0.25F) {
                  ia $$4 = $$3x.g();
                  hv $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cwb.fC.o().a(cxg.c, Integer.valueOf($$1.a(3))).a(cxg.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
