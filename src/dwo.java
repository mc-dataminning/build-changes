import com.mojang.serialization.Codec;
import java.util.List;

public class dwo extends dwq {
   public static final Codec<dwo> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dwo::new, $$0 -> $$0.b).codec();
   private final float b;

   public dwo(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dwr<?> a() {
      return dwr.c;
   }

   @Override
   public void a(dwq.a $$0) {
      auv $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hx> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ic $$3x : ic.c.a) {
               if ($$1.i() <= 0.25F) {
                  ic $$4 = $$3x.g();
                  hx $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cws.fC.o().a(cxx.c, Integer.valueOf($$1.a(3))).a(cxx.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
