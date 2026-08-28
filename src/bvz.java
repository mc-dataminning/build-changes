import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvz extends bvk<cmm> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmp, ale<eqp>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmp.c, eqg.aH);
      $$0.put(cmp.d, eqg.aI);
      $$0.put(cmp.e, eqg.aJ);
      $$0.put(cmp.f, eqg.aK);
      $$0.put(cmp.g, eqg.aL);
      $$0.put(cmp.h, eqg.aM);
      $$0.put(cmp.i, eqg.aN);
      $$0.put(cmp.j, eqg.aO);
      $$0.put(cmp.k, eqg.aP);
      $$0.put(cmp.l, eqg.aQ);
      $$0.put(cmp.n, eqg.aR);
      $$0.put(cmp.o, eqg.aS);
      $$0.put(cmp.p, eqg.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvz(int $$0) {
      super(ImmutableMap.of(ccv.m, ccw.c, ccv.n, ccw.c, ccv.q, ccw.c, ccv.k, ccw.a), $$0);
   }

   protected boolean a(arf $$0, cmm $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arf $$0, cmm $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmz $$3 = this.c($$1).get();
      $$1.dS().a(ccv.q, $$3);
      bvm.a($$1, $$3);
   }

   protected boolean b(arf $$0, cmm $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arf $$0, cmm $$1, long $$2) {
      cmz $$3 = this.c($$1).get();
      bvm.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btr)$$3);
            this.j = true;
         }
      } else {
         bvm.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arf $$0, cmm $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(ccv.q);
      $$1.dS().b(ccv.m);
      $$1.dS().b(ccv.n);
   }

   private void a(cmm $$0, btr $$1) {
      for (cur $$3 : this.a($$0)) {
         bvm.a($$0, $$3, $$1.dn());
      }
   }

   private List<cur> a(cmm $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cur(cuu.dl));
      } else {
         cmp $$1 = $$0.gB().b();
         if (g.containsKey($$1)) {
            eqp $$2 = $$0.dP().o().be().b(g.get($$1));
            eqn $$3 = new eqn.a((arf)$$0.dP()).a(etg.f, $$0.dn()).a(etg.a, $$0).a(etf.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cur(cuu.pv));
         }
      }
   }

   private boolean b(cmm $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmz> c(cmm $$0) {
      return $$0.dS().c(ccv.k).filter(this::a);
   }

   private boolean a(cmz $$0) {
      return $$0.b(bsg.F);
   }

   private boolean a(cmm $$0, cmz $$1) {
      iz $$2 = $$1.dp();
      iz $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(arf $$0) {
      return 600 + $$0.z.a(6001);
   }
}
