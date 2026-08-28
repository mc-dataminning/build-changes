import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvk extends buv<cly> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmb, akj<erb>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmb.c, eqs.aH);
      $$0.put(cmb.d, eqs.aI);
      $$0.put(cmb.e, eqs.aJ);
      $$0.put(cmb.f, eqs.aK);
      $$0.put(cmb.g, eqs.aL);
      $$0.put(cmb.h, eqs.aM);
      $$0.put(cmb.i, eqs.aN);
      $$0.put(cmb.j, eqs.aO);
      $$0.put(cmb.k, eqs.aP);
      $$0.put(cmb.l, eqs.aQ);
      $$0.put(cmb.n, eqs.aR);
      $$0.put(cmb.o, eqs.aS);
      $$0.put(cmb.p, eqs.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvk(int $$0) {
      super(ImmutableMap.of(ccg.m, cch.c, ccg.n, cch.c, ccg.q, cch.c, ccg.k, cch.a), $$0);
   }

   protected boolean a(aqm $$0, cly $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqm $$0, cly $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cml $$3 = this.c($$1).get();
      $$1.dV().a(ccg.q, $$3);
      bux.a($$1, $$3);
   }

   protected boolean b(aqm $$0, cly $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      cml $$3 = this.c($$1).get();
      bux.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btc)$$3);
            this.j = true;
         }
      } else {
         bux.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqm $$0, cly $$1, long $$2) {
      this.i = a($$0);
      $$1.dV().b(ccg.q);
      $$1.dV().b(ccg.m);
      $$1.dV().b(ccg.n);
   }

   private void a(cly $$0, btc $$1) {
      for (cud $$3 : this.a($$0)) {
         bux.a($$0, $$3, $$1.dp());
      }
   }

   private List<cud> a(cly $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cud(cug.dl));
      } else {
         cmb $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            erb $$2 = $$0.dR().o().bf().b(g.get($$1));
            eqz $$3 = new eqz.a((aqm)$$0.dR()).a(ets.f, $$0.dp()).a(ets.a, $$0).a(etr.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cud(cug.pv));
         }
      }
   }

   private boolean b(cly $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cml> c(cly $$0) {
      return $$0.dV().c(ccg.k).filter(this::a);
   }

   private boolean a(cml $$0) {
      return $$0.b(brr.F);
   }

   private boolean a(cly $$0, cml $$1) {
      ja $$2 = $$1.dr();
      ja $$3 = $$0.dr();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqm $$0) {
      return 600 + $$0.z.a(6001);
   }
}
