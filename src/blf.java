import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class blf extends bkq<cba> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbd, aer> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbd.c, ecf.an);
      $$0.put(cbd.d, ecf.ao);
      $$0.put(cbd.e, ecf.ap);
      $$0.put(cbd.f, ecf.aq);
      $$0.put(cbd.g, ecf.ar);
      $$0.put(cbd.h, ecf.as);
      $$0.put(cbd.i, ecf.at);
      $$0.put(cbd.j, ecf.au);
      $$0.put(cbd.k, ecf.av);
      $$0.put(cbd.l, ecf.aw);
      $$0.put(cbd.n, ecf.ax);
      $$0.put(cbd.o, ecf.ay);
      $$0.put(cbd.p, ecf.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public blf(int $$0) {
      super(ImmutableMap.of(bsa.m, bsb.c, bsa.n, bsb.c, bsa.q, bsb.c, bsa.k, bsb.a), $$0);
   }

   protected boolean a(akk $$0, cba $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(akk $$0, cba $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cbn $$3 = this.c($$1).get();
      $$1.dM().a(bsa.q, $$3);
      bks.a($$1, $$3);
   }

   protected boolean b(akk $$0, cba $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      cbn $$3 = this.c($$1).get();
      bks.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (biy)$$3);
            this.j = true;
         }
      } else {
         bks.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(akk $$0, cba $$1, long $$2) {
      this.i = a($$0);
      $$1.dM().b(bsa.q);
      $$1.dM().b(bsa.m);
      $$1.dM().b(bsa.n);
   }

   private void a(cba $$0, biy $$1) {
      for (ciy $$3 : this.a($$0)) {
         bks.a($$0, $$3, $$1.di());
      }
   }

   private List<ciy> a(cba $$0) {
      if ($$0.i_()) {
         return ImmutableList.of(new ciy(cjb.cP));
      } else {
         cbd $$1 = $$0.gk().b();
         if (g.containsKey($$1)) {
            ecp $$2 = $$0.dK().n().aH().getLootTable(g.get($$1));
            ecn $$3 = new ecn.a((akk)$$0.dK()).a(ees.f, $$0.di()).a(ees.a, $$0).a(eer.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new ciy(cjb.oH));
         }
      }
   }

   private boolean b(cba $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cbn> c(cba $$0) {
      return $$0.dM().c(bsa.k).filter(this::a);
   }

   private boolean a(cbn $$0) {
      return $$0.a(bhx.F);
   }

   private boolean a(cba $$0, cbn $$1) {
      gu $$2 = $$1.dk();
      gu $$3 = $$0.dk();
      return $$3.a($$2, 5.0);
   }

   private static int a(akk $$0) {
      return 600 + $$0.z.a(6001);
   }
}
