import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvy extends bvj<cml> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmo, ale<eqo>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmo.c, eqf.aH);
      $$0.put(cmo.d, eqf.aI);
      $$0.put(cmo.e, eqf.aJ);
      $$0.put(cmo.f, eqf.aK);
      $$0.put(cmo.g, eqf.aL);
      $$0.put(cmo.h, eqf.aM);
      $$0.put(cmo.i, eqf.aN);
      $$0.put(cmo.j, eqf.aO);
      $$0.put(cmo.k, eqf.aP);
      $$0.put(cmo.l, eqf.aQ);
      $$0.put(cmo.n, eqf.aR);
      $$0.put(cmo.o, eqf.aS);
      $$0.put(cmo.p, eqf.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvy(int $$0) {
      super(ImmutableMap.of(ccu.m, ccv.c, ccu.n, ccv.c, ccu.q, ccv.c, ccu.k, ccv.a), $$0);
   }

   protected boolean a(arf $$0, cml $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arf $$0, cml $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmy $$3 = this.c($$1).get();
      $$1.dS().a(ccu.q, $$3);
      bvl.a($$1, $$3);
   }

   protected boolean b(arf $$0, cml $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arf $$0, cml $$1, long $$2) {
      cmy $$3 = this.c($$1).get();
      bvl.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btq)$$3);
            this.j = true;
         }
      } else {
         bvl.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arf $$0, cml $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(ccu.q);
      $$1.dS().b(ccu.m);
      $$1.dS().b(ccu.n);
   }

   private void a(cml $$0, btq $$1) {
      for (cuq $$3 : this.a($$0)) {
         bvl.a($$0, $$3, $$1.dn());
      }
   }

   private List<cuq> a(cml $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cuq(cut.dl));
      } else {
         cmo $$1 = $$0.gB().b();
         if (g.containsKey($$1)) {
            eqo $$2 = $$0.dP().o().be().b(g.get($$1));
            eqm $$3 = new eqm.a((arf)$$0.dP()).a(etf.f, $$0.dn()).a(etf.a, $$0).a(ete.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuq(cut.pv));
         }
      }
   }

   private boolean b(cml $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmy> c(cml $$0) {
      return $$0.dS().c(ccu.k).filter(this::a);
   }

   private boolean a(cmy $$0) {
      return $$0.b(bsf.F);
   }

   private boolean a(cml $$0, cmy $$1) {
      iz $$2 = $$1.dp();
      iz $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(arf $$0) {
      return 600 + $$0.z.a(6001);
   }
}
