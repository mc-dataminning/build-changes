import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chp extends bvs implements bva, bvv<jp<chq>> {
   private static final akk<Boolean> ce = ako.a(chp.class, akm.k);
   private static final akk<Integer> cf = ako.a(chp.class, akm.b);
   private static final akk<Integer> cg = ako.a(chp.class, akm.b);
   private static final akk<jp<chq>> ch = ako.a(chp.class, akm.y);
   public static final Predicate<buv> cc = $$0 -> {
      bug<?> $$1 = $$0.aq();
      return $$1 == bug.aJ || $$1 == bug.aG || $$1 == bug.Q;
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
   private static final brj cr = bak.a(20, 39);
   @Nullable
   private UUID cs;

   public chp(bug<? extends chp> $$0, dev $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(erv.f, -1.0F);
      this.a(erv.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbn(this));
      this.bS.a(1, new bvs.a(1.5, axb.G));
      this.bS.a(2, new ccy(this));
      this.bS.a(3, new chp.a<>(this, cit.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cbz(this, 0.4F));
      this.bS.a(5, new ccd(this, 1.0, true));
      this.bS.a(6, new cbr(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cbf(this, 1.0));
      this.bS.a(8, new cdg(this, 1.0));
      this.bS.a(9, new cbb(this, 8.0F));
      this.bS.a(10, new ccb(this, coh.class, 8.0F));
      this.bS.a(10, new cco(this));
      this.bT.a(1, new cdq(this));
      this.bT.a(2, new cdr(this));
      this.bT.a(3, new cdl(this).a());
      this.bT.a(4, new cdm<>(this, coh.class, 10, true, false, this::a_));
      this.bT.a(5, new cdp<>(this, cgm.class, false, cc));
      this.bT.a(6, new cdp<>(this, chn.class, false, chn.bY));
      this.bT.a(7, new cdm<>(this, cku.class, false));
      this.bT.a(8, new cds<>(this, true));
   }

   public alh gH() {
      chq $$0 = this.gI().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.ae_() ? $$0.c() : $$0.a();
      }
   }

   public jp<chq> gI() {
      return this.am.a(ch);
   }

   public void j(jp<chq> $$0) {
      this.am.a(ch, $$0);
   }

   public static bwc.a gJ() {
      return cgm.gA().a(bwd.v, 0.3F).a(bwd.s, 8.0).a(bwd.c, 4.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      kd $$1 = this.dZ();
      kc<chq> $$2 = $$1.e(ly.m);
      $$0.a(ch, $$2.a(chr.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cuu.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.CX, 0.15F, 1.0F);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gL().a());
      this.gI().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      Optional.ofNullable(alh.c($$0.l("variant"))).map($$0x -> alg.a(ly.m, $$0x)).flatMap($$0x -> this.dZ().e(ly.m).a($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cuu.a($$0.h("CollarColor")));
      }

      this.a(this.dX(), $$0);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      jp<dfw> $$4 = $$0.t(this.dx());
      jp<chq> $$6;
      if ($$3 instanceof chp.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = chr.a(this.dZ(), $$4);
         $$3 = new chp.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awj w() {
      if (this.ae_()) {
         return awk.CS;
      } else if (this.af.a(3) == 0) {
         return this.q() && this.eG() < 20.0F ? awk.CY : awk.CV;
      } else {
         return awk.CQ;
      }
   }

   @Override
   protected awj d(bsp $$0) {
      return this.g($$0) ? awk.CO : awk.CU;
   }

   @Override
   protected awj o_() {
      return awk.CR;
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C && this.cn && !this.co && !this.gr() && this.aJ()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dX().a(this, (byte)8);
      }

      if (!this.dX().C) {
         this.a((arm)this.dX(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bM()) {
         this.cm = this.cl;
         if (this.gN()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bm()) {
            this.cn = true;
            if (this.co && !this.dX().C) {
               this.dX().a(this, (byte)56);
               this.gO();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awk.CW, this.fi(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.a(eaa.u);
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
               int $$1 = (int)(azj.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               ezh $$2 = this.dA();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.ds() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.ds() * 0.5F;
                  this.dX().a(lq.am, this.dC() + (double)$$4, (double)($$0 + 0.8F), this.dI() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gO() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bsp $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + azj.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azj.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azj.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ad() {
      return this.y() ? 20 : super.ad();
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
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
   public boolean e(buh $$0) {
      return true;
   }

   @Override
   protected void f(bsp $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cvx $$2 = this.ak();
         int $$3 = $$2.o();
         int $$4 = $$2.p();
         $$2.a(azj.f($$1), this, buh.g);
         if (btw.b.a($$3, $$4) != btw.b.a(this.ak())) {
            this.a(awk.CN);
            if (this.dX() instanceof arm $$5) {
               $$5.a(new lm(lq.S, cwb.or.o()), this.dC(), this.dE() + 1.0, this.dI(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bsp $$0) {
      return this.gM() && !$$0.a(axb.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bwd.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bwd.s).a(8.0);
      }
   }

   @Override
   protected void b(bsp $$0, float $$1) {
      this.a($$0, $$1, new buh[]{buh.g});
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      cvt $$3 = $$2.h();
      if (this.q()) {
         if (this.l($$2) && this.eG() < this.eV()) {
            $$2.a(1, $$0);
            crg $$4 = $$2.a(kt.w);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return bry.a;
         } else {
            if ($$3 instanceof cuv $$6 && this.j($$0)) {
               cuu $$7 = $$6.c();
               if ($$7 != this.gL()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return bry.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cwb.os) && this.j($$0) && this.ak().f() && !this.p_()) {
               this.j($$2.c(1));
               $$2.a(1, $$0);
               return bry.a;
            } else if ($$2.a(cwb.rW) && this.j($$0) && this.gM() && (!dbo.a(this.ak(), dbn.E) || $$0.f())) {
               $$2.a(1, $$0, d($$1));
               this.a(awk.az);
               cvx $$8 = this.ak();
               this.j(cvx.k);
               this.b($$8);
               return bry.a;
            } else if (this.y() && this.gM() && this.j($$0) && this.ak().n() && this.ak().b($$2)) {
               $$2.h(1);
               this.a(awk.CP);
               cvx $$9 = this.ak();
               int $$10 = (int)((float)$$9.p() * 0.125F);
               $$9.b(Math.max(0, $$9.o() - $$10));
               return bry.a;
            } else {
               bry $$11 = super.b($$0, $$1);
               if (!$$11.a() && this.j($$0)) {
                  this.z(!this.gv());
                  this.bk = false;
                  this.bR.o();
                  this.h(null);
                  return bry.a.b();
               } else {
                  return $$11;
               }
            }
         }
      } else if (!this.dX().C && $$2.a(cwb.rA) && !this.ae_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return bry.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(coh $$0) {
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
         this.gO();
      } else {
         super.b($$0);
      }
   }

   public float gK() {
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
   public boolean l(cvx $$0) {
      return $$0.a(axi.ae);
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

   public cuu gL() {
      return cuu.a(this.am.a(cf));
   }

   public boolean gM() {
      return this.ak().a(cwb.os);
   }

   private void a(cuu $$0) {
      this.am.a(cf, $$0.a());
   }

   @Nullable
   public chp b(arm $$0, btq $$1) {
      chp $$2 = bug.bs.a($$0, buf.e);
      if ($$2 != null && $$1 instanceof chp $$3) {
         if (this.af.h()) {
            $$2.j(this.gI());
         } else {
            $$2.j($$3.gI());
         }

         if (this.q()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gL());
            } else {
               $$2.a($$3.gL());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.a(ce, $$0);
   }

   @Override
   public boolean a(cgm $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof chp $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.y() ? false : this.gF() && $$1.gF();
      }
   }

   public boolean gN() {
      return this.am.a(ce);
   }

   @Override
   public boolean a(buv $$0, buv $$1) {
      if ($$0 instanceof cky || $$0 instanceof clg || $$0 instanceof ckf) {
         return false;
      } else if ($$0 instanceof chp $$2) {
         return !$$2.q() || $$2.T_() != $$1;
      } else {
         if ($$0 instanceof coh $$3 && $$1 instanceof coh $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof ciq $$5 && $$5.gM()) {
            return false;
         }

         if ($$0 instanceof bvs $$6 && $$6.q()) {
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
   public ezh cU() {
      return new ezh(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }

   public static boolean c(bug<chp> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.cg) && a($$1, $$3);
   }

   class a<T extends buv> extends cba<T> {
      private final chp j;

      public a(final chp $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cit ? !this.j.q() && this.a((cit)this.b) : false;
      }

      private boolean a(cit $$0) {
         return $$0.gz() >= chp.this.af.a(5);
      }

      @Override
      public void d() {
         chp.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         chp.this.h(null);
         super.a();
      }
   }

   public static class b extends btq.a {
      public final jp<chq> a;

      public b(jp<chq> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
