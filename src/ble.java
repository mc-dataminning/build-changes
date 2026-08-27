import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ble extends bkp<caz> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbc, aer> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbc.c, ece.an);
      $$0.put(cbc.d, ece.ao);
      $$0.put(cbc.e, ece.ap);
      $$0.put(cbc.f, ece.aq);
      $$0.put(cbc.g, ece.ar);
      $$0.put(cbc.h, ece.as);
      $$0.put(cbc.i, ece.at);
      $$0.put(cbc.j, ece.au);
      $$0.put(cbc.k, ece.av);
      $$0.put(cbc.l, ece.aw);
      $$0.put(cbc.n, ece.ax);
      $$0.put(cbc.o, ece.ay);
      $$0.put(cbc.p, ece.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public ble(int $$0) {
      super(ImmutableMap.of(brz.m, bsa.c, brz.n, bsa.c, brz.q, bsa.c, brz.k, bsa.a), $$0);
   }

   protected boolean a(akk $$0, caz $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(akk $$0, caz $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cbm $$3 = this.c($$1).get();
      $$1.dM().a(brz.q, $$3);
      bkr.a($$1, $$3);
   }

   protected boolean b(akk $$0, caz $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      cbm $$3 = this.c($$1).get();
      bkr.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (biy)$$3);
            this.j = true;
         }
      } else {
         bkr.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(akk $$0, caz $$1, long $$2) {
      this.i = a($$0);
      $$1.dM().b(brz.q);
      $$1.dM().b(brz.m);
      $$1.dM().b(brz.n);
   }

   private void a(caz $$0, biy $$1) {
      for (cix $$3 : this.a($$0)) {
         bkr.a($$0, $$3, $$1.di());
      }
   }

   private List<cix> a(caz $$0) {
      if ($$0.i_()) {
         return ImmutableList.of(new cix(cja.cP));
      } else {
         cbc $$1 = $$0.gl().b();
         if (g.containsKey($$1)) {
            eco $$2 = $$0.dK().n().aH().getLootTable(g.get($$1));
            ecm $$3 = new ecm.a((akk)$$0.dK()).a(eer.f, $$0.di()).a(eer.a, $$0).a(eeq.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cix(cja.oH));
         }
      }
   }

   private boolean b(caz $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cbm> c(caz $$0) {
      return $$0.dM().c(brz.k).filter(this::a);
   }

   private boolean a(cbm $$0) {
      return $$0.a(bhx.F);
   }

   private boolean a(caz $$0, cbm $$1) {
      gu $$2 = $$1.dk();
      gu $$3 = $$0.dk();
      return $$3.a($$2, 5.0);
   }

   private static int a(akk $$0) {
      return 600 + $$0.z.a(6001);
   }
}
