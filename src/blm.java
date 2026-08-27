import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class blm extends bkx<cbh> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbk, aew> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbk.c, eco.an);
      $$0.put(cbk.d, eco.ao);
      $$0.put(cbk.e, eco.ap);
      $$0.put(cbk.f, eco.aq);
      $$0.put(cbk.g, eco.ar);
      $$0.put(cbk.h, eco.as);
      $$0.put(cbk.i, eco.at);
      $$0.put(cbk.j, eco.au);
      $$0.put(cbk.k, eco.av);
      $$0.put(cbk.l, eco.aw);
      $$0.put(cbk.n, eco.ax);
      $$0.put(cbk.o, eco.ay);
      $$0.put(cbk.p, eco.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public blm(int $$0) {
      super(ImmutableMap.of(bsh.m, bsi.c, bsh.n, bsi.c, bsh.q, bsi.c, bsh.k, bsi.a), $$0);
   }

   protected boolean a(akq $$0, cbh $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(akq $$0, cbh $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cbu $$3 = this.c($$1).get();
      $$1.dN().a(bsh.q, $$3);
      bkz.a($$1, $$3);
   }

   protected boolean b(akq $$0, cbh $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(akq $$0, cbh $$1, long $$2) {
      cbu $$3 = this.c($$1).get();
      bkz.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bjg)$$3);
            this.j = true;
         }
      } else {
         bkz.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(akq $$0, cbh $$1, long $$2) {
      this.i = a($$0);
      $$1.dN().b(bsh.q);
      $$1.dN().b(bsh.m);
      $$1.dN().b(bsh.n);
   }

   private void a(cbh $$0, bjg $$1) {
      for (cjf $$3 : this.a($$0)) {
         bkz.a($$0, $$3, $$1.dj());
      }
   }

   private List<cjf> a(cbh $$0) {
      if ($$0.m_()) {
         return ImmutableList.of(new cjf(cji.cP));
      } else {
         cbk $$1 = $$0.go().b();
         if (g.containsKey($$1)) {
            ecy $$2 = $$0.dL().n().aH().getLootTable(g.get($$1));
            ecw $$3 = new ecw.a((akq)$$0.dL()).a(efb.f, $$0.dj()).a(efb.a, $$0).a(efa.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cjf(cji.oH));
         }
      }
   }

   private boolean b(cbh $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cbu> c(cbh $$0) {
      return $$0.dN().c(bsh.k).filter(this::a);
   }

   private boolean a(cbu $$0) {
      return $$0.a(bif.F);
   }

   private boolean a(cbh $$0, cbu $$1) {
      gw $$2 = $$1.dl();
      gw $$3 = $$0.dl();
      return $$3.a($$2, 5.0);
   }

   private static int a(akq $$0) {
      return 600 + $$0.z.a(6001);
   }
}
