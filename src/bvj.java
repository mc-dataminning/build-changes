import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvj extends buu<clx> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cma, akj<eqz>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cma.c, eqq.aH);
      $$0.put(cma.d, eqq.aI);
      $$0.put(cma.e, eqq.aJ);
      $$0.put(cma.f, eqq.aK);
      $$0.put(cma.g, eqq.aL);
      $$0.put(cma.h, eqq.aM);
      $$0.put(cma.i, eqq.aN);
      $$0.put(cma.j, eqq.aO);
      $$0.put(cma.k, eqq.aP);
      $$0.put(cma.l, eqq.aQ);
      $$0.put(cma.n, eqq.aR);
      $$0.put(cma.o, eqq.aS);
      $$0.put(cma.p, eqq.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvj(int $$0) {
      super(ImmutableMap.of(ccf.m, ccg.c, ccf.n, ccg.c, ccf.q, ccg.c, ccf.k, ccg.a), $$0);
   }

   protected boolean a(aqm $$0, clx $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqm $$0, clx $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmk $$3 = this.c($$1).get();
      $$1.dU().a(ccf.q, $$3);
      buw.a($$1, $$3);
   }

   protected boolean b(aqm $$0, clx $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      cmk $$3 = this.c($$1).get();
      buw.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btb)$$3);
            this.j = true;
         }
      } else {
         buw.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqm $$0, clx $$1, long $$2) {
      this.i = a($$0);
      $$1.dU().b(ccf.q);
      $$1.dU().b(ccf.m);
      $$1.dU().b(ccf.n);
   }

   private void a(clx $$0, btb $$1) {
      for (cuc $$3 : this.a($$0)) {
         buw.a($$0, $$3, $$1.do());
      }
   }

   private List<cuc> a(clx $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cuc(cuf.dl));
      } else {
         cma $$1 = $$0.gz().b();
         if (g.containsKey($$1)) {
            eqz $$2 = $$0.dQ().o().bf().b(g.get($$1));
            eqx $$3 = new eqx.a((aqm)$$0.dQ()).a(etq.f, $$0.do()).a(etq.a, $$0).a(etp.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuc(cuf.pv));
         }
      }
   }

   private boolean b(clx $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmk> c(clx $$0) {
      return $$0.dU().c(ccf.k).filter(this::a);
   }

   private boolean a(cmk $$0) {
      return $$0.b(brq.F);
   }

   private boolean a(clx $$0, cmk $$1) {
      ja $$2 = $$1.dq();
      ja $$3 = $$0.dq();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqm $$0) {
      return 600 + $$0.z.a(6001);
   }
}
