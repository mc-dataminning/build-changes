import com.mojang.serialization.Codec;
import java.util.List;

public class dyt extends dyv {
   public static final Codec<dyt> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dyt::new, $$0 -> $$0.b).codec();
   private final float b;

   public dyt(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dyw<?> a() {
      return dyw.c;
   }

   @Override
   public void a(dyv.a $$0) {
      awp $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hz> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ie $$3x : ie.c.a) {
               if ($$1.i() <= 0.25F) {
                  ie $$4 = $$3x.g();
                  hz $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cyu.fC.o().a(czz.c, Integer.valueOf($$1.a(3))).a(czz.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
