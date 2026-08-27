import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bld extends bko<cay> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbb, aep> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbb.c, ecd.an);
      $$0.put(cbb.d, ecd.ao);
      $$0.put(cbb.e, ecd.ap);
      $$0.put(cbb.f, ecd.aq);
      $$0.put(cbb.g, ecd.ar);
      $$0.put(cbb.h, ecd.as);
      $$0.put(cbb.i, ecd.at);
      $$0.put(cbb.j, ecd.au);
      $$0.put(cbb.k, ecd.av);
      $$0.put(cbb.l, ecd.aw);
      $$0.put(cbb.n, ecd.ax);
      $$0.put(cbb.o, ecd.ay);
      $$0.put(cbb.p, ecd.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bld(int $$0) {
      super(ImmutableMap.of(bry.m, brz.c, bry.n, brz.c, bry.q, brz.c, bry.k, brz.a), $$0);
   }

   protected boolean a(aki $$0, cay $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aki $$0, cay $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cbl $$3 = this.c($$1).get();
      $$1.dM().a(bry.q, $$3);
      bkq.a($$1, $$3);
   }

   protected boolean b(aki $$0, cay $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      cbl $$3 = this.c($$1).get();
      bkq.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (biw)$$3);
            this.j = true;
         }
      } else {
         bkq.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aki $$0, cay $$1, long $$2) {
      this.i = a($$0);
      $$1.dM().b(bry.q);
      $$1.dM().b(bry.m);
      $$1.dM().b(bry.n);
   }

   private void a(cay $$0, biw $$1) {
      for (ciw $$3 : this.a($$0)) {
         bkq.a($$0, $$3, $$1.di());
      }
   }

   private List<ciw> a(cay $$0) {
      if ($$0.i_()) {
         return ImmutableList.of(new ciw(ciz.cP));
      } else {
         cbb $$1 = $$0.gk().b();
         if (g.containsKey($$1)) {
            ecp $$2 = $$0.dK().n().aH().getLootTable(g.get($$1));
            ecn $$3 = new ecn.a((aki)$$0.dK()).a(eet.f, $$0.di()).a(eet.a, $$0).a(ees.h);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new ciw(ciz.oH));
         }
      }
   }

   private boolean b(cay $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cbl> c(cay $$0) {
      return $$0.dM().c(bry.k).filter(this::a);
   }

   private boolean a(cbl $$0) {
      return $$0.a(bhv.F);
   }

   private boolean a(cay $$0, cbl $$1) {
      gv $$2 = $$1.dk();
      gv $$3 = $$0.dk();
      return $$3.a($$2, 5.0);
   }

   private static int a(aki $$0) {
      return 600 + $$0.z.a(6001);
   }
}
