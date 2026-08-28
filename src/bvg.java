import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvg extends bur<clu> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<clx, akj<eqt>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(clx.c, eqk.aH);
      $$0.put(clx.d, eqk.aI);
      $$0.put(clx.e, eqk.aJ);
      $$0.put(clx.f, eqk.aK);
      $$0.put(clx.g, eqk.aL);
      $$0.put(clx.h, eqk.aM);
      $$0.put(clx.i, eqk.aN);
      $$0.put(clx.j, eqk.aO);
      $$0.put(clx.k, eqk.aP);
      $$0.put(clx.l, eqk.aQ);
      $$0.put(clx.n, eqk.aR);
      $$0.put(clx.o, eqk.aS);
      $$0.put(clx.p, eqk.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvg(int $$0) {
      super(ImmutableMap.of(ccc.m, ccd.c, ccc.n, ccd.c, ccc.q, ccd.c, ccc.k, ccd.a), $$0);
   }

   protected boolean a(aqk $$0, clu $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqk $$0, clu $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmh $$3 = this.c($$1).get();
      $$1.dT().a(ccc.q, $$3);
      but.a($$1, $$3);
   }

   protected boolean b(aqk $$0, clu $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      cmh $$3 = this.c($$1).get();
      but.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bsy)$$3);
            this.j = true;
         }
      } else {
         but.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqk $$0, clu $$1, long $$2) {
      this.i = a($$0);
      $$1.dT().b(ccc.q);
      $$1.dT().b(ccc.m);
      $$1.dT().b(ccc.n);
   }

   private void a(clu $$0, bsy $$1) {
      for (cua $$3 : this.a($$0)) {
         but.a($$0, $$3, $$1.dn());
      }
   }

   private List<cua> a(clu $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cua(cud.dl));
      } else {
         clx $$1 = $$0.gy().b();
         if (g.containsKey($$1)) {
            eqt $$2 = $$0.dP().o().be().b(g.get($$1));
            eqr $$3 = new eqr.a((aqk)$$0.dP()).a(etk.f, $$0.dn()).a(etk.a, $$0).a(etj.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cua(cud.pv));
         }
      }
   }

   private boolean b(clu $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmh> c(clu $$0) {
      return $$0.dT().c(ccc.k).filter(this::a);
   }

   private boolean a(cmh $$0) {
      return $$0.b(brn.F);
   }

   private boolean a(clu $$0, cmh $$1) {
      ja $$2 = $$1.dp();
      ja $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqk $$0) {
      return 600 + $$0.z.a(6001);
   }
}
