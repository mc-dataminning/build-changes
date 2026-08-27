import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bou extends bof<cfd> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cfg, ahh> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cfg.c, ehd.ax);
      $$0.put(cfg.d, ehd.ay);
      $$0.put(cfg.e, ehd.az);
      $$0.put(cfg.f, ehd.aA);
      $$0.put(cfg.g, ehd.aB);
      $$0.put(cfg.h, ehd.aC);
      $$0.put(cfg.i, ehd.aD);
      $$0.put(cfg.j, ehd.aE);
      $$0.put(cfg.k, ehd.aF);
      $$0.put(cfg.l, ehd.aG);
      $$0.put(cfg.n, ehd.aH);
      $$0.put(cfg.o, ehd.aI);
      $$0.put(cfg.p, ehd.aJ);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bou(int $$0) {
      super(ImmutableMap.of(bvq.m, bvr.c, bvq.n, bvr.c, bvq.q, bvr.c, bvq.k, bvr.a), $$0);
   }

   protected boolean a(ane $$0, cfd $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ane $$0, cfd $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cfq $$3 = this.c($$1).get();
      $$1.dN().a(bvq.q, $$3);
      boh.a($$1, $$3);
   }

   protected boolean b(ane $$0, cfd $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      cfq $$3 = this.c($$1).get();
      boh.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bmo)$$3);
            this.j = true;
         }
      } else {
         boh.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ane $$0, cfd $$1, long $$2) {
      this.i = a($$0);
      $$1.dN().b(bvq.q);
      $$1.dN().b(bvq.m);
      $$1.dN().b(bvq.n);
   }

   private void a(cfd $$0, bmo $$1) {
      for (cng $$3 : this.a($$0)) {
         boh.a($$0, $$3, $$1.dj());
      }
   }

   private List<cng> a(cfd $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cng(cnj.dk));
      } else {
         cfg $$1 = $$0.gq().b();
         if (g.containsKey($$1)) {
            ehn $$2 = $$0.dL().o().aJ().getLootTable(g.get($$1));
            ehl $$3 = new ehl.a((ane)$$0.dL()).a(ejq.f, $$0.dj()).a(ejq.a, $$0).a(ejp.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cng(cnj.pu));
         }
      }
   }

   private boolean b(cfd $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cfq> c(cfd $$0) {
      return $$0.dN().c(bvq.k).filter(this::a);
   }

   private boolean a(cfq $$0) {
      return $$0.a(bll.F);
   }

   private boolean a(cfd $$0, cfq $$1) {
      hx $$2 = $$1.dl();
      hx $$3 = $$0.dl();
      return $$3.a($$2, 5.0);
   }

   private static int a(ane $$0) {
      return 600 + $$0.z.a(6001);
   }
}
