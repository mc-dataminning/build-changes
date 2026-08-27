import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bol extends bnw<ceo> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cer, ahd> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cer.c, egn.ax);
      $$0.put(cer.d, egn.ay);
      $$0.put(cer.e, egn.az);
      $$0.put(cer.f, egn.aA);
      $$0.put(cer.g, egn.aB);
      $$0.put(cer.h, egn.aC);
      $$0.put(cer.i, egn.aD);
      $$0.put(cer.j, egn.aE);
      $$0.put(cer.k, egn.aF);
      $$0.put(cer.l, egn.aG);
      $$0.put(cer.n, egn.aH);
      $$0.put(cer.o, egn.aI);
      $$0.put(cer.p, egn.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bol(int $$0) {
      super(ImmutableMap.of(bvh.m, bvi.c, bvh.n, bvi.c, bvh.q, bvi.c, bvh.k, bvi.a), $$0);
   }

   protected boolean a(amz $$0, ceo $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(amz $$0, ceo $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cfb $$3 = this.c($$1).get();
      $$1.dO().a(bvh.q, $$3);
      bny.a($$1, $$3);
   }

   protected boolean b(amz $$0, ceo $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      cfb $$3 = this.c($$1).get();
      bny.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bmf)$$3);
            this.j = true;
         }
      } else {
         bny.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(amz $$0, ceo $$1, long $$2) {
      this.i = a($$0);
      $$1.dO().b(bvh.q);
      $$1.dO().b(bvh.m);
      $$1.dO().b(bvh.n);
   }

   private void a(ceo $$0, bmf $$1) {
      for (cmr $$3 : this.a($$0)) {
         bny.a($$0, $$3, $$1.dk());
      }
   }

   private List<cmr> a(ceo $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cmr(cmu.dk));
      } else {
         cer $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            egx $$2 = $$0.dM().o().aJ().getLootTable(g.get($$1));
            egv $$3 = new egv.a((amz)$$0.dM()).a(eja.f, $$0.dk()).a(eja.a, $$0).a(eiz.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cmr(cmu.ps));
         }
      }
   }

   private boolean b(ceo $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cfb> c(ceo $$0) {
      return $$0.dO().c(bvh.k).filter(this::a);
   }

   private boolean a(cfb $$0) {
      return $$0.a(ble.F);
   }

   private boolean a(ceo $$0, cfb $$1) {
      hx $$2 = $$1.dm();
      hx $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(amz $$0) {
      return 600 + $$0.z.a(6001);
   }
}
