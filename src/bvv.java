import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvv extends bvg<cmi> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cml, ald<eql>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cml.c, eqc.aH);
      $$0.put(cml.d, eqc.aI);
      $$0.put(cml.e, eqc.aJ);
      $$0.put(cml.f, eqc.aK);
      $$0.put(cml.g, eqc.aL);
      $$0.put(cml.h, eqc.aM);
      $$0.put(cml.i, eqc.aN);
      $$0.put(cml.j, eqc.aO);
      $$0.put(cml.k, eqc.aP);
      $$0.put(cml.l, eqc.aQ);
      $$0.put(cml.n, eqc.aR);
      $$0.put(cml.o, eqc.aS);
      $$0.put(cml.p, eqc.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvv(int $$0) {
      super(ImmutableMap.of(ccr.m, ccs.c, ccr.n, ccs.c, ccr.q, ccs.c, ccr.k, ccs.a), $$0);
   }

   protected boolean a(are $$0, cmi $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(are $$0, cmi $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmv $$3 = this.c($$1).get();
      $$1.dS().a(ccr.q, $$3);
      bvi.a($$1, $$3);
   }

   protected boolean b(are $$0, cmi $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      cmv $$3 = this.c($$1).get();
      bvi.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btn)$$3);
            this.j = true;
         }
      } else {
         bvi.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(are $$0, cmi $$1, long $$2) {
      this.i = a($$0);
      $$1.dS().b(ccr.q);
      $$1.dS().b(ccr.m);
      $$1.dS().b(ccr.n);
   }

   private void a(cmi $$0, btn $$1) {
      for (cun $$3 : this.a($$0)) {
         bvi.a($$0, $$3, $$1.dn());
      }
   }

   private List<cun> a(cmi $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new cun(cuq.dl));
      } else {
         cml $$1 = $$0.gB().b();
         if (g.containsKey($$1)) {
            eql $$2 = $$0.dP().o().be().b(g.get($$1));
            eqj $$3 = new eqj.a((are)$$0.dP()).a(etc.f, $$0.dn()).a(etc.a, $$0).a(etb.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cun(cuq.pv));
         }
      }
   }

   private boolean b(cmi $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmv> c(cmi $$0) {
      return $$0.dS().c(ccr.k).filter(this::a);
   }

   private boolean a(cmv $$0) {
      return $$0.b(bsc.F);
   }

   private boolean a(cmi $$0, cmv $$1) {
      iz $$2 = $$1.dp();
      iz $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(are $$0) {
      return 600 + $$0.z.a(6001);
   }
}
