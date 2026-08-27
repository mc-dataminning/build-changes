import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bor extends boc<cev> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cey, ahg> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cey.c, egu.ax);
      $$0.put(cey.d, egu.ay);
      $$0.put(cey.e, egu.az);
      $$0.put(cey.f, egu.aA);
      $$0.put(cey.g, egu.aB);
      $$0.put(cey.h, egu.aC);
      $$0.put(cey.i, egu.aD);
      $$0.put(cey.j, egu.aE);
      $$0.put(cey.k, egu.aF);
      $$0.put(cey.l, egu.aG);
      $$0.put(cey.n, egu.aH);
      $$0.put(cey.o, egu.aI);
      $$0.put(cey.p, egu.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bor(int $$0) {
      super(ImmutableMap.of(bvn.m, bvo.c, bvn.n, bvo.c, bvn.q, bvo.c, bvn.k, bvo.a), $$0);
   }

   protected boolean a(and $$0, cev $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(and $$0, cev $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cfi $$3 = this.c($$1).get();
      $$1.dO().a(bvn.q, $$3);
      boe.a($$1, $$3);
   }

   protected boolean b(and $$0, cev $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(and $$0, cev $$1, long $$2) {
      cfi $$3 = this.c($$1).get();
      boe.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bml)$$3);
            this.j = true;
         }
      } else {
         boe.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(and $$0, cev $$1, long $$2) {
      this.i = a($$0);
      $$1.dO().b(bvn.q);
      $$1.dO().b(bvn.m);
      $$1.dO().b(bvn.n);
   }

   private void a(cev $$0, bml $$1) {
      for (cmy $$3 : this.a($$0)) {
         boe.a($$0, $$3, $$1.dk());
      }
   }

   private List<cmy> a(cev $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cmy(cnb.dk));
      } else {
         cey $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            ehe $$2 = $$0.dM().o().aJ().getLootTable(g.get($$1));
            ehc $$3 = new ehc.a((and)$$0.dM()).a(ejh.f, $$0.dk()).a(ejh.a, $$0).a(ejg.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cmy(cnb.ps));
         }
      }
   }

   private boolean b(cev $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cfi> c(cev $$0) {
      return $$0.dO().c(bvn.k).filter(this::a);
   }

   private boolean a(cfi $$0) {
      return $$0.a(blk.F);
   }

   private boolean a(cev $$0, cfi $$1) {
      hx $$2 = $$1.dm();
      hx $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(and $$0) {
      return 600 + $$0.z.a(6001);
   }
}
