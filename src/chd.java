import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chd extends bvg implements bup, bvj<jn<che>> {
   private static final akg<Boolean> ce = akk.a(chd.class, aki.k);
   private static final akg<Integer> cf = akk.a(chd.class, aki.b);
   private static final akg<Integer> cg = akk.a(chd.class, aki.b);
   private static final akg<jn<che>> ch = akk.a(chd.class, aki.y);
   public static final Predicate<buk> cc = $$0 -> {
      btv<?> $$1 = $$0.ao();
      return $$1 == btv.aJ || $$1 == btv.aG || $$1 == btv.Q;
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
   private static final bra cr = bae.a(20, 39);
   @Nullable
   private UUID cs;

   public chd(btv<? extends chd> $$0, deg $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(erg.f, -1.0F);
      this.a(erg.g, -1.0F);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbb(this));
      this.bS.a(1, new bvg.a(1.5, awv.G));
      this.bS.a(2, new ccm(this));
      this.bS.a(3, new chd.a<>(this, cih.class, 24.0F, 1.5, 1.5));
      this.bS.a(4, new cbn(this, 0.4F));
      this.bS.a(5, new cbr(this, 1.0, true));
      this.bS.a(6, new cbf(this, 1.0, 10.0F, 2.0F));
      this.bS.a(7, new cat(this, 1.0));
      this.bS.a(8, new ccu(this, 1.0));
      this.bS.a(9, new cap(this, 8.0F));
      this.bS.a(10, new cbp(this, cnu.class, 8.0F));
      this.bS.a(10, new ccc(this));
      this.bT.a(1, new cde(this));
      this.bT.a(2, new cdf(this));
      this.bT.a(3, new ccz(this).a());
      this.bT.a(4, new cda<>(this, cnu.class, 10, true, false, this::a_));
      this.bT.a(5, new cdd<>(this, cga.class, false, cc));
      this.bT.a(6, new cdd<>(this, chb.class, false, chb.bY));
      this.bT.a(7, new cda<>(this, cki.class, false));
      this.bT.a(8, new cdg<>(this, true));
   }

   public alc gB() {
      che $$0 = this.gC().a();
      if (this.q()) {
         return $$0.b();
      } else {
         return this.ac_() ? $$0.c() : $$0.a();
      }
   }

   public jn<che> gC() {
      return this.am.a(ch);
   }

   public void j(jn<che> $$0) {
      this.am.a(ch, $$0);
   }

   public static bvq.a gD() {
      return cga.gu().a(bvr.v, 0.3F).a(bvr.s, 8.0).a(bvr.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      kb $$1 = this.dU();
      ka<che> $$2 = $$1.d(lv.m);
      $$0.a(ch, $$2.b(chf.j).or($$2::a).orElseThrow());
      $$0.a(ce, false);
      $$0.a(cf, cuj.o.a());
      $$0.a(cg, 0);
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.CZ, 0.15F, 1.0F);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gF().a());
      this.gC().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.a_($$0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      Optional.ofNullable(alc.c($$0.l("variant"))).map($$0x -> alb.a(lv.m, $$0x)).flatMap($$0x -> this.dU().d(lv.m).b($$0x)).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cuj.a($$0.h("CollarColor")));
      }

      this.a(this.dS(), $$0);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      jn<dfh> $$4 = $$0.t(this.ds());
      jn<che> $$6;
      if ($$3 instanceof chd.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = chf.a(this.dU(), $$4);
         $$3 = new chd.b($$6);
      }

      this.j($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected awd w() {
      if (this.ac_()) {
         return awe.CU;
      } else if (this.af.a(3) == 0) {
         return this.q() && this.eA() < 20.0F ? awe.Da : awe.CX;
      } else {
         return awe.CS;
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return this.g($$0) ? awe.CQ : awe.CW;
   }

   @Override
   protected awd n_() {
      return awe.CT;
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dS().B && this.cn && !this.co && !this.gl() && this.aH()) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
         this.dS().a(this, (byte)8);
      }

      if (!this.dS().B) {
         this.a((arh)this.dS(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bI()) {
         this.cm = this.cl;
         if (this.gH()) {
            this.cl = this.cl + (1.0F - this.cl) * 0.4F;
         } else {
            this.cl = this.cl + (0.0F - this.cl) * 0.4F;
         }

         if (this.bk()) {
            this.cn = true;
            if (this.co && !this.dS().B) {
               this.dS().a(this, (byte)56);
               this.gI();
            }
         } else if ((this.cn || this.co) && this.co) {
            if (this.cp == 0.0F) {
               this.a(awe.CY, this.fd(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.a(dzl.u);
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
               float $$0 = (float)this.dz();
               int $$1 = (int)(azd.a((this.cp - 0.4F) * (float) Math.PI) * 7.0F);
               eys $$2 = this.dv();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.dn() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.dn() * 0.5F;
                  this.dS().a(ln.am, this.dx() + (double)$$4, (double)($$0 + 0.8F), this.dD() + (double)$$5, $$2.d, $$2.e, $$2.f);
               }
            }
         }
      }
   }

   private void gI() {
      this.co = false;
      this.cp = 0.0F;
      this.cq = 0.0F;
   }

   @Override
   public void a(bsg $$0) {
      this.cn = false;
      this.co = false;
      this.cq = 0.0F;
      this.cp = 0.0F;
      super.a($$0);
   }

   public float J(float $$0) {
      return !this.cn ? 1.0F : Math.min(0.75F + azd.h($$0, this.cq, this.cp) / 2.0F * 0.25F, 1.0F);
   }

   public float K(float $$0) {
      return azd.h($$0, this.cq, this.cp);
   }

   public float L(float $$0) {
      return azd.h($$0, this.cm, this.cl) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ae() {
      return this.y() ? 20 : super.ae();
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dS().B) {
            this.z(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean e(btw $$0) {
      return true;
   }

   @Override
   protected void f(bsg $$0, float $$1) {
      if (!this.g($$0)) {
         super.f($$0, $$1);
      } else {
         cvp $$2 = this.fT();
         int $$3 = $$2.o();
         int $$4 = $$2.p();
         $$2.a(azd.f($$1), this, btw.g);
         if (btl.b.a($$3, $$4) != btl.b.a(this.fT())) {
            this.a(awe.CP);
            if (this.dS() instanceof arh $$5) {
               $$5.a(new lj(ln.S, cvt.or.v()), this.dx(), this.dz() + 1.0, this.dD(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean g(bsg $$0) {
      return this.gG() && !$$0.a(awv.C);
   }

   @Override
   protected void t() {
      if (this.q()) {
         this.g(bvr.s).a(40.0);
         this.x(40.0F);
      } else {
         this.g(bvr.s).a(8.0);
      }
   }

   @Override
   protected void b(bsg $$0, float $$1) {
      this.a($$0, $$1, new btw[]{btw.g});
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      cvk $$3 = $$2.h();
      if (this.q()) {
         if (this.n($$2) && this.eA() < this.eQ()) {
            $$2.a(1, $$0);
            cqt $$4 = $$2.a(kr.v);
            float $$5 = $$4 != null ? (float)$$4.a() : 1.0F;
            this.c(2.0F * $$5);
            return brp.a;
         } else {
            if ($$3 instanceof cuk $$6 && this.j($$0)) {
               cuj $$7 = $$6.c();
               if ($$7 != this.gF()) {
                  this.a($$7);
                  $$2.a(1, $$0);
                  return brp.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cvt.os) && this.j($$0) && this.fT().f() && !this.o_()) {
               this.l($$2.c(1));
               $$2.a(1, $$0);
               return brp.a;
            } else if ($$2.a(cvt.rW) && this.j($$0) && this.gG() && (!dbm.a(this.fT(), dbl.E) || $$0.f())) {
               $$2.a(1, $$0, d($$1));
               this.a(awe.az);
               cvp $$8 = this.fT();
               this.l(cvp.k);
               this.b($$8);
               return brp.a;
            } else if (this.y() && this.gG() && this.j($$0) && this.fT().n() && this.fT().b($$2)) {
               $$2.h(1);
               this.a(awe.CR);
               cvp $$9 = this.fT();
               int $$10 = (int)((float)$$9.p() * 0.125F);
               $$9.b(Math.max(0, $$9.o() - $$10));
               return brp.a;
            } else {
               brp $$11 = super.b($$0, $$1);
               if (!$$11.a() && this.j($$0)) {
                  this.z(!this.gp());
                  this.bj = false;
                  this.bR.o();
                  this.h(null);
                  return brp.a.b();
               } else {
                  return $$11;
               }
            }
         }
      } else if (!this.dS().B && $$2.a(cvt.rA) && !this.ac_()) {
         $$2.a(1, $$0);
         this.g($$0);
         return brp.b;
      } else {
         return super.b($$0, $$1);
      }
   }

   private void g(cnu $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.bR.o();
         this.h(null);
         this.z(true);
         this.dS().a(this, (byte)7);
      } else {
         this.dS().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.co = true;
         this.cp = 0.0F;
         this.cq = 0.0F;
      } else if ($$0 == 56) {
         this.gI();
      } else {
         super.b($$0);
      }
   }

   public float gE() {
      if (this.ac_()) {
         return 1.5393804F;
      } else if (this.q()) {
         float $$0 = this.eQ();
         float $$1 = ($$0 - this.eA()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ad);
   }

   @Override
   public int fS() {
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

   public cuj gF() {
      return cuj.a(this.am.a(cf));
   }

   public boolean gG() {
      return this.fT().a(cvt.os);
   }

   private void a(cuj $$0) {
      this.am.a(cf, $$0.a());
   }

   @Nullable
   public chd b(arh $$0, bth $$1) {
      chd $$2 = btv.bs.a($$0, btu.e);
      if ($$2 != null && $$1 instanceof chd $$3) {
         if (this.af.h()) {
            $$2.j(this.gC());
         } else {
            $$2.j($$3.gC());
         }

         if (this.q()) {
            $$2.b(this.Z_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gF());
            } else {
               $$2.a($$3.gF());
            }
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.a(ce, $$0);
   }

   @Override
   public boolean a(cga $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.q()) {
         return false;
      } else if (!($$0 instanceof chd $$1)) {
         return false;
      } else if (!$$1.q()) {
         return false;
      } else {
         return $$1.y() ? false : this.gz() && $$1.gz();
      }
   }

   public boolean gH() {
      return this.am.a(ce);
   }

   @Override
   public boolean a(buk $$0, buk $$1) {
      if ($$0 instanceof ckm || $$0 instanceof cku || $$0 instanceof cjt) {
         return false;
      } else if ($$0 instanceof chd $$2) {
         return !$$2.q() || $$2.R_() != $$1;
      } else {
         if ($$0 instanceof cnu $$3 && $$1 instanceof cnu $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cie $$5 && $$5.gG()) {
            return false;
         }

         if ($$0 instanceof bvg $$6 && $$6.q()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean A() {
      return !this.ac_();
   }

   @Override
   public eys cQ() {
      return new eys(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   public static boolean c(btv<chd> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.cg) && a($$1, $$3);
   }

   class a<T extends buk> extends cao<T> {
      private final chd j;

      public a(final chd $$0, final Class<T> $$1, final float $$2, final double $$3, final double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b instanceof cih ? !this.j.q() && this.a((cih)this.b) : false;
      }

      private boolean a(cih $$0) {
         return $$0.gt() >= chd.this.af.a(5);
      }

      @Override
      public void d() {
         chd.this.h(null);
         super.d();
      }

      @Override
      public void a() {
         chd.this.h(null);
         super.a();
      }
   }

   public static class b extends bth.a {
      public final jn<che> a;

      public b(jn<che> $$0) {
         super(false);
         this.a = $$0;
      }
   }
}
