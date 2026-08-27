import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class brw extends brh<cih> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cik, ajh> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cik.c, eku.ax);
      $$0.put(cik.d, eku.ay);
      $$0.put(cik.e, eku.az);
      $$0.put(cik.f, eku.aA);
      $$0.put(cik.g, eku.aB);
      $$0.put(cik.h, eku.aC);
      $$0.put(cik.i, eku.aD);
      $$0.put(cik.j, eku.aE);
      $$0.put(cik.k, eku.aF);
      $$0.put(cik.l, eku.aG);
      $$0.put(cik.n, eku.aH);
      $$0.put(cik.o, eku.aI);
      $$0.put(cik.p, eku.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public brw(int $$0) {
      super(ImmutableMap.of(bys.m, byt.c, bys.n, byt.c, bys.q, byt.c, bys.k, byt.a), $$0);
   }

   protected boolean a(apf $$0, cih $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(apf $$0, cih $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      ciu $$3 = this.c($$1).get();
      $$1.dP().a(bys.q, $$3);
      brj.a($$1, $$3);
   }

   protected boolean b(apf $$0, cih $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(apf $$0, cih $$1, long $$2) {
      ciu $$3 = this.c($$1).get();
      brj.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bpp)$$3);
            this.j = true;
         }
      } else {
         brj.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(apf $$0, cih $$1, long $$2) {
      this.i = a($$0);
      $$1.dP().b(bys.q);
      $$1.dP().b(bys.m);
      $$1.dP().b(bys.n);
   }

   private void a(cih $$0, bpp $$1) {
      for (cqm $$3 : this.a($$0)) {
         brj.a($$0, $$3, $$1.dk());
      }
   }

   private List<cqm> a(cih $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cqm(cqp.dk));
      } else {
         cik $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            ele $$2 = $$0.dM().o().aM().getLootTable(g.get($$1));
            elc $$3 = new elc.a((apf)$$0.dM()).a(enh.f, $$0.dk()).a(enh.a, $$0).a(eng.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cqm(cqp.pu));
         }
      }
   }

   private boolean b(cih $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<ciu> c(cih $$0) {
      return $$0.dP().c(bys.k).filter(this::a);
   }

   private boolean a(ciu $$0) {
      return $$0.a(bom.F);
   }

   private boolean a(cih $$0, ciu $$1) {
      ib $$2 = $$1.dm();
      ib $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(apf $$0) {
      return 600 + $$0.z.a(6001);
   }
}
