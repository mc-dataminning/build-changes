import com.mojang.serialization.Codec;
import java.util.List;

public class dym extends dyo {
   public static final Codec<dym> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dym::new, $$0 -> $$0.b).codec();
   private final float b;

   public dym(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dyp<?> a() {
      return dyp.c;
   }

   @Override
   public void a(dyo.a $$0) {
      awo $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hz> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ie $$3x : ie.c.a) {
               if ($$1.i() <= 0.25F) {
                  ie $$4 = $$3x.g();
                  hz $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cyq.fC.o().a(czv.c, Integer.valueOf($$1.a(3))).a(czv.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
