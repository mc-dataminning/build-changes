import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record czi(cye<czj> c) implements dci {
   public static final Codec<czi> a = cye.a(mg.aV, czj.c).xmap(czi::new, czi::a);
   public static final yw<wj, czi> b = yw.a(cye.a(mg.aV, czj.d), czi::a, czi::new);

   @Override
   public void a(cyz.b $$0, Consumer<wy> $$1, das $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xm $$2x = ((czj)$$1x.a()).c().f();
            xb.a($$2x, xv.a.a(n.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bud a(dja $$0, iu $$1, czd $$2, crc $$3) {
      czi $$4 = $$2.a(kj.ae);
      if ($$4 == null) {
         return bud.f;
      } else {
         eah $$5 = $$0.a_($$1);
         if ($$5.a(dmh.ek) && !$$5.c(dqn.b)) {
            if (!$$0.C) {
               czd $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dyk $$7) {
                  $$7.b($$6);
                  $$0.a(efh.c, $$1, efh.a.a($$3, $$5));
               }

               $$3.a(awx.al);
            }

            return bud.a;
         } else {
            return bud.f;
         }
      }
   }

   public cye<czj> a() {
      return this.c;
   }
}
