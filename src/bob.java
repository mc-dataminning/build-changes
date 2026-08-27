import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bob extends bnm<cee> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<ceh, agt> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ceh.c, egc.ax);
      $$0.put(ceh.d, egc.ay);
      $$0.put(ceh.e, egc.az);
      $$0.put(ceh.f, egc.aA);
      $$0.put(ceh.g, egc.aB);
      $$0.put(ceh.h, egc.aC);
      $$0.put(ceh.i, egc.aD);
      $$0.put(ceh.j, egc.aE);
      $$0.put(ceh.k, egc.aF);
      $$0.put(ceh.l, egc.aG);
      $$0.put(ceh.n, egc.aH);
      $$0.put(ceh.o, egc.aI);
      $$0.put(ceh.p, egc.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bob(int $$0) {
      super(ImmutableMap.of(bux.m, buy.c, bux.n, buy.c, bux.q, buy.c, bux.k, buy.a), $$0);
   }

   protected boolean a(amp $$0, cee $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(amp $$0, cee $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cer $$3 = this.c($$1).get();
      $$1.dO().a(bux.q, $$3);
      bno.a($$1, $$3);
   }

   protected boolean b(amp $$0, cee $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      cer $$3 = this.c($$1).get();
      bno.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (blv)$$3);
            this.j = true;
         }
      } else {
         bno.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(amp $$0, cee $$1, long $$2) {
      this.i = a($$0);
      $$1.dO().b(bux.q);
      $$1.dO().b(bux.m);
      $$1.dO().b(bux.n);
   }

   private void a(cee $$0, blv $$1) {
      for (cmh $$3 : this.a($$0)) {
         bno.a($$0, $$3, $$1.dk());
      }
   }

   private List<cmh> a(cee $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cmh(cmk.dk));
      } else {
         ceh $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            egm $$2 = $$0.dM().n().aJ().getLootTable(g.get($$1));
            egk $$3 = new egk.a((amp)$$0.dM()).a(eip.f, $$0.dk()).a(eip.a, $$0).a(eio.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cmh(cmk.ps));
         }
      }
   }

   private boolean b(cee $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cer> c(cee $$0) {
      return $$0.dO().c(bux.k).filter(this::a);
   }

   private boolean a(cer $$0) {
      return $$0.a(bku.F);
   }

   private boolean a(cee $$0, cer $$1) {
      hv $$2 = $$1.dm();
      hv $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(amp $$0) {
      return 600 + $$0.z.a(6001);
   }
}
