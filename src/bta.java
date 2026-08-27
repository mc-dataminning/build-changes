import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bta extends bsl<cjn> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cjq, ajv> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjq.c, eni.ax);
      $$0.put(cjq.d, eni.ay);
      $$0.put(cjq.e, eni.az);
      $$0.put(cjq.f, eni.aA);
      $$0.put(cjq.g, eni.aB);
      $$0.put(cjq.h, eni.aC);
      $$0.put(cjq.i, eni.aD);
      $$0.put(cjq.j, eni.aE);
      $$0.put(cjq.k, eni.aF);
      $$0.put(cjq.l, eni.aG);
      $$0.put(cjq.n, eni.aH);
      $$0.put(cjq.o, eni.aI);
      $$0.put(cjq.p, eni.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bta(int $$0) {
      super(ImmutableMap.of(bzw.m, bzx.c, bzw.n, bzx.c, bzw.q, bzx.c, bzw.k, bzx.a), $$0);
   }

   protected boolean a(apu $$0, cjn $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(apu $$0, cjn $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cka $$3 = this.c($$1).get();
      $$1.dP().a(bzw.q, $$3);
      bsn.a($$1, $$3);
   }

   protected boolean b(apu $$0, cjn $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      cka $$3 = this.c($$1).get();
      bsn.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bqt)$$3);
            this.j = true;
         }
      } else {
         bsn.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(apu $$0, cjn $$1, long $$2) {
      this.i = a($$0);
      $$1.dP().b(bzw.q);
      $$1.dP().b(bzw.m);
      $$1.dP().b(bzw.n);
   }

   private void a(cjn $$0, bqt $$1) {
      for (crs $$3 : this.a($$0)) {
         bsn.a($$0, $$3, $$1.dk());
      }
   }

   private List<crs> a(cjn $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new crs(crv.dk));
      } else {
         cjq $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            ens $$2 = $$0.dM().o().aM().getLootTable(g.get($$1));
            enq $$3 = new enq.a((apu)$$0.dM()).a(epx.f, $$0.dk()).a(epx.a, $$0).a(epw.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new crs(crv.pu));
         }
      }
   }

   private boolean b(cjn $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cka> c(cjn $$0) {
      return $$0.dP().c(bzw.k).filter(this::a);
   }

   private boolean a(cka $$0) {
      return $$0.b(bpo.F);
   }

   private boolean a(cjn $$0, cka $$1) {
      id $$2 = $$1.dm();
      id $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(apu $$0) {
      return 600 + $$0.z.a(6001);
   }
}
