import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chu extends bvx implements bvf, bwa<jq<chv>> {
   private static final akl<Boolean> ce = akp.a(chu.class, akn.k);
   private static final akl<Integer> cf = akp.a(chu.class, akn.b);
   private static final akl<Integer> cg = akp.a(chu.class, akn.b);
   private static final akl<jq<chv>> ch = akp.a(chu.class, akn.y);
   public static final Predicate<bva> cc = $$0 -> {
      bul<?> $$1 = $$0.ar();
      return $$1 == bul.aJ || $$1 == bul.aG || $$1 == bul.Q;
   };
   private static final float ci = 8.0F;
   private static final float cj = 40.0F;
   private static final float ck = 0.125F;
   public static final float cd = (float) (Math.PI / 5);
   private float cl;
   private float cm;
   private boolean cn;
   private boolean co;
   private float cp;
   private float cq;
   private static final bro cr = bal.a(20, 39);
   @Nullable
   private UUID cs;

   public chu(bul<? extends chu> $$0, dfb $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(esb.f, -1.0F);
      this.a(esb.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbs(this));
      this.bS.a(1, new bvx.a(1.5, axc.G));
      this.bS.a(2, new cdd(this));
      this.bS.a(3, new chu.a<>(this, ciy.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cce(this, 0.4F));
      this.bS.a(5, new cci(this, 1.0, true));
      this.bS.a(6, new cbw(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbk(this, 1.0));
      this.bS.a(8, new cdl(this, 1.0));
      this.bS.a(9, new cbg(this, 8.0F));
      this.bS.a(10, new ccg(this, com.class, 8.0F));
      this.bS.a(10, new cct(this));
      this.bT.a(1, new cdv(this));
      this.bT.a(2, new cdw(this));
      this.bT.a(3, new cdq(this).a());
      this.bT.a(4, new cdr<>(this, com.class, 10, true, false, this::a_));
      this.bT.a(5, new cdu<>(this, cgr.class, false, cc));
      this.bT.a(6, new cdu<>(this, chs.class, false, chs.bY));
      this.bT.a(7, new cdr<>(this, ckz.class, false));
      this.bT.a(8, new cdx<>(this, true));
   }

   public ali gG() {
      chv $$0 = this.gH().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.ae_() ? $$0.c() : $$0.a();
      }
   }

   public jq<chv> gH() {
      return this.am.a(ch);
   }

   public void j(jq<chv> $$0) {
      this.am.a(ch, $$0);
   }

   public static bwh.a gI() {
      return cgr.gz().a(bwi.v, 0.3F).a(bwi.s, 8.0).a(bwi.c, 4.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      ke $$1 = this.dZ();
      kd<chv> $$2 = $$1.e(lz.m);
      $$0.a(ch, $$2.a(chw.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cuy.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.CX, 0.15F, 1.0F);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gK().a());
      this.gH().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      Optional.ofNullable(ali.c($$0.l("variant"))).map($$0x -> alh.a(lz.m, $$0x)).flatMap($$0x -> this.dZ().e(lz.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cuy.a($$0.h("CollarColor")));
      }

      this.a(this.dX(), $$0);
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      jq<dgc> $$4 = $$0.t(this.dx());
      jq<chv> $$6;
      if ($$3 instanceof chu.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = chw.a(this.dZ(), $$4);
         $$3 = new chu.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awk w() {
      if (this.ae_()) {
         return awl.CS;
      } else if (this.af.a(3) == 0) {
         return this.q() && this.eG() < 20.0F ? awl.CY : awl.CV;
      } else {
         return awl.CQ;
      }
   }

   @Override
   protected awk d(bsu $$0) {
      return this.g($$0) ? awl.CO : awl.CU;
   }

   @Override
   protected awk o_() {
      return awl.CR;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C && this.cn && !this.co && !this.gq() && this.aK()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dX().a(this, (byte)8);
      }

      if (!this.dX().C) {
         this.a((arn)this.dX(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bM()) {
         this.cm = this.cl;
         if (this.gL()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bm()) {
            this.cn = true;
            if (this.co && !this.dX().C) {
               this.dX().a(this, (byte)56);
               this.gM();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awl.CW, this.fi(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.a(eag.u);
            }

            this.cq = this.cp;
            this.cp += 0.05F;
            if (this.cq >= 2.0F) {
               this.cn = false;
               this.co = false;
               this.cq = 0.0F;
               this.cp = 0.0F;
            }

            if (this.cp > 0.4F) {
               float $$0 = (float)this.dE();
               int $$1 = (int)(azk.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               ezn $$2 = this.dA();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.ds() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.ds() * 0.5F;
                  this.dX().a(lr.am, this.dC() + (double)$$4, (double)($$0 + 0.8F), this.dI() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gM() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bsu $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + azk.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azk.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azk.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.y() ? 20 : super.ad();
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dX().C) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean e(bum $$0) {
      return true;
   }

   @Override
   protected void f(bsu $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cwb $$2 = this.ak();
         int $$3 = $$2.o();
         int $$4 = $$2.p();
         $$2.a(azk.f($$1), this, bum.g);
         if (bub.b.a($$3, $$4) != bub.b.a(this.ak())) {
            this.a(awl.CN);
            if (this.dX() instanceof arn $$5) {
               $$5.a(new ln(lr.S, cwf.or.o()), this.dC(), this.dE() + 1.0, this.dI(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bsu $$0) {
      return this.ak().a(cwf.os) && !$$0.a(axc.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bwi.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwi.s).a(8.0);
      }
   }

   @Override
   protected void b(bsu $$0, float $$1) {
      this.a($$0, $$1, new bum[]{bum.g});
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      cvx $$3 = $$2.h();
      if (this.q()) {
         if (this.l($$2) && this.eG() < this.eV()) {
            $$2.a(1, $$0);
            crl $$4 = $$2.a(ku.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bsd.a;
         } else {
            if ($$3 instanceof cuz $$6 && this.j($$0)) {
               cuy $$7 = $$6.b();
               if ($$7 != this.gK()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bsd.a;
               }

               return super.b($$0, $$1);
            }

            if (this.a($$2, bum.g) && !this.al() && this.j($$0) && !this.p_()) {
               this.j($$2.c(1));
               $$2.a(1, $$0);
               return bsd.a;
            } else if ($$2.a(cwf.rW) && this.j($$0) && this.al() && (!dbu.a(this.ak(), dbt.E) || $$0.f())) {
               $$2.a(1, $$0, d($$1));
               this.a(awl.az);
               cwb $$8 = this.ak();
               this.j(cwb.k);
               this.b($$8);
               return bsd.a;
            } else if (this.y() && this.al() && this.j($$0) && this.ak().n() && this.ak().b($$2)) {
               $$2.h(1);
               this.a(awl.CP);
               cwb $$9 = this.ak();
               int $$10 = (int)((float)$$9.p() * 0.125F);
               $$9.b(Math.max(0, $$9.o() - $$10));
               return bsd.a;
            } else {
               bsd $$11 = super.b($$0, $$1);
               if (!$$11.a() && this.j($$0)) {
                  this.z(!this.gu());
                  this.bn = false;
                  this.bR.o();
                  this.h(null);
                  return bsd.a.b();
               } else {
                  return $$11;
               }
            }
         }
      } else if (!this.dX().C && $$2.a(cwf.rA) && !this.ae_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bsd.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(com $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.bR.o();
         this.h(null);
         this.z(true);
         this.dX().a(this, (byte)7);
      } else {
         this.dX().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gM();
      } else {
         super.b($$0);
      }
   }

   public float gJ() {
      if (this.ae_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eV();
         float $$1 = ($$0 - this.eG()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ag);
   }

   @Override
   public int aj() {
      return 8;
   }

   @Override
   public int a() {
      return this.am.a(cg);
   }

   @Override
   public void a(int $$0) {
      this.am.a(cg, $$0);
   }

   @Override
   public void c() {
      this.a(cr.a(this.af));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cs;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cs = $$0;
   }

   public cuy gK() {
      return cuy.a(this.am.a(cf));
   }

   private void a(cuy $$0) {
      this.am.a(cf, $$0.a());
   }

   @Nullable
   public chu b(arn $$0, btv $$1) {
      chu $$2 = bul.bs.a($$0, buk.e);
      if ($$2 != null && $$1 instanceof chu $$3) {
         if (this.af.h()) {
            $$2.j(this.gH());
         } else {
            $$2.j($$3.gH());
         }

         if (this.q()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gK());
            } else {
               $$2.a($$3.gK());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.a(ce, $$0);
   }

   @Override
   public boolean a(cgr $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof chu $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.y() ? false : this.gE() && $$1.gE();
      }
   }

   public boolean gL() {
      return this.am.a(ce);
   }

   @Override
   public boolean a(bva $$0, bva $$1) {
      if ($$0 instanceof cld || $$0 instanceof cll || $$0 instanceof ckk) {
         return false;
      } else if ($$0 instanceof chu $$2) {
         return !$$2.q() || $$2.T_() != $$1;
      } else {
         if ($$0 instanceof com $$3 && $$1 instanceof com $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof civ $$5 && $$5.gL()) {
            return false;
         }

         if ($$0 instanceof bvx $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean A() {
      return !this.ae_();
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }

   public static boolean c(bul<chu> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.a_($$3.e()).a(axa.cg) && a($$1, $$3);
   }

   class a<T extends bva> extends cbf<T> {
      private final chu j;

      public a(final chu $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof ciy ? !this.j.q() && this.a((ciy)this.b) : false;
      }

      private boolean a(ciy $$0) {
         return $$0.gy() >= chu.this.af.a(5);
      }

      @Override
      public void d() {
         chu.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         chu.this.h(null);
         super.a();
      }
   }

   public static class b extends btv.a {
      public final jq<chv> a;

      public b(jq<chv> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
