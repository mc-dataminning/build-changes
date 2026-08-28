import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvs extends bvd<cmf> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmi, ala<eqi>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmi.c, epz.aH);
      $$0.put(cmi.d, epz.aI);
      $$0.put(cmi.e, epz.aJ);
      $$0.put(cmi.f, epz.aK);
      $$0.put(cmi.g, epz.aL);
      $$0.put(cmi.h, epz.aM);
      $$0.put(cmi.i, epz.aN);
      $$0.put(cmi.j, epz.aO);
      $$0.put(cmi.k, epz.aP);
      $$0.put(cmi.l, epz.aQ);
      $$0.put(cmi.n, epz.aR);
      $$0.put(cmi.o, epz.aS);
      $$0.put(cmi.p, epz.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvs(int $$0) {
      super(ImmutableMap.of(cco.m, ccp.c, cco.n, ccp.c, cco.q, ccp.c, cco.k, ccp.a), $$0);
   }

   protected boolean a(arb $$0, cmf $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arb $$0, cmf $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cms $$3 = this.c($$1).get();
      $$1.dS().a(cco.q, $$3);
      bvf.a($$1, $$3);
   }

   protected boolean b(arb $$0, cmf $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      cms $$3 = this.c($$1).get();
      bvf.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btk)$$3);
            this.j = true;
         }
      } else {
         bvf.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arb $$0, cmf $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(cco.q);
      $$1.dS().b(cco.m);
      $$1.dS().b(cco.n);
   }

   private void a(cmf $$0, btk $$1) {
      for (cuk $$3 : this.a($$0)) {
         bvf.a($$0, $$3, $$1.dn());
      }
   }

   private List<cuk> a(cmf $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cuk(cun.dl));
      } else {
         cmi $$1 = $$0.gB().b();
         if (g.containsKey($$1)) {
            eqi $$2 = $$0.dP().o().be().b(g.get($$1));
            eqg $$3 = new eqg.a((arb)$$0.dP()).a(esz.f, $$0.dn()).a(esz.a, $$0).a(esy.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuk(cun.pv));
         }
      }
   }

   private boolean b(cmf $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cms> c(cmf $$0) {
      return $$0.dS().c(cco.k).filter(this::a);
   }

   private boolean a(cms $$0) {
      return $$0.b(brz.F);
   }

   private boolean a(cmf $$0, cms $$1) {
      iz $$2 = $$1.dp();
      iz $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(arb $$0) {
      return 600 + $$0.z.a(6001);
   }
}
