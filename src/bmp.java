import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bmp extends bma<cck> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<ccn, afw> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ccn.c, edg.an);
      $$0.put(ccn.d, edg.ao);
      $$0.put(ccn.e, edg.ap);
      $$0.put(ccn.f, edg.aq);
      $$0.put(ccn.g, edg.ar);
      $$0.put(ccn.h, edg.as);
      $$0.put(ccn.i, edg.at);
      $$0.put(ccn.j, edg.au);
      $$0.put(ccn.k, edg.av);
      $$0.put(ccn.l, edg.aw);
      $$0.put(ccn.n, edg.ax);
      $$0.put(ccn.o, edg.ay);
      $$0.put(ccn.p, edg.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bmp(int $$0) {
      super(ImmutableMap.of(btk.m, btl.c, btk.n, btl.c, btk.q, btl.c, btk.k, btl.a), $$0);
   }

   protected boolean a(alq $$0, cck $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(alq $$0, cck $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      ccx $$3 = this.c($$1).get();
      $$1.dN().a(btk.q, $$3);
      bmc.a($$1, $$3);
   }

   protected boolean b(alq $$0, cck $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      ccx $$3 = this.c($$1).get();
      bmc.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bkj)$$3);
            this.j = true;
         }
      } else {
         bmc.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(alq $$0, cck $$1, long $$2) {
      this.i = a($$0);
      $$1.dN().b(btk.q);
      $$1.dN().b(btk.m);
      $$1.dN().b(btk.n);
   }

   private void a(cck $$0, bkj $$1) {
      for (ckj $$3 : this.a($$0)) {
         bmc.a($$0, $$3, $$1.dj());
      }
   }

   private List<ckj> a(cck $$0) {
      if ($$0.n_()) {
         return ImmutableList.of(new ckj(ckm.cP));
      } else {
         ccn $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            edq $$2 = $$0.dL().n().aH().getLootTable(g.get($$1));
            edo $$3 = new edo.a((alq)$$0.dL()).a(eft.f, $$0.dj()).a(eft.a, $$0).a(efs.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new ckj(ckm.oH));
         }
      }
   }

   private boolean b(cck $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<ccx> c(cck $$0) {
      return $$0.dN().c(btk.k).filter(this::a);
   }

   private boolean a(ccx $$0) {
      return $$0.a(bji.F);
   }

   private boolean a(cck $$0, ccx $$1) {
      ht $$2 = $$1.dl();
      ht $$3 = $$0.dl();
      return $$3.a($$2, 5.0);
   }

   private static int a(alq $$0) {
      return 600 + $$0.z.a(6001);
   }
}
