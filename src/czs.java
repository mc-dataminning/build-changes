import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record czs(cyo<czt> c) implements dcs {
   public static final Codec<czs> a = cyo.a(mh.aV, czt.c).xmap(czs::new, czs::a);
   public static final yw<wj, czs> b = yw.a(cyo.a(mh.aV, czt.d), czs::a, czs::new);

   @Override
   public void a(czj.b $$0, Consumer<wy> $$1, dbc $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xm $$2x = ((czt)$$1x.a()).c().f();
            xb.a($$2x, xv.a.a(o.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bug a(djm $$0, iv $$1, czn $$2, crm $$3) {
      czs $$4 = $$2.a(kk.ae);
      if ($$4 == null) {
         return bug.f;
      } else {
         eat $$5 = $$0.a_($$1);
         if ($$5.a(dmt.ek) && !$$5.c(dqz.b)) {
            if (!$$0.C) {
               czn $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dyw $$7) {
                  $$7.b($$6);
                  $$0.a(eft.c, $$1, eft.a.a($$3, $$5));
               }

               $$3.a(awx.al);
            }

            return bug.a;
         } else {
            return bug.f;
         }
      }
   }

   public cyo<czt> a() {
      return this.c;
   }
}
