import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cja extends bxd implements bwl, bxg<jq<cjb>> {
   private static final alc<Boolean> cf = alg.a(cja.class, ale.k);
   private static final alc<Integer> cg = alg.a(cja.class, ale.b);
   private static final alc<Integer> ch = alg.a(cja.class, ale.b);
   private static final alc<jq<cjb>> ci = alg.a(cja.class, ale.y);
   public static final cgx.a cd = ($$0, $$1) -> {
      bvr<?> $$2 = $$0.aq();
      return $$2 == bvr.bb || $$2 == bvr.aY || $$2 == bvr.ab;
   };
   private static final float cj = 8.0F;
   private static final float ck = 40.0F;
   private static final float cl = 0.125F;
   public static final float ce = (float) (Math.PI / 5);
   private float cm;
   private float cn;
   private boolean co;
   private boolean cp;
   private float cq;
   private float cr;
   private static final bsu cs = bbg.a(20, 39);
   @Nullable
   private UUID ct;

   public cja(bvr<? extends cja> $$0, dhi $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(euo.f, -1.0F);
      this.a(euo.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccy(this));
      this.bT.a(1, new bxd.a(1.5, axw.G));
      this.bT.a(2, new cej(this));
      this.bT.a(3, new cja.a<>(this, cke.class, 24.0F, 1.5, 1.5));
      this.bT.a(4, new cdk(this, 0.4F));
      this.bT.a(5, new cdo(this, 1.0, true));
      this.bT.a(6, new cdc(this, 1.0, 10.0F, 2.0F));
      this.bT.a(7, new ccq(this, 1.0));
      this.bT.a(8, new cer(this, 1.0));
      this.bT.a(9, new ccm(this, 8.0F));
      this.bT.a(10, new cdm(this, cpx.class, 8.0F));
      this.bT.a(10, new cdz(this));
      this.bU.a(1, new cfb(this));
      this.bU.a(2, new cfc(this));
      this.bU.a(3, new cew(this).a());
      this.bU.a(4, new cex<>(this, cpx.class, 10, true, false, this::a));
      this.bU.a(5, new cfa<>(this, chx.class, false, cd));
      this.bU.a(6, new cfa<>(this, ciy.class, false, ciy.bZ));
      this.bU.a(7, new cex<>(this, cmf.class, false));
      this.bU.a(8, new cfd<>(this, true));
   }

   public alz gA() {
      cjb $$0 = this.gB().a();
      if (this.p()) {
         return $$0.b();
      } else {
         return this.ad_() ? $$0.c() : $$0.a();
      }
   }

   public jq<cjb> gB() {
      return this.al.a(ci);
   }

   public void j(jq<cjb> $$0) {
      this.al.a(ci, $$0);
   }

   public static bxn.a gC() {
      return chx.gt().a(bxo.v, 0.3F).a(bxo.s, 8.0).a(bxo.c, 4.0);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      ke $$1 = this.dY();
      kd<cjb> $$2 = $$1.e(mb.m);
      $$0.a(ci, $$2.a(cjc.j).or($$2::a).orElseThrow());
      $$0.a(cf, false);
      $$0.a(cg, cwm.o.a());
      $$0.a(ch, 0);
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.Ds, 0.15F, 1.0F);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gE().a());
      this.gB().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      Optional.ofNullable(alz.c($$0.l("variant"))).map($$0x -> aly.a(mb.m, $$0x)).flatMap($$0x -> this.dY().e(mb.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cwm.a($$0.h("CollarColor")));
      }

      this.a(this.dW(), $$0);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      jq<dik> $$4 = $$0.t(this.dw());
      jq<cjb> $$6;
      if ($$3 instanceof cja.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cjc.a(this.dY(), $$4);
         $$3 = new cja.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected axe u() {
      if (this.ad_()) {
         return axf.Dn;
      } else if (this.ae.a(3) == 0) {
         return this.p() && this.eE() < 20.0F ? axf.Dt : axf.Dq;
      } else {
         return axf.Dl;
      }
   }

   @Override
   protected axe e(bua $$0) {
      return this.h($$0) ? axf.Dj : axf.Dp;
   }

   @Override
   protected axe o_() {
      return axf.Dm;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dW().C && this.co && !this.cp && !this.gk() && this.aJ()) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
         this.dW().a(this, (byte)8);
      }

      if (!this.dW().C) {
         this.a((ash)this.dW(), true);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.bL()) {
         this.cn = this.cm;
         if (this.gF()) {
            this.cm = this.cm + (1.0F - this.cm) * 0.4F;
         } else {
            this.cm = this.cm + (0.0F - this.cm) * 0.4F;
         }

         if (this.bl()) {
            this.co = true;
            if (this.cp && !this.dW().C) {
               this.dW().a(this, (byte)56);
               this.gG();
            }
         } else if ((this.co || this.cp) && this.cp) {
            if (this.cq == 0.0F) {
               this.a(axf.Dr, this.fg(), (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
               this.a(ecr.u);
            }

            this.cr = this.cq;
            this.cq += 0.05F;
            if (this.cr >= 2.0F) {
               this.co = false;
               this.cp = false;
               this.cr = 0.0F;
               this.cq = 0.0F;
            }

            if (this.cq > 0.4F) {
               float $$0 = (float)this.dD();
               int $$1 = (int)(bae.a((this.cq - 0.4F) * (float) Math.PI) * 7.0F);
               fby $$2 = this.dz();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  float $$5 = (this.ae.i() * 2.0F - 1.0F) * this.dr() * 0.5F;
                  this.dW().a(ls.an, this.dB() + (double)$$4, (double)($$0 + 0.8F), this.dH() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gG() {
      this.cp = false;
      this.cq = 0.0F;
      this.cr = 0.0F;
   }

   @Override
   public void a(bua $$0) {
      this.co = false;
      this.cp = false;
      this.cr = 0.0F;
      this.cq = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.co ? 1.0F : Math.min(0.75F + bae.h($$0, this.cr, this.cq) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return bae.h($$0, this.cr, this.cq);
   }

   public float L(float $$0) {
      return bae.h($$0, this.cn, this.cm) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.x() ? 20 : super.Z();
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         this.z(false);
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean e(bvs $$0) {
      return true;
   }

   @Override
   protected void b(ash $$0, bua $$1, float $$2) {
      if (!this.h($$1)) {
         super.b($$0, $$1, $$2);
      } else {
         cxp $$3 = this.af();
         int $$4 = $$3.o();
         int $$5 = $$3.p();
         $$3.a(bae.f($$2), this, bvs.g);
         if (bvh.b.a($$4, $$5) != bvh.b.a(this.af())) {
            this.a(axf.Di);
            $$0.a(new lo(ls.S, cxt.oM.n()), this.dB(), this.dD() + 1.0, this.dH(), 20, 0.2, 0.1, 0.2, 0.1);
         }
      }
   }

   private boolean h(bua $$0) {
      return this.af().a(cxt.oN) && !$$0.a(axw.C);
   }

   @Override
   protected void t() {
      if (this.p()) {
         this.g(bxo.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bxo.s).a(8.0);
      }
   }

   @Override
   protected void c(bua $$0, float $$1) {
      this.a($$0, $$1, new bvs[]{bvs.g});
   }

   @Override
   public btj b(cpx $$0, bti $$1) {
      cxp $$2 = $$0.b($$1);
      cxl $$3 = $$2.h();
      if (this.p()) {
         if (this.j($$2) && this.eE() < this.eS()) {
            this.a($$0, $$1, $$2);
            csz $$4 = $$2.a(ku.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return btj.a;
         } else {
            if ($$3 instanceof cwn $$6 && this.j($$0)) {
               cwm $$7 = $$6.b();
               if ($$7 != this.gE()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return btj.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bvs.g) && !this.ag() && this.j($$0) && !this.e_()) {
               this.h($$2.c(1));
               $$2.a(1, $$0);
               return btj.a;
            } else if ($$2.a(cxt.sJ) && this.j($$0) && this.ag() && (!deb.a(this.af(), dea.E) || $$0.b())) {
               $$2.a(1, $$0, d($$1));
               this.a(axf.az);
               cxp $$8 = this.af();
               this.h(cxp.j);
               if (this.dW() instanceof ash $$9) {
                  this.a($$9, $$8);
               }

               return btj.a;
            } else if (this.x() && this.ag() && this.j($$0) && this.af().n() && this.af().b($$2)) {
               $$2.h(1);
               this.a(axf.Dk);
               cxp $$10 = this.af();
               int $$11 = (int)((float)$$10.p() * 0.125F);
               $$10.b(Math.max(0, $$10.o() - $$11));
               return btj.a;
            } else {
               btj $$12 = super.b($$0, $$1);
               if (!$$12.a() && this.j($$0)) {
                  this.z(!this.go());
                  this.bn = false;
                  this.bS.o();
                  this.h(null);
                  return btj.a.b();
               } else {
                  return $$12;
               }
            }
         }
      } else if (!this.dW().C && $$2.a(cxt.sn) && !this.ad_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return btj.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cpx $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.bS.o();
         this.h(null);
         this.z(true);
         this.dW().a(this, (byte)7);
      } else {
         this.dW().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cp = true;
         this.cq = 0.0F;
         this.cr = 0.0F;
      } else if ($$0 == 56) {
         this.gG();
      } else {
         super.b($$0);
      }
   }

   public float gD() {
      if (this.ad_()) {
         return 1.5393804F;
      } else if (this.p()) {
         float $$0 = this.eS();
         float $$1 = ($$0 - this.eE()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ai);
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   public int a() {
      return this.al.a(ch);
   }

   @Override
   public void a(int $$0) {
      this.al.a(ch, $$0);
   }

   @Override
   public void c() {
      this.a(cs.a(this.ae));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ct;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ct = $$0;
   }

   public cwm gE() {
      return cwm.a(this.al.a(cg));
   }

   private void a(cwm $$0) {
      this.al.a(cg, $$0.a());
   }

   @Nullable
   public cja b(ash $$0, bvb $$1) {
      cja $$2 = bvr.bM.a($$0, bvq.e);
      if ($$2 != null && $$1 instanceof cja $$3) {
         if (this.ae.h()) {
            $$2.j(this.gB());
         } else {
            $$2.j($$3.gB());
         }

         if (this.p()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.ae.h()) {
               $$2.a(this.gE());
            } else {
               $$2.a($$3.gE());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.al.a(cf, $$0);
   }

   @Override
   public boolean a(chx $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof cja $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.x() ? false : this.gy() && $$1.gy();
      }
   }

   public boolean gF() {
      return this.al.a(cf);
   }

   @Override
   public boolean a(bwg $$0, bwg $$1) {
      if ($$0 instanceof cmj || $$0 instanceof cmr || $$0 instanceof clq) {
         return false;
      } else if ($$0 instanceof cja $$2) {
         return !$$2.p() || $$2.ah_() != $$1;
      } else {
         if ($$0 instanceof cpx $$3 && $$1 instanceof cpx $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof ckb $$5 && $$5.gF()) {
            return false;
         }

         if ($$0 instanceof bxd $$6 && $$6.p()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean y() {
      return !this.ad_();
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   public static boolean c(bvr<cja> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ch) && a($$1, $$3);
   }

   class a<T extends bwg> extends ccl<T> {
      private final cja j;

      public a(final cja $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cke ? !this.j.p() && this.a((cke)this.b) : false;
      }

      private boolean a(cke $$0) {
         return $$0.gs() >= cja.this.ae.a(5);
      }

      @Override
      public void d() {
         cja.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         cja.this.h(null);
         super.a();
      }
   }

   public static class b extends bvb.a {
      public final jq<cjb> a;

      public b(jq<cjb> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
