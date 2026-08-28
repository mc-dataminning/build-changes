import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record czp(cyl<czq> c) implements dcp {
   public static final Codec<czp> a = cyl.a(mh.aV, czq.c).xmap(czp::new, czp::a);
   public static final yw<wj, czp> b = yw.a(cyl.a(mh.aV, czq.d), czp::a, czp::new);

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xm $$2x = ((czq)$$1x.a()).c().f();
            xb.a($$2x, xv.a.a(o.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bug a(djh $$0, iv $$1, czk $$2, crj $$3) {
      czp $$4 = $$2.a(kk.ae);
      if ($$4 == null) {
         return bug.f;
      } else {
         eao $$5 = $$0.a_($$1);
         if ($$5.a(dmo.ek) && !$$5.c(dqu.b)) {
            if (!$$0.C) {
               czk $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dyr $$7) {
                  $$7.b($$6);
                  $$0.a(efo.c, $$1, efo.a.a($$3, $$5));
               }

               $$3.a(awx.al);
            }

            return bug.a;
         } else {
            return bug.f;
         }
      }
   }

   public cyl<czq> a() {
      return this.c;
   }
}
