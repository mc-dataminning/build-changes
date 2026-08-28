import com.mojang.serialization.Codec;
import java.util.function.Consumer;

public record dap(czl<daq> c) implements ddp {
   public static final Codec<dap> a = czl.a(mi.aV, daq.c).xmap(dap::new, dap::a);
   public static final ze<wp, dap> b = ze.a(czl.a(mi.aV, daq.d), dap::a, dap::new);

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      ji.a $$4 = $$0.a();
      if ($$4 != null) {
         this.c.a($$4).ifPresent($$1x -> {
            xu $$2x = ((daq)$$1x.a()).c().f();
            xj.a($$2x, yd.a.a(o.h));
            $$1.accept($$2x);
         });
      }
   }

   public static bvc a(dkj $$0, iw $$1, dak $$2, csi $$3) {
      dap $$4 = $$2.a(kl.ae);
      if ($$4 == null) {
         return bvc.f;
      } else {
         ebq $$5 = $$0.a_($$1);
         if ($$5.a(dnq.ek) && !$$5.c(drw.b)) {
            if (!$$0.C) {
               dak $$6 = $$2.b(1, $$3);
               if ($$0.c_($$1) instanceof dzt $$7) {
                  $$7.b($$6);
                  $$0.a(egq.c, $$1, egq.a.a($$3, $$5));
               }

               $$3.a(axi.al);
            }

            return bvc.a;
         } else {
            return bvc.f;
         }
      }
   }

   public czl<daq> a() {
      return this.c;
   }
}
