import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class buh extends bts<cku> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<ckx, akg<eoq>> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ckx.c, eoj.aA);
      $$0.put(ckx.d, eoj.aB);
      $$0.put(ckx.e, eoj.aC);
      $$0.put(ckx.f, eoj.aD);
      $$0.put(ckx.g, eoj.aE);
      $$0.put(ckx.h, eoj.aF);
      $$0.put(ckx.i, eoj.aG);
      $$0.put(ckx.j, eoj.aH);
      $$0.put(ckx.k, eoj.aI);
      $$0.put(ckx.l, eoj.aJ);
      $$0.put(ckx.n, eoj.aK);
      $$0.put(ckx.o, eoj.aL);
      $$0.put(ckx.p, eoj.aM);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public buh(int $$0) {
      super(ImmutableMap.of(cbd.m, cbe.c, cbd.n, cbe.c, cbd.q, cbe.c, cbd.k, cbe.a), $$0);
   }

   protected boolean a(aqh $$0, cku $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqh $$0, cku $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      clh $$3 = this.c($$1).get();
      $$1.dQ().a(cbd.q, $$3);
      btu.a($$1, $$3);
   }

   protected boolean b(aqh $$0, cku $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      clh $$3 = this.c($$1).get();
      btu.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bsa)$$3);
            this.j = true;
         }
      } else {
         btu.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqh $$0, cku $$1, long $$2) {
      this.i = a($$0);
      $$1.dQ().b(cbd.q);
      $$1.dQ().b(cbd.m);
      $$1.dQ().b(cbd.n);
   }

   private void a(cku $$0, bsa $$1) {
      for (csz $$3 : this.a($$0)) {
         btu.a($$0, $$3, $$1.dl());
      }
   }

   private List<csz> a(cku $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new csz(ctc.dl));
      } else {
         ckx $$1 = $$0.gA().b();
         if (g.containsKey($$1)) {
            eoq $$2 = $$0.dN().o().be().b(g.get($$1));
            eoo $$3 = new eoo.a((aqh)$$0.dN()).a(erc.f, $$0.dl()).a(erc.a, $$0).a(erb.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new csz(ctc.pv));
         }
      }
   }

   private boolean b(cku $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<clh> c(cku $$0) {
      return $$0.dQ().c(cbd.k).filter(this::a);
   }

   private boolean a(clh $$0) {
      return $$0.b(bqv.F);
   }

   private boolean a(cku $$0, clh $$1) {
      in $$2 = $$1.dn();
      in $$3 = $$0.dn();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqh $$0) {
      return 600 + $$0.z.a(6001);
   }
}
