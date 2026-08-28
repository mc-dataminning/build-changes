import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvx extends bvi<cmk> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmn, ale<eqn>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmn.c, eqe.aH);
      $$0.put(cmn.d, eqe.aI);
      $$0.put(cmn.e, eqe.aJ);
      $$0.put(cmn.f, eqe.aK);
      $$0.put(cmn.g, eqe.aL);
      $$0.put(cmn.h, eqe.aM);
      $$0.put(cmn.i, eqe.aN);
      $$0.put(cmn.j, eqe.aO);
      $$0.put(cmn.k, eqe.aP);
      $$0.put(cmn.l, eqe.aQ);
      $$0.put(cmn.n, eqe.aR);
      $$0.put(cmn.o, eqe.aS);
      $$0.put(cmn.p, eqe.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvx(int $$0) {
      super(ImmutableMap.of(cct.m, ccu.c, cct.n, ccu.c, cct.q, ccu.c, cct.k, ccu.a), $$0);
   }

   protected boolean a(arf $$0, cmk $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arf $$0, cmk $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmx $$3 = this.c($$1).get();
      $$1.dS().a(cct.q, $$3);
      bvk.a($$1, $$3);
   }

   protected boolean b(arf $$0, cmk $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      cmx $$3 = this.c($$1).get();
      bvk.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btp)$$3);
            this.j = true;
         }
      } else {
         bvk.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arf $$0, cmk $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(cct.q);
      $$1.dS().b(cct.m);
      $$1.dS().b(cct.n);
   }

   private void a(cmk $$0, btp $$1) {
      for (cup $$3 : this.a($$0)) {
         bvk.a($$0, $$3, $$1.dn());
      }
   }

   private List<cup> a(cmk $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cup(cus.dl));
      } else {
         cmn $$1 = $$0.gB().b();
         if (g.containsKey($$1)) {
            eqn $$2 = $$0.dP().o().be().b(g.get($$1));
            eql $$3 = new eql.a((arf)$$0.dP()).a(ete.f, $$0.dn()).a(ete.a, $$0).a(etd.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cup(cus.pv));
         }
      }
   }

   private boolean b(cmk $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmx> c(cmk $$0) {
      return $$0.dS().c(cct.k).filter(this::a);
   }

   private boolean a(cmx $$0) {
      return $$0.b(bse.F);
   }

   private boolean a(cmk $$0, cmx $$1) {
      iz $$2 = $$1.dp();
      iz $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(arf $$0) {
      return 600 + $$0.z.a(6001);
   }
}
