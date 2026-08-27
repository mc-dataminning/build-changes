import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bre extends bqp<chn> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<chq, ajc> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(chq.c, ejw.ax);
      $$0.put(chq.d, ejw.ay);
      $$0.put(chq.e, ejw.az);
      $$0.put(chq.f, ejw.aA);
      $$0.put(chq.g, ejw.aB);
      $$0.put(chq.h, ejw.aC);
      $$0.put(chq.i, ejw.aD);
      $$0.put(chq.j, ejw.aE);
      $$0.put(chq.k, ejw.aF);
      $$0.put(chq.l, ejw.aG);
      $$0.put(chq.n, ejw.aH);
      $$0.put(chq.o, ejw.aI);
      $$0.put(chq.p, ejw.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bre(int $$0) {
      super(ImmutableMap.of(bya.m, byb.c, bya.n, byb.c, bya.q, byb.c, bya.k, byb.a), $$0);
   }

   protected boolean a(apa $$0, chn $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(apa $$0, chn $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cia $$3 = this.c($$1).get();
      $$1.dM().a(bya.q, $$3);
      bqr.a($$1, $$3);
   }

   protected boolean b(apa $$0, chn $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      cia $$3 = this.c($$1).get();
      bqr.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (box)$$3);
            this.j = true;
         }
      } else {
         bqr.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(apa $$0, chn $$1, long $$2) {
      this.i = a($$0);
      $$1.dM().b(bya.q);
      $$1.dM().b(bya.m);
      $$1.dM().b(bya.n);
   }

   private void a(chn $$0, box $$1) {
      for (cpq $$3 : this.a($$0)) {
         bqr.a($$0, $$3, $$1.dh());
      }
   }

   private List<cpq> a(chn $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cpq(cpt.dk));
      } else {
         chq $$1 = $$0.gw().b();
         if (g.containsKey($$1)) {
            ekg $$2 = $$0.dJ().o().aM().getLootTable(g.get($$1));
            eke $$3 = new eke.a((apa)$$0.dJ()).a(emj.f, $$0.dh()).a(emj.a, $$0).a(emi.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cpq(cpt.pu));
         }
      }
   }

   private boolean b(chn $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cia> c(chn $$0) {
      return $$0.dM().c(bya.k).filter(this::a);
   }

   private boolean a(cia $$0) {
      return $$0.a(bnu.F);
   }

   private boolean a(chn $$0, cia $$1) {
      ib $$2 = $$1.dj();
      ib $$3 = $$0.dj();
      return $$3.a($$2, 5.0);
   }

   private static int a(apa $$0) {
      return 600 + $$0.z.a(6001);
   }
}
