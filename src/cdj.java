import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cdj extends byc implements bml, bne {
   private static final UUID bU = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bns bV = new bns(bU, "Strider suffocating modifier", -0.34F, bns.a.b);
   private static final float bX = 0.35F;
   private static final float bY = 0.55F;
   private static final cqh bZ = cqh.a(cnj.dC);
   private static final cqh ca = cqh.a(cnj.dC, cnj.nR);
   private static final agn<Integer> cb = agq.a(cdj.class, agp.b);
   private static final agn<Boolean> cc = agq.a(cdj.class, agp.k);
   private static final agn<Boolean> cd = agq.a(cdj.class, agp.k);
   private final bmk ce = new bmk(this.an, cb, cd);
   @Nullable
   private bus cf;

   public cdj(bmc<? extends cdj> $$0, ctx $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(efk.j, -1.0F);
      this.a(efk.i, 0.0F);
      this.a(efk.n, 0.0F);
      this.a(efk.o, 0.0F);
   }

   public static boolean c(bmc<cdj> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      hx.a $$5 = $$3.j();

      do {
         $$5.c(ic.b);
      } while ($$1.b_($$5).a(asn.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(agn<?> $$0) {
      if (cb.equals($$0) && this.dL().B) {
         this.ce.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cb, 0);
      this.an.a(cc, false);
      this.an.a(cd, false);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      this.ce.a($$0);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.ce.b($$0);
   }

   @Override
   public boolean i() {
      return this.ce.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   public void a(@Nullable aru $$0) {
      this.ce.a(true);
      if ($$0 != null) {
         this.dL().a(null, this, art.xw, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bP.a(1, new bud(this, 1.65));
      this.bP.a(2, new bsw(this, 1.0));
      this.cf = new bus(this, 1.4, ca, false);
      this.bP.a(3, this.cf);
      this.bP.a(4, new cdj.a(this, 1.0));
      this.bP.a(5, new btj(this, 1.0));
      this.bP.a(7, new buh(this, 1.0, 60));
      this.bP.a(8, new bts(this, cfq.class, 8.0F));
      this.bP.a(8, new buf(this));
      this.bP.a(9, new bts(this, cdj.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.b(cc, $$0);
      bnq $$1 = this.f(bnu.o);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bV);
         } else {
            $$1.e(bV);
         }
      }
   }

   @Override
   public boolean u() {
      return this.an.b(cc);
   }

   @Override
   public boolean a(eez $$0) {
      return $$0.a(asn.b);
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * aup.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bmo cN() {
      return (bmo)(this.i() && this.cQ() instanceof cfq $$0 && $$0.b(cnj.nR) ? $$0 : super.cN());
   }

   @Override
   public emc b(bmo $$0) {
      emc[] $$1 = new emc[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dB()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dB() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dB() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dB() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dB() + 45.0F)
      };
      Set<hx> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hx.a $$5 = new hx.a();

      for (emc $$6 : $$1) {
         $$5.b(this.dq() + $$6.c, $$3, this.dw() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ic.a);
         }
      }

      for (hx $$8 : $$2) {
         if (!this.dL().b_($$8).a(asn.b)) {
            double $$9 = this.dL().j($$8);
            if (chn.a($$9)) {
               emc $$10 = emc.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bna $$11 = (bna)var14.next();
                  elx $$12 = $$0.f($$11);
                  if (chn.a(this.dL(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new emc(this.dq(), this.cH().e, this.dw());
   }

   @Override
   protected void a(cfq $$0, emc $$1) {
      this.a($$0.dB(), $$0.dD() * 0.5F);
      this.N = this.aU = this.aW = this.dB();
      this.ce.b();
      super.a($$0, $$1);
   }

   @Override
   protected emc b(cfq $$0, emc $$1) {
      return new emc(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cfq $$0) {
      return (float)(this.g(bnu.o) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.ce.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(this.bn() ? art.xu : art.xt, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ce.a(this.eg());
   }

   @Override
   protected void a(double $$0, boolean $$1, djp $$2, hx $$3) {
      this.aQ();
      if (this.bn()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.A() && this.ag.a(140) == 0) {
         this.a(art.xp, 1.0F, this.eX());
      } else if (this.gc() && this.ag.a(60) == 0) {
         this.a(art.xq, 1.0F, this.eX());
      }

      if (!this.fV()) {
         boolean $$2;
         boolean var10000;
         label36: {
            djp $$0 = this.dL().a_(this.dl());
            djp $$1 = this.bj();
            $$2 = $$0.a(asi.aT) || $$1.a(asi.aT) || this.b(asn.b) > 0.0;
            if (this.cZ() instanceof cdj $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gf();
      this.aQ();
   }

   private boolean A() {
      return this.cf != null && this.cf.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gf() {
      if (this.bn()) {
         emh $$0 = emh.a(this);
         if ($$0.a(dbn.d, this.dl(), true) && !this.dL().b_(this.dl().c()).a(asn.b)) {
            this.c(true);
         } else {
            this.g(this.do().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bnt.a w() {
      return bmq.C().a(bnu.o, 0.175F).a(bnu.i, 16.0);
   }

   @Override
   protected ars y() {
      return !this.gc() && !this.A() ? art.xo : null;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.xs;
   }

   @Override
   protected ars n_() {
      return art.xr;
   }

   @Override
   protected boolean q(blw $$0) {
      return !this.bP() && !this.a(asn.b);
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected bvy b(ctx $$0) {
      return new cdj.b(this, $$0);
   }

   @Override
   public float a(hx $$0, cua $$1) {
      if ($$1.a_($$0).u().a(asn.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cdj b(ane $$0, blr $$1) {
      return bmc.aX.a((ctx)$$0);
   }

   @Override
   public boolean m(cng $$0) {
      return bZ.a($$0);
   }

   @Override
   protected void ey() {
      super.ey();
      if (this.i()) {
         this.a(cnj.nK);
      }
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dL().B) {
            $$0.m(this);
         }

         return bkc.a(this.dL().B);
      } else {
         bkc $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cng $$4 = $$0.b($$1);
            return $$4.a(cnj.nK) ? $$4.a($$0, this, $$1) : bkc.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dL().a(null, this.dq(), this.ds(), this.dw(), art.xv, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         auw $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            bmq $$6 = bmc.bv.a((ctx)$$0.E());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cdp.b(cdp.a($$5), false));
               $$6.a(bmd.a, new cng(cnj.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            blr $$7 = bmc.aX.a((ctx)$$0.E());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new blr.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private bnh a(cum $$0, bka $$1, bmq $$2, @Nullable bnh $$3) {
      $$2.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
      $$2.a($$0, $$1, bms.g, $$3, null);
      $$2.a(this, true);
      return new blr.a(0.0F);
   }

   static class a extends btx {
      private final cdj g;

      a(cdj $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hx k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dL(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bn() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cua $$0, hx $$1) {
         return $$0.a_($$1).a(cxa.H) && $$0.a_($$1.c()).a($$0, $$1, efp.a);
      }
   }

   static class b extends bvx {
      b(cdj $$0, ctx $$1) {
         super($$0, $$1);
      }

      @Override
      protected efq a(int $$0) {
         this.o = new eft();
         this.o.a(true);
         return new efq(this.o, $$0);
      }

      @Override
      protected boolean a(efk $$0) {
         return $$0 != efk.i && $$0 != efk.o && $$0 != efk.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hx $$0) {
         return this.b.a_($$0).a(cxa.H) || super.a($$0);
      }
   }
}
