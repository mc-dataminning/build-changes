import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bxd extends bwo<cnt> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cnw, alg<eub>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cnw.c, ets.ar);
      $$0.put(cnw.d, ets.as);
      $$0.put(cnw.e, ets.at);
      $$0.put(cnw.f, ets.au);
      $$0.put(cnw.g, ets.av);
      $$0.put(cnw.h, ets.aw);
      $$0.put(cnw.i, ets.ax);
      $$0.put(cnw.j, ets.ay);
      $$0.put(cnw.k, ets.az);
      $$0.put(cnw.l, ets.aA);
      $$0.put(cnw.n, ets.aB);
      $$0.put(cnw.o, ets.aC);
      $$0.put(cnw.p, ets.aD);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxd(int $$0) {
      super(ImmutableMap.of(cdz.m, cea.c, cdz.n, cea.c, cdz.q, cea.c, cdz.k, cea.a), $$0);
   }

   protected boolean a(arm $$0, cnt $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arm $$0, cnt $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      coh $$3 = this.c($$1).get();
      $$1.ed().a(cdz.q, $$3);
      bwq.a($$1, $$3);
   }

   protected boolean b(arm $$0, cnt $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      coh $$3 = this.c($$1).get();
      bwq.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (buv)$$3);
            this.j = true;
         }
      } else {
         bwq.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arm $$0, cnt $$1, long $$2) {
      this.i = a($$0);
      $$1.ed().b(cdz.q);
      $$1.ed().b(cdz.m);
      $$1.ed().b(cdz.n);
   }

   private void a(cnt $$0, buv $$1) {
      for (cvx $$3 : this.a($$0)) {
         bwq.a($$0, $$3, $$1.dv());
      }
   }

   private List<cvx> a(cnt $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cvx(cwb.dl));
      } else {
         cnw $$1 = $$0.gF().b();
         if (g.containsKey($$1)) {
            eub $$2 = $$0.dX().o().bd().b(g.get($$1));
            etz $$3 = new etz.a((arm)$$0.dX()).a(ews.f, $$0.dv()).a(ews.a, $$0).a(ewr.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cvx(cwb.pw));
         }
      }
   }

   private boolean b(cnt $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<coh> c(cnt $$0) {
      return $$0.ed().c(cdz.k).filter(this::a);
   }

   private boolean a(coh $$0) {
      return $$0.b(btg.F);
   }

   private boolean a(cnt $$0, coh $$1) {
      jg $$2 = $$1.dx();
      jg $$3 = $$0.dx();
      return $$3.a($$2, 5.0);
   }

   private static int a(arm $$0) {
      return 600 + $$0.A.a(6001);
   }
}
