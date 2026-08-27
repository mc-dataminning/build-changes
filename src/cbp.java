import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbp extends bpt implements bpd {
   private static final aii<Boolean> bZ = ail.a(cbp.class, aik.k);
   private static final aii<Integer> ca = ail.a(cbp.class, aik.b);
   private static final aii<Integer> cb = ail.a(cbp.class, aik.b);
   public static final Predicate<box> bY = $$0 -> {
      bol<?> $$1 = $$0.ai();
      return $$1 == bol.aH || $$1 == bol.aE || $$1 == bol.P;
   };
   private static final float cc = 8.0F;
   private static final float cd = 20.0F;
   private float ce;
   private float cf;
   private boolean cg;
   private boolean ch;
   private float ci;
   private float cj;
   private static final blw ck = axl.a(20, 39);
   @Nullable
   private UUID cl;

   public cbp(bol<? extends cbp> $$0, cwe $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eic.f, -1.0F);
      this.a(eic.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bvo(this));
      this.bP.a(1, new cbp.b(1.5));
      this.bP.a(2, new bwz(this));
      this.bP.a(3, new cbp.a<>(this, ccr.class, 24.0F, 1.5, 1.5));
      this.bP.a(4, new bwa(this, 0.4F));
      this.bP.a(5, new bwe(this, 1.0, true));
      this.bP.a(6, new bvs(this, 1.0, 10.0F, 2.0F, false));
      this.bP.a(7, new bvg(this, 1.0));
      this.bP.a(8, new bxh(this, 1.0));
      this.bP.a(9, new bvc(this, 8.0F));
      this.bP.a(10, new bwc(this, cia.class, 8.0F));
      this.bP.a(10, new bwp(this));
      this.bQ.a(1, new bxr(this));
      this.bQ.a(2, new bxs(this));
      this.bQ.a(3, new bxm(this).a());
      this.bQ.a(4, new bxn<>(this, cia.class, 10, true, false, this::a_));
      this.bQ.a(5, new bxq<>(this, cam.class, false, bY));
      this.bQ.a(6, new bxq<>(this, cbn.class, false, cbn.bW));
      this.bQ.a(7, new bxn<>(this, cep.class, false));
      this.bQ.a(8, new bxt<>(this, true));
   }

   public static bqd.a gr() {
      return boz.C().a(bqe.o, 0.3F).a(bqe.n, 8.0).a(bqe.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bZ, false);
      this.am.a(ca, cog.o.a());
      this.am.a(cb, 0);
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.Cf, 0.15F, 1.0F);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gu().a());
      this.c($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cog.a($$0.h("CollarColor")));
      }

      this.a(this.dJ(), $$0);
   }

   @Override
   protected ato y() {
      if (this.aa_()) {
         return atp.Ca;
      } else if (this.af.a(3) == 0) {
         return this.u() && this.eu() < 10.0F ? atp.Cg : atp.Cd;
      } else {
         return atp.BY;
      }
   }

   @Override
   protected ato d(bne $$0) {
      return atp.Cc;
   }

   @Override
   protected ato n_() {
      return atp.BZ;
   }

   @Override
   protected float eY() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dJ().B && this.cg && !this.ch && !this.gh() && this.aC()) {
         this.ch = true;
         this.ci = 0.0F;
         this.cj = 0.0F;
         this.dJ().a(this, (byte)8);
      }

      if (!this.dJ().B) {
         this.a((apa)this.dJ(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bx()) {
         this.cf = this.ce;
         if (this.gw()) {
            this.ce = this.ce + (1.0F - this.ce) * 0.4F;
         } else {
            this.ce = this.ce + (0.0F - this.ce) * 0.4F;
         }

         if (this.bb()) {
            this.cg = true;
            if (this.ch && !this.dJ().B) {
               this.dJ().a(this, (byte)56);
               this.gx();
            }
         } else if ((this.cg || this.ch) && this.ch) {
            if (this.ci == 0.0F) {
               this.a(atp.Ce, this.eY(), (this.af.i() - this.af.i()) * 0.2F + 1.0F);
               this.b(dqr.u);
            }

            this.cj = this.ci;
            this.ci += 0.05F;
            if (this.cj >= 2.0F) {
               this.cg = false;
               this.ch = false;
               this.cj = 0.0F;
               this.ci = 0.0F;
            }

            if (this.ci > 0.4F) {
               float $$0 = (float)this.dq();
               int $$1 = (int)(awm.a((this.ci - 0.4F) * (float) Math.PI) * 7.0F);
               eov $$2 = this.dm();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.af.i() * 2.0F - 1.0F) * this.dd() * 0.5F;
                  float $$5 = (this.af.i() * 2.0F - 1.0F) * this.dd() * 0.5F;
                  this.dJ().a(kb.aj, this.do() + (double)$$4, (double)($$0 + 0.8F), this.du() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gx() {
      this.ch = false;
      this.ci = 0.0F;
      this.cj = 0.0F;
   }

   @Override
   public void a(bne $$0) {
      this.cg = false;
      this.ch = false;
      this.cj = 0.0F;
      this.ci = 0.0F;
      super.a($$0);
   }

   public boolean gs() {
      return this.cg;
   }

   public float E(float $$0) {
      return Math.min(0.5F + awm.i($$0, this.cj, this.ci) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (awm.i($$0, this.cj, this.ci) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return awm.a($$2 * (float) Math.PI) * awm.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return awm.i($$0, this.cf, this.ce) * 0.15F * (float) Math.PI;
   }

   @Override
   public int ab() {
      return this.A() ? 20 : super.ab();
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bof $$2 = $$0.d();
         if (!this.dJ().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cia) && !($$2 instanceof cig)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = $$0.a(this.dK().b((box)this), (float)((int)this.g(bqe.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.f(bqe.n).a(20.0);
         this.t(20.0F);
      } else {
         this.f(bqe.n).a(8.0);
      }

      this.f(bqe.c).a(4.0);
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      cpl $$3 = $$2.d();
      if (this.dJ().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(cpt.ry) && !this.u() && !this.aa_();
         return $$4 ? bml.b : bml.d;
      } else if (this.u()) {
         if (this.o($$2) && this.eu() < this.eL()) {
            if (!$$0.fW().d) {
               $$2.h(1);
            }

            this.c((float)$$3.w().a());
            return bml.a;
         } else {
            if ($$3 instanceof coh $$5 && this.j($$0)) {
               cog $$6 = $$5.c();
               if ($$6 != this.gu()) {
                  this.a($$6);
                  if (!$$0.fW().d) {
                     $$2.h(1);
                  }

                  return bml.a;
               }

               return super.b($$0, $$1);
            }

            if ($$2.a(cpt.oq) && this.j($$0) && !this.gv() && !this.o_()) {
               this.m($$2.c(1));
               if (!$$0.fW().d) {
                  $$2.h(1);
               }

               return bml.a;
            } else if ($$2.a(cpt.rU) && this.j($$0) && this.gv()) {
               if (!$$0.fW().d) {
                  $$2.a(1, $$0, d($$1));
               }

               this.a(atp.ax);
               cpq $$7 = this.fN();
               this.m(cpq.h);
               this.b($$7);
               return bml.a;
            } else {
               bml $$8 = super.b($$0, $$1);
               if ((!$$8.a() || this.o_()) && this.j($$0)) {
                  this.z(!this.gl());
                  this.bk = false;
                  this.bO.n();
                  this.h(null);
                  return bml.a;
               } else {
                  return $$8;
               }
            }
         }
      } else if ($$2.a(cpt.ry) && !this.aa_()) {
         if (!$$0.fW().d) {
            $$2.h(1);
         }

         if (this.af.a(3) == 0) {
            this.f($$0);
            this.bO.n();
            this.h(null);
            this.z(true);
            this.dJ().a(this, (byte)7);
         } else {
            this.dJ().a(this, (byte)6);
         }

         return bml.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.ch = true;
         this.ci = 0.0F;
         this.cj = 0.0F;
      } else if ($$0 == 56) {
         this.gx();
      } else {
         super.b($$0);
      }
   }

   public float gt() {
      if (this.aa_()) {
         return 1.5393804F;
      } else {
         return this.u() ? (0.55F - (this.eL() - this.eu()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cpq $$0) {
      cpl $$1 = $$0.d();
      return $$1.v() && $$1.w().c();
   }

   @Override
   public int fM() {
      return 8;
   }

   @Override
   public int a() {
      return this.am.b(cb);
   }

   @Override
   public void a(int $$0) {
      this.am.b(cb, $$0);
   }

   @Override
   public void c() {
      this.a(ck.a(this.af));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cl;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cl = $$0;
   }

   public cog gu() {
      return cog.a(this.am.b(ca));
   }

   public boolean gv() {
      return !this.fN().b();
   }

   public void a(cog $$0) {
      this.am.b(ca, $$0.a());
   }

   @Nullable
   public cbp b(apa $$0, boa $$1) {
      cbp $$2 = bol.bq.a((cwe)$$0);
      if ($$2 != null) {
         UUID $$3 = this.d();
         if ($$3 != null) {
            $$2.b($$3);
            $$2.x(true);
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.am.b(bZ, $$0);
   }

   @Override
   public boolean a(cam $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof cbp $$1)) {
         return false;
      } else if (!$$1.u()) {
         return false;
      } else {
         return $$1.A() ? false : this.gp() && $$1.gp();
      }
   }

   public boolean gw() {
      return this.am.b(bZ);
   }

   @Override
   public boolean a(box $$0, box $$1) {
      if ($$0 instanceof ces || $$0 instanceof cfa) {
         return false;
      } else if ($$0 instanceof cbp $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof cia && $$1 instanceof cia && !((cia)$$1).a((cia)$$0)) {
         return false;
      } else {
         return $$0 instanceof cco && ((cco)$$0).gA() ? false : !($$0 instanceof bpt) || !((bpt)$$0).u();
      }
   }

   @Override
   public boolean a(cia $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.6F * this.cF()), (double)(this.dd() * 0.4F));
   }

   public static boolean c(bol<cbp> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bY) && a($$1, $$3);
   }

   class a<T extends box> extends bvb<T> {
      private final cbp j;

      public a(cbp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof ccr ? !this.j.u() && this.a((ccr)this.b) : false;
      }

      private boolean a(ccr $$0) {
         return $$0.gv() >= cbp.this.af.a(5);
      }

      @Override
      public void c() {
         cbp.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cbp.this.h(null);
         super.e();
      }
   }

   class b extends bwn {
      public b(double $$0) {
         super(cbp.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dy() || this.b.bK();
      }
   }
}
