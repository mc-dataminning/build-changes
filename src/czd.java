import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record czd(cxz<cze> c) implements dcd {
   public static final Codec<czd> a = cxz.a(mg.aU, cze.c).xmap(czd::new, czd::a);
   public static final yw<wj, czd> b = yw.a(cxz.a(mg.aU, cze.d), czd::a, czd::new);

   @Override
   public void a(cyu.b $$0, Consumer<wy> $$1, dan $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xm $$2x = ((cze)$$1x.a()).c().f();
            xb.a($$2x, xv.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bub a(div $$0, iu $$1, cyy $$2, cqy $$3) {
      czd $$4 = $$2.a(kj.ae);
      if ($$4 == null) {
         return bub.f;
      } else {
         dzz $$5 = $$0.a_($$1);
         if ($$5.a(dmc.eh) && !$$5.c(dqh.b)) {
            if (!$$0.C) {
               cyy $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dyc $$7) {
                  $$7.b($$6);
                  $$0.a(eez.c, $$1, eez.a.a($$3, $$5));
               }

               $$3.a(awx.al);
            }

            return bub.a;
         } else {
            return bub.f;
         }
      }
   }

   public cxz<cze> a() {
      return this.c;
   }
}
