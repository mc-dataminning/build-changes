import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bsv extends bsg<cjg> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cjj, ajt> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cjj.c, emz.ax);
      $$0.put(cjj.d, emz.ay);
      $$0.put(cjj.e, emz.az);
      $$0.put(cjj.f, emz.aA);
      $$0.put(cjj.g, emz.aB);
      $$0.put(cjj.h, emz.aC);
      $$0.put(cjj.i, emz.aD);
      $$0.put(cjj.j, emz.aE);
      $$0.put(cjj.k, emz.aF);
      $$0.put(cjj.l, emz.aG);
      $$0.put(cjj.n, emz.aH);
      $$0.put(cjj.o, emz.aI);
      $$0.put(cjj.p, emz.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bsv(int $$0) {
      super(ImmutableMap.of(bzr.m, bzs.c, bzr.n, bzs.c, bzr.q, bzs.c, bzr.k, bzs.a), $$0);
   }

   protected boolean a(aps $$0, cjg $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aps $$0, cjg $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cjt $$3 = this.c($$1).get();
      $$1.dP().a(bzr.q, $$3);
      bsi.a($$1, $$3);
   }

   protected boolean b(aps $$0, cjg $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      cjt $$3 = this.c($$1).get();
      bsi.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bqo)$$3);
            this.j = true;
         }
      } else {
         bsi.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aps $$0, cjg $$1, long $$2) {
      this.i = a($$0);
      $$1.dP().b(bzr.q);
      $$1.dP().b(bzr.m);
      $$1.dP().b(bzr.n);
   }

   private void a(cjg $$0, bqo $$1) {
      for (crj $$3 : this.a($$0)) {
         bsi.a($$0, $$3, $$1.dk());
      }
   }

   private List<crj> a(cjg $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new crj(crm.dk));
      } else {
         cjj $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            enj $$2 = $$0.dM().o().aM().getLootTable(g.get($$1));
            enh $$3 = new enh.a((aps)$$0.dM()).a(epo.f, $$0.dk()).a(epo.a, $$0).a(epn.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new crj(crm.pu));
         }
      }
   }

   private boolean b(cjg $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cjt> c(cjg $$0) {
      return $$0.dP().c(bzr.k).filter(this::a);
   }

   private boolean a(cjt $$0) {
      return $$0.b(bpj.F);
   }

   private boolean a(cjg $$0, cjt $$1) {
      ib $$2 = $$1.dm();
      ib $$3 = $$0.dm();
      return $$3.a($$2, 5.0);
   }

   private static int a(aps $$0) {
      return 600 + $$0.z.a(6001);
   }
}
