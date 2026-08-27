import com.mojang.serialization.Codec;
import java.util.List;

public class dwn extends dwp {
   public static final Codec<dwn> a = Codec.floatRange(0.0F, 1.0F).fieldOf("probability").xmap(dwn::new, $$0 -> $$0.b).codec();
   private final float b;

   public dwn(float $$0) {
      this.b = $$0;
   }

   @Override
   protected dwq<?> a() {
      return dwq.c;
   }

   @Override
   public void a(dwp.a $$0) {
      auu $$1 = $$0.b();
      if (!($$1.i() >= this.b)) {
         List<hx> $$2 = $$0.c();
         int $$3 = $$2.get(0).v();
         $$2.stream().filter($$1x -> $$1x.v() - $$3 <= 2).forEach($$2x -> {
            for (ic $$3x : ic.c.a) {
               if ($$1.i() <= 0.25F) {
                  ic $$4 = $$3x.g();
                  hx $$5 = $$2x.b($$4.j(), 0, $$4.l());
                  if ($$0.a($$5)) {
                     $$0.a($$5, cwr.fC.o().a(cxw.c, Integer.valueOf($$1.a(3))).a(cxw.aE, $$3x));
                  }
               }
            }
         });
      }
   }
}
