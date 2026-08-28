import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvw extends bvh<cmj> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmm, ald<eqm>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmm.c, eqd.aH);
      $$0.put(cmm.d, eqd.aI);
      $$0.put(cmm.e, eqd.aJ);
      $$0.put(cmm.f, eqd.aK);
      $$0.put(cmm.g, eqd.aL);
      $$0.put(cmm.h, eqd.aM);
      $$0.put(cmm.i, eqd.aN);
      $$0.put(cmm.j, eqd.aO);
      $$0.put(cmm.k, eqd.aP);
      $$0.put(cmm.l, eqd.aQ);
      $$0.put(cmm.n, eqd.aR);
      $$0.put(cmm.o, eqd.aS);
      $$0.put(cmm.p, eqd.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvw(int $$0) {
      super(ImmutableMap.of(ccs.m, cct.c, ccs.n, cct.c, ccs.q, cct.c, ccs.k, cct.a), $$0);
   }

   protected boolean a(are $$0, cmj $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(are $$0, cmj $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmw $$3 = this.c($$1).get();
      $$1.dS().a(ccs.q, $$3);
      bvj.a($$1, $$3);
   }

   protected boolean b(are $$0, cmj $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(are $$0, cmj $$1, long $$2) {
      cmw $$3 = this.c($$1).get();
      bvj.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bto)$$3);
            this.j = true;
         }
      } else {
         bvj.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(are $$0, cmj $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(ccs.q);
      $$1.dS().b(ccs.m);
      $$1.dS().b(ccs.n);
   }

   private void a(cmj $$0, bto $$1) {
      for (cuo $$3 : this.a($$0)) {
         bvj.a($$0, $$3, $$1.dn());
      }
   }

   private List<cuo> a(cmj $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cuo(cur.dl));
      } else {
         cmm $$1 = $$0.gB().b();
         if (g.containsKey($$1)) {
            eqm $$2 = $$0.dP().o().be().b(g.get($$1));
            eqk $$3 = new eqk.a((are)$$0.dP()).a(etd.f, $$0.dn()).a(etd.a, $$0).a(etc.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuo(cur.pv));
         }
      }
   }

   private boolean b(cmj $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmw> c(cmj $$0) {
      return $$0.dS().c(ccs.k).filter(this::a);
   }

   private boolean a(cmw $$0) {
      return $$0.b(bsd.F);
   }

   private boolean a(cmj $$0, cmw $$1) {
      iz $$2 = $$1.dp();
      iz $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(are $$0) {
      return 600 + $$0.z.a(6001);
   }
}
