import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bls extends bld<cbn> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cbq, aez> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cbq.c, eci.an);
      $$0.put(cbq.d, eci.ao);
      $$0.put(cbq.e, eci.ap);
      $$0.put(cbq.f, eci.aq);
      $$0.put(cbq.g, eci.ar);
      $$0.put(cbq.h, eci.as);
      $$0.put(cbq.i, eci.at);
      $$0.put(cbq.j, eci.au);
      $$0.put(cbq.k, eci.av);
      $$0.put(cbq.l, eci.aw);
      $$0.put(cbq.n, eci.ax);
      $$0.put(cbq.o, eci.ay);
      $$0.put(cbq.p, eci.az);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bls(int $$0) {
      super(ImmutableMap.of(bsn.m, bso.c, bsn.n, bso.c, bsn.q, bso.c, bsn.k, bso.a), $$0);
   }

   protected boolean a(akt $$0, cbn $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(akt $$0, cbn $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cca $$3 = this.c($$1).get();
      $$1.dN().a(bsn.q, $$3);
      blf.a($$1, $$3);
   }

   protected boolean b(akt $$0, cbn $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      cca $$3 = this.c($$1).get();
      blf.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bjm)$$3);
            this.j = true;
         }
      } else {
         blf.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(akt $$0, cbn $$1, long $$2) {
      this.i = a($$0);
      $$1.dN().b(bsn.q);
      $$1.dN().b(bsn.m);
      $$1.dN().b(bsn.n);
   }

   private void a(cbn $$0, bjm $$1) {
      for (cjl $$3 : this.a($$0)) {
         blf.a($$0, $$3, $$1.dj());
      }
   }

   private List<cjl> a(cbn $$0) {
      if ($$0.m_()) {
         return ImmutableList.of(new cjl(cjo.cP));
      } else {
         cbq $$1 = $$0.gp().b();
         if (g.containsKey($$1)) {
            ecs $$2 = $$0.dL().n().aH().getLootTable(g.get($$1));
            ecq $$3 = new ecq.a((akt)$$0.dL()).a(eev.f, $$0.dj()).a(eev.a, $$0).a(eeu.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cjl(cjo.oH));
         }
      }
   }

   private boolean b(cbn $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cca> c(cbn $$0) {
      return $$0.dN().c(bsn.k).filter(this::a);
   }

   private boolean a(cca $$0) {
      return $$0.a(bil.F);
   }

   private boolean a(cbn $$0, cca $$1) {
      gw $$2 = $$1.dl();
      gw $$3 = $$0.dl();
      return $$3.a($$2, 5.0);
   }

   private static int a(akt $$0) {
      return 600 + $$0.z.a(6001);
   }
}
