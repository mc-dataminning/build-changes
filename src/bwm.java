import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bwm extends bvx<cnc> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cnf, ala<esy>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cnf.c, esp.at);
      $$0.put(cnf.d, esp.au);
      $$0.put(cnf.e, esp.av);
      $$0.put(cnf.f, esp.aw);
      $$0.put(cnf.g, esp.ax);
      $$0.put(cnf.h, esp.ay);
      $$0.put(cnf.i, esp.az);
      $$0.put(cnf.j, esp.aA);
      $$0.put(cnf.k, esp.aB);
      $$0.put(cnf.l, esp.aC);
      $$0.put(cnf.n, esp.aD);
      $$0.put(cnf.o, esp.aE);
      $$0.put(cnf.p, esp.aF);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bwm(int $$0) {
      super(ImmutableMap.of(cdi.m, cdj.c, cdi.n, cdj.c, cdi.q, cdj.c, cdi.k, cdj.a), $$0);
   }

   protected boolean a(arg $$0, cnc $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arg $$0, cnc $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cnp $$3 = this.c($$1).get();
      $$1.dX().a(cdi.q, $$3);
      bvz.a($$1, $$3);
   }

   protected boolean b(arg $$0, cnc $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      cnp $$3 = this.c($$1).get();
      bvz.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (buf)$$3);
            this.j = true;
         }
      } else {
         bvz.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arg $$0, cnc $$1, long $$2) {
      this.i = a($$0);
      $$1.dX().b(cdi.q);
      $$1.dX().b(cdi.m);
      $$1.dX().b(cdi.n);
   }

   private void a(cnc $$0, buf $$1) {
      for (cvl $$3 : this.a($$0)) {
         bvz.a($$0, $$3, $$1.dq());
      }
   }

   private List<cvl> a(cnc $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cvl(cvo.dl));
      } else {
         cnf $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            esy $$2 = $$0.dS().o().bd().b(g.get($$1));
            esw $$3 = new esw.a((arg)$$0.dS()).a(evp.f, $$0.dq()).a(evp.a, $$0).a(evo.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cvl(cvo.pw));
         }
      }
   }

   private boolean b(cnc $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cnp> c(cnc $$0) {
      return $$0.dX().c(cdi.k).filter(this::a);
   }

   private boolean a(cnp $$0) {
      return $$0.b(bss.F);
   }

   private boolean a(cnc $$0, cnp $$1) {
      je $$2 = $$1.ds();
      je $$3 = $$0.ds();
      return $$3.a($$2, 5.0);
   }

   private static int a(arg $$0) {
      return 600 + $$0.z.a(6001);
   }
}
