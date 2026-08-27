import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bne extends bmp<ccz> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cdc, agg> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cdc.c, eej.an);
      $$0.put(cdc.d, eej.ao);
      $$0.put(cdc.e, eej.ap);
      $$0.put(cdc.f, eej.aq);
      $$0.put(cdc.g, eej.ar);
      $$0.put(cdc.h, eej.as);
      $$0.put(cdc.i, eej.at);
      $$0.put(cdc.j, eej.au);
      $$0.put(cdc.k, eej.av);
      $$0.put(cdc.l, eej.aw);
      $$0.put(cdc.n, eej.ax);
      $$0.put(cdc.o, eej.ay);
      $$0.put(cdc.p, eej.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bne(int $$0) {
      super(ImmutableMap.of(btz.m, bua.c, btz.n, bua.c, btz.q, bua.c, btz.k, bua.a), $$0);
   }

   protected boolean a(ama $$0, ccz $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ama $$0, ccz $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cdm $$3 = this.c($$1).get();
      $$1.dN().a(btz.q, $$3);
      bmr.a($$1, $$3);
   }

   protected boolean b(ama $$0, ccz $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      cdm $$3 = this.c($$1).get();
      bmr.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bky)$$3);
            this.j = true;
         }
      } else {
         bmr.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ama $$0, ccz $$1, long $$2) {
      this.i = a($$0);
      $$1.dN().b(btz.q);
      $$1.dN().b(btz.m);
      $$1.dN().b(btz.n);
   }

   private void a(ccz $$0, bky $$1) {
      for (clb $$3 : this.a($$0)) {
         bmr.a($$0, $$3, $$1.dj());
      }
   }

   private List<clb> a(ccz $$0) {
      if ($$0.n_()) {
         return ImmutableList.of(new clb(cle.cP));
      } else {
         cdc $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            eet $$2 = $$0.dL().n().aH().getLootTable(g.get($$1));
            eer $$3 = new eer.a((ama)$$0.dL()).a(egw.f, $$0.dj()).a(egw.a, $$0).a(egv.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new clb(cle.oH));
         }
      }
   }

   private boolean b(ccz $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cdm> c(ccz $$0) {
      return $$0.dN().c(btz.k).filter(this::a);
   }

   private boolean a(cdm $$0) {
      return $$0.a(bjx.F);
   }

   private boolean a(ccz $$0, cdm $$1) {
      ht $$2 = $$1.dl();
      ht $$3 = $$0.dl();
      return $$3.a($$2, 5.0);
   }

   private static int a(ama $$0) {
      return 600 + $$0.z.a(6001);
   }
}
