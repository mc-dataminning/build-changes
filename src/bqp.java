import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bqp extends bqa<cgy> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<chb, aiy> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chb.c, eja.ax);
      $$0.put(chb.d, eja.ay);
      $$0.put(chb.e, eja.az);
      $$0.put(chb.f, eja.aA);
      $$0.put(chb.g, eja.aB);
      $$0.put(chb.h, eja.aC);
      $$0.put(chb.i, eja.aD);
      $$0.put(chb.j, eja.aE);
      $$0.put(chb.k, eja.aF);
      $$0.put(chb.l, eja.aG);
      $$0.put(chb.n, eja.aH);
      $$0.put(chb.o, eja.aI);
      $$0.put(chb.p, eja.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bqp(int $$0) {
      super(ImmutableMap.of(bxl.m, bxm.c, bxl.n, bxm.c, bxl.q, bxm.c, bxl.k, bxm.a), $$0);
   }

   protected boolean a(aow $$0, cgy $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aow $$0, cgy $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      chl $$3 = this.c($$1).get();
      $$1.dO().a(bxl.q, $$3);
      bqc.a($$1, $$3);
   }

   protected boolean b(aow $$0, cgy $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aow $$0, cgy $$1, long $$2) {
      chl $$3 = this.c($$1).get();
      bqc.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (boi)$$3);
            this.j = true;
         }
      } else {
         bqc.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aow $$0, cgy $$1, long $$2) {
      this.i = a($$0);
      $$1.dO().b(bxl.q);
      $$1.dO().b(bxl.m);
      $$1.dO().b(bxl.n);
   }

   private void a(cgy $$0, boi $$1) {
      for (cpd $$3 : this.a($$0)) {
         bqc.a($$0, $$3, $$1.dk());
      }
   }

   private List<cpd> a(cgy $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cpd(cpg.dk));
      } else {
         chb $$1 = $$0.gr().b();
         if (g.containsKey($$1)) {
            ejk $$2 = $$0.dM().o().aL().getLootTable(g.get($$1));
            eji $$3 = new eji.a((aow)$$0.dM()).a(eln.f, $$0.dk()).a(eln.a, $$0).a(elm.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cpd(cpg.pu));
         }
      }
   }

   private boolean b(cgy $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<chl> c(cgy $$0) {
      return $$0.dO().c(bxl.k).filter(this::a);
   }

   private boolean a(chl $$0) {
      return $$0.a(bnf.F);
   }

   private boolean a(cgy $$0, chl $$1) {
      hz $$2 = $$1.dm();
      hz $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(aow $$0) {
      return 600 + $$0.z.a(6001);
   }
}
