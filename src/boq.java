import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class boq extends bob<ceu> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cex, ahg> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cex.c, egt.ax);
      $$0.put(cex.d, egt.ay);
      $$0.put(cex.e, egt.az);
      $$0.put(cex.f, egt.aA);
      $$0.put(cex.g, egt.aB);
      $$0.put(cex.h, egt.aC);
      $$0.put(cex.i, egt.aD);
      $$0.put(cex.j, egt.aE);
      $$0.put(cex.k, egt.aF);
      $$0.put(cex.l, egt.aG);
      $$0.put(cex.n, egt.aH);
      $$0.put(cex.o, egt.aI);
      $$0.put(cex.p, egt.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public boq(int $$0) {
      super(ImmutableMap.of(bvm.m, bvn.c, bvm.n, bvn.c, bvm.q, bvn.c, bvm.k, bvn.a), $$0);
   }

   protected boolean a(and $$0, ceu $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(and $$0, ceu $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cfh $$3 = this.c($$1).get();
      $$1.dO().a(bvm.q, $$3);
      bod.a($$1, $$3);
   }

   protected boolean b(and $$0, ceu $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      cfh $$3 = this.c($$1).get();
      bod.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bmk)$$3);
            this.j = true;
         }
      } else {
         bod.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(and $$0, ceu $$1, long $$2) {
      this.i = a($$0);
      $$1.dO().b(bvm.q);
      $$1.dO().b(bvm.m);
      $$1.dO().b(bvm.n);
   }

   private void a(ceu $$0, bmk $$1) {
      for (cmx $$3 : this.a($$0)) {
         bod.a($$0, $$3, $$1.dk());
      }
   }

   private List<cmx> a(ceu $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cmx(cna.dk));
      } else {
         cex $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            ehd $$2 = $$0.dM().o().aJ().getLootTable(g.get($$1));
            ehb $$3 = new ehb.a((and)$$0.dM()).a(ejg.f, $$0.dk()).a(ejg.a, $$0).a(ejf.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cmx(cna.ps));
         }
      }
   }

   private boolean b(ceu $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cfh> c(ceu $$0) {
      return $$0.dO().c(bvm.k).filter(this::a);
   }

   private boolean a(cfh $$0) {
      return $$0.a(blj.F);
   }

   private boolean a(ceu $$0, cfh $$1) {
      hx $$2 = $$1.dm();
      hx $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(and $$0) {
      return 600 + $$0.z.a(6001);
   }
}
