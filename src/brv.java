import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class brv extends brg<cif> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cii, ajh> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cii.c, eks.ax);
      $$0.put(cii.d, eks.ay);
      $$0.put(cii.e, eks.az);
      $$0.put(cii.f, eks.aA);
      $$0.put(cii.g, eks.aB);
      $$0.put(cii.h, eks.aC);
      $$0.put(cii.i, eks.aD);
      $$0.put(cii.j, eks.aE);
      $$0.put(cii.k, eks.aF);
      $$0.put(cii.l, eks.aG);
      $$0.put(cii.n, eks.aH);
      $$0.put(cii.o, eks.aI);
      $$0.put(cii.p, eks.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public brv(int $$0) {
      super(ImmutableMap.of(byr.m, bys.c, byr.n, bys.c, byr.q, bys.c, byr.k, bys.a), $$0);
   }

   protected boolean a(apf $$0, cif $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(apf $$0, cif $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cis $$3 = this.c($$1).get();
      $$1.dP().a(byr.q, $$3);
      bri.a($$1, $$3);
   }

   protected boolean b(apf $$0, cif $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(apf $$0, cif $$1, long $$2) {
      cis $$3 = this.c($$1).get();
      bri.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bpo)$$3);
            this.j = true;
         }
      } else {
         bri.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(apf $$0, cif $$1, long $$2) {
      this.i = a($$0);
      $$1.dP().b(byr.q);
      $$1.dP().b(byr.m);
      $$1.dP().b(byr.n);
   }

   private void a(cif $$0, bpo $$1) {
      for (cqk $$3 : this.a($$0)) {
         bri.a($$0, $$3, $$1.dk());
      }
   }

   private List<cqk> a(cif $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cqk(cqn.dk));
      } else {
         cii $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            elc $$2 = $$0.dM().o().aM().getLootTable(g.get($$1));
            ela $$3 = new ela.a((apf)$$0.dM()).a(enf.f, $$0.dk()).a(enf.a, $$0).a(ene.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cqk(cqn.pu));
         }
      }
   }

   private boolean b(cif $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cis> c(cif $$0) {
      return $$0.dP().c(byr.k).filter(this::a);
   }

   private boolean a(cis $$0) {
      return $$0.a(bol.F);
   }

   private boolean a(cif $$0, cis $$1) {
      ib $$2 = $$1.dm();
      ib $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(apf $$0) {
      return 600 + $$0.z.a(6001);
   }
}
