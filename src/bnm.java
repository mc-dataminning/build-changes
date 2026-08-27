import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bnm extends bmx<cdh> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cdk, agi> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cdk.c, eev.an);
      $$0.put(cdk.d, eev.ao);
      $$0.put(cdk.e, eev.ap);
      $$0.put(cdk.f, eev.aq);
      $$0.put(cdk.g, eev.ar);
      $$0.put(cdk.h, eev.as);
      $$0.put(cdk.i, eev.at);
      $$0.put(cdk.j, eev.au);
      $$0.put(cdk.k, eev.av);
      $$0.put(cdk.l, eev.aw);
      $$0.put(cdk.n, eev.ax);
      $$0.put(cdk.o, eev.ay);
      $$0.put(cdk.p, eev.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bnm(int $$0) {
      super(ImmutableMap.of(buh.m, bui.c, buh.n, bui.c, buh.q, bui.c, buh.k, bui.a), $$0);
   }

   protected boolean a(ame $$0, cdh $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(ame $$0, cdh $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cdu $$3 = this.c($$1).get();
      $$1.dP().a(buh.q, $$3);
      bmz.a($$1, $$3);
   }

   protected boolean b(ame $$0, cdh $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      cdu $$3 = this.c($$1).get();
      bmz.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (blg)$$3);
            this.j = true;
         }
      } else {
         bmz.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(ame $$0, cdh $$1, long $$2) {
      this.i = a($$0);
      $$1.dP().b(buh.q);
      $$1.dP().b(buh.m);
      $$1.dP().b(buh.n);
   }

   private void a(cdh $$0, blg $$1) {
      for (clj $$3 : this.a($$0)) {
         bmz.a($$0, $$3, $$1.dl());
      }
   }

   private List<clj> a(cdh $$0) {
      if ($$0.n_()) {
         return ImmutableList.of(new clj(clm.dk));
      } else {
         cdk $$1 = $$0.gq().b();
         if (g.containsKey($$1)) {
            eff $$2 = $$0.dN().n().aJ().getLootTable(g.get($$1));
            efd $$3 = new efd.a((ame)$$0.dN()).a(ehi.f, $$0.dl()).a(ehi.a, $$0).a(ehh.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new clj(clm.ps));
         }
      }
   }

   private boolean b(cdh $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cdu> c(cdh $$0) {
      return $$0.dP().c(buh.k).filter(this::a);
   }

   private boolean a(cdu $$0) {
      return $$0.a(bkf.F);
   }

   private boolean a(cdh $$0, cdu $$1) {
      ht $$2 = $$1.dn();
      ht $$3 = $$0.dn();
      return $$3.a($$2, 5.0);
   }

   private static int a(ame $$0) {
      return 600 + $$0.z.a(6001);
   }
}
