import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class btl extends bsw<cjy> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<ckb, akf> g = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(ckb.c, eny.aA);
      $$0.put(ckb.d, eny.aB);
      $$0.put(ckb.e, eny.aC);
      $$0.put(ckb.f, eny.aD);
      $$0.put(ckb.g, eny.aE);
      $$0.put(ckb.h, eny.aF);
      $$0.put(ckb.i, eny.aG);
      $$0.put(ckb.j, eny.aH);
      $$0.put(ckb.k, eny.aI);
      $$0.put(ckb.l, eny.aJ);
      $$0.put(ckb.n, eny.aK);
      $$0.put(ckb.o, eny.aL);
      $$0.put(ckb.p, eny.aM);
   });
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public btl(int $$0) {
      super(ImmutableMap.of(cah.m, cai.c, cah.n, cai.c, cah.q, cai.c, cah.k, cai.a), $$0);
   }

   protected boolean a(aqe $$0, cjy $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(aqe $$0, cjy $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      ckl $$3 = this.c($$1).get();
      $$1.dQ().a(cah.q, $$3);
      bsy.a($$1, $$3);
   }

   protected boolean b(aqe $$0, cjy $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      ckl $$3 = this.c($$1).get();
      bsy.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bre)$$3);
            this.j = true;
         }
      } else {
         bsy.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(aqe $$0, cjy $$1, long $$2) {
      this.i = a($$0);
      $$1.dQ().b(cah.q);
      $$1.dQ().b(cah.m);
      $$1.dQ().b(cah.n);
   }

   private void a(cjy $$0, bre $$1) {
      for (csd $$3 : this.a($$0)) {
         bsy.a($$0, $$3, $$1.dl());
      }
   }

   private List<csd> a(cjy $$0) {
      if ($$0.p_()) {
         return ImmutableList.of(new csd(csg.dl));
      } else {
         ckb $$1 = $$0.gA().b();
         if (g.containsKey($$1)) {
            eoi $$2 = $$0.dN().o().aM().getLootTable(g.get($$1));
            eog $$3 = new eog.a((aqe)$$0.dN()).a(eqt.f, $$0.dl()).a(eqt.a, $$0).a(eqs.i);
            return $$2.a($$3);
         } else {
            return ImmutableList.of(new csd(csg.pv));
         }
      }
   }

   private boolean b(cjy $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<ckl> c(cjy $$0) {
      return $$0.dQ().c(cah.k).filter(this::a);
   }

   private boolean a(ckl $$0) {
      return $$0.b(bpz.F);
   }

   private boolean a(cjy $$0, ckl $$1) {
      im $$2 = $$1.dn();
      im $$3 = $$0.dn();
      return $$3.a($$2, 5.0);
   }

   private static int a(aqe $$0) {
      return 600 + $$0.z.a(6001);
   }
}
