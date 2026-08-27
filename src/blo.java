import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class blo extends bkz<cbj> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbm, aey> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbm.c, ecq.an);
      $$0.put(cbm.d, ecq.ao);
      $$0.put(cbm.e, ecq.ap);
      $$0.put(cbm.f, ecq.aq);
      $$0.put(cbm.g, ecq.ar);
      $$0.put(cbm.h, ecq.as);
      $$0.put(cbm.i, ecq.at);
      $$0.put(cbm.j, ecq.au);
      $$0.put(cbm.k, ecq.av);
      $$0.put(cbm.l, ecq.aw);
      $$0.put(cbm.n, ecq.ax);
      $$0.put(cbm.o, ecq.ay);
      $$0.put(cbm.p, ecq.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public blo(int $$0) {
      super(ImmutableMap.of(bsj.m, bsk.c, bsj.n, bsk.c, bsj.q, bsk.c, bsj.k, bsk.a), $$0);
   }

   protected boolean a(aks $$0, cbj $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aks $$0, cbj $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cbw $$3 = this.c($$1).get();
      $$1.dN().a(bsj.q, $$3);
      blb.a($$1, $$3);
   }

   protected boolean b(aks $$0, cbj $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      cbw $$3 = this.c($$1).get();
      blb.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bji)$$3);
            this.j = true;
         }
      } else {
         blb.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aks $$0, cbj $$1, long $$2) {
      this.i = a($$0);
      $$1.dN().b(bsj.q);
      $$1.dN().b(bsj.m);
      $$1.dN().b(bsj.n);
   }

   private void a(cbj $$0, bji $$1) {
      for (cjh $$3 : this.a($$0)) {
         blb.a($$0, $$3, $$1.dj());
      }
   }

   private List<cjh> a(cbj $$0) {
      if ($$0.m_()) {
         return ImmutableList.of(new cjh(cjk.cP));
      } else {
         cbm $$1 = $$0.go().b();
         if (g.containsKey($$1)) {
            eda $$2 = $$0.dL().n().aH().getLootTable(g.get($$1));
            ecy $$3 = new ecy.a((aks)$$0.dL()).a(efd.f, $$0.dj()).a(efd.a, $$0).a(efc.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cjh(cjk.oH));
         }
      }
   }

   private boolean b(cbj $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cbw> c(cbj $$0) {
      return $$0.dN().c(bsj.k).filter(this::a);
   }

   private boolean a(cbw $$0) {
      return $$0.a(bih.F);
   }

   private boolean a(cbj $$0, cbw $$1) {
      gw $$2 = $$1.dl();
      gw $$3 = $$0.dl();
      return $$3.a($$2, 5.0);
   }

   private static int a(aks $$0) {
      return 600 + $$0.z.a(6001);
   }
}
