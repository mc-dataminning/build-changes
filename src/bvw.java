import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bvw extends bvh<cmk> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cmn, akq<eru>> g = ad.a(Maps.newHashMap(), $$0 -> {
      $$0.put(cmn.c, erl.aH);
      $$0.put(cmn.d, erl.aI);
      $$0.put(cmn.e, erl.aJ);
      $$0.put(cmn.f, erl.aK);
      $$0.put(cmn.g, erl.aL);
      $$0.put(cmn.h, erl.aM);
      $$0.put(cmn.i, erl.aN);
      $$0.put(cmn.j, erl.aO);
      $$0.put(cmn.k, erl.aP);
      $$0.put(cmn.l, erl.aQ);
      $$0.put(cmn.n, erl.aR);
      $$0.put(cmn.o, erl.aS);
      $$0.put(cmn.p, erl.aT);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bvw(int $$0) {
      super(ImmutableMap.of(ccs.m, cct.c, ccs.n, cct.c, ccs.q, cct.c, ccs.k, cct.a), $$0);
   }

   protected boolean a(aqu $$0, cmk $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqu $$0, cmk $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cmx $$3 = this.c($$1).get();
      $$1.dU().a(ccs.q, $$3);
      bvj.a($$1, $$3);
   }

   protected boolean b(aqu $$0, cmk $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      cmx $$3 = this.c($$1).get();
      bvj.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (btn)$$3);
            this.j = true;
         }
      } else {
         bvj.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqu $$0, cmk $$1, long $$2) {
      this.i = a($$0);
      $$1.dU().b(ccs.q);
      $$1.dU().b(ccs.m);
      $$1.dU().b(ccs.n);
   }

   private void a(cmk $$0, btn $$1) {
      for (cuq $$3 : this.a($$0)) {
         bvj.a($$0, $$3, $$1.dn());
      }
   }

   private List<cuq> a(cmk $$0) {
      if ($$0.o_()) {
         return ImmutableList.of(new cuq(cut.dl));
      } else {
         cmn $$1 = $$0.gw().b();
         if (g.containsKey($$1)) {
            eru $$2 = $$0.dP().o().be().b(g.get($$1));
            ers $$3 = new ers.a((aqu)$$0.dP()).a(eul.f, $$0.dn()).a(eul.a, $$0).a(euk.j);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new cuq(cut.pv));
         }
      }
   }

   private boolean b(cmk $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cmx> c(cmk $$0) {
      return $$0.dU().c(ccs.k).filter(this::a);
   }

   private boolean a(cmx $$0) {
      return $$0.b(bsb.F);
   }

   private boolean a(cmk $$0, cmx $$1) {
      jd $$2 = $$1.dp();
      jd $$3 = $$0.dp();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqu $$0) {
      return 600 + $$0.z.a(6001);
   }
}
