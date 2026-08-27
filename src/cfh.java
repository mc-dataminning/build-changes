import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfh extends btk implements bsu, btn<ja<cfi>> {
   private static final ajy<Boolean> cl = akc.a(cfh.class, aka.k);
   private static final ajy<Integer> cm = akc.a(cfh.class, aka.b);
   private static final ajy<Integer> cn = akc.a(cfh.class, aka.b);
   private static final ajy<ja<cfi>> co = akc.a(cfh.class, aka.y);
   public static final Predicate<bso> ck = $$0 -> {
      bsb<?> $$1 = $$0.ak();
      return $$1 == bsb.aL || $$1 == bsb.aI || $$1 == bsb.S;
   };
   private static final float cp = 8.0F;
   private static final float cq = 40.0F;
   private static final float cr = 0.125F;
   private float cs;
   private float ct;
   private boolean cu;
   private boolean cv;
   private float cw;
   private float cx;
   private static final bpl cy = azl.a(20, 39);
   @Nullable
   private UUID cz;

   public cfh(bsb<? extends cfh> $$0, dca $$1) {
      super($$0, $$1);
      this.b(false, false);
      this.a(epv.f, -1.0F);
      this.a(epv.g, -1.0F);
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzf(this));
      this.cb.a(1, new cfh.c(1.5));
      this.cb.a(2, new caq(this));
      this.cb.a(3, new cfh.a<>(this, cgl.class, 24.0F, 1.5, 1.5));
      this.cb.a(4, new bzr(this, 0.4F));
      this.cb.a(5, new bzv(this, 1.0, true));
      this.cb.a(6, new bzj(this, 1.0, 10.0F, 2.0F, false));
      this.cb.a(7, new byx(this, 1.0));
      this.cb.a(8, new cay(this, 1.0));
      this.cb.a(9, new byt(this, 8.0F));
      this.cb.a(10, new bzt(this, cly.class, 8.0F));
      this.cb.a(10, new cag(this));
      this.cc.a(1, new cbi(this));
      this.cc.a(2, new cbj(this));
      this.cc.a(3, new cbd(this).a());
      this.cc.a(4, new cbe<>(this, cly.class, 10, true, false, this::a_));
      this.cc.a(5, new cbh<>(this, cee.class, false, ck));
      this.cc.a(6, new cbh<>(this, cff.class, false, cff.ch));
      this.cc.a(7, new cbe<>(this, cik.class, false));
      this.cc.a(8, new cbk<>(this, true));
   }

   public akt gE() {
      cfi $$0 = this.gF().a();
      if (this.r()) {
         return $$0.b();
      } else {
         return this.aa_() ? $$0.c() : $$0.a();
      }
   }

   public ja<cfi> gF() {
      return this.as.a(co);
   }

   @Override
   public void i(ja<cfi> $$0) {
      this.as.a(co, $$0);
   }

   public static btu.a gG() {
      return bsq.A().a(btv.r, 0.3F).a(btv.q, 8.0).a(btv.c, 4.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(co, this.dY().d(li.m).g(cfj.a));
      $$0.a(cl, false);
      $$0.a(cm, csy.o.a());
      $$0.a(cn, 0);
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.Dn, 0.15F, 1.0F);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gJ().a());
      $$0.a("variant", this.gF().e().orElse(cfj.a).a().toString());
      this.c($$0);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      Optional.ofNullable(akt.a($$0.l("variant"))).map($$0x -> aks.a(li.m, $$0x)).flatMap($$0x -> this.dY().d(li.m).b($$0x)).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csy.a($$0.h("CollarColor")));
      }

      this.a(this.dU(), $$0);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ja<dcz> $$4 = $$0.t(this.du());
      ja<cfi> $$6;
      if ($$3 instanceof cfh.b $$5) {
         $$6 = $$5.a;
      } else {
         $$6 = cfj.a(this.dY(), $$4);
         $$3 = new cfh.b($$6);
      }

      this.i($$6);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected avn u() {
      if (this.aa_()) {
         return avo.Di;
      } else if (this.al.a(3) == 0) {
         return this.r() && this.eI() < 20.0F ? avo.Do : avo.Dl;
      } else {
         return avo.Dg;
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return this.i($$0) ? avo.De : avo.Dk;
   }

   @Override
   protected avn n_() {
      return avo.Dh;
   }

   @Override
   protected float fn() {
      return 0.4F;
   }

   @Override
   public void m_() {
      super.m_();
      if (!this.dU().C && this.cu && !this.cv && !this.gu() && this.aE()) {
         this.cv = true;
         this.cw = 0.0F;
         this.cx = 0.0F;
         this.dU().a(this, (byte)8);
      }

      if (!this.dU().C) {
         this.a_((aqt)this.dU(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bI()) {
         this.ct = this.cs;
         if (this.gL()) {
            this.cs = this.cs + (1.0F - this.cs) * 0.4F;
         } else {
            this.cs = this.cs + (0.0F - this.cs) * 0.4F;
         }

         if (this.bk()) {
            this.cu = true;
            if (this.cv && !this.dU().C) {
               this.dU().a(this, (byte)56);
               this.gM();
            }
         } else if ((this.cu || this.cv) && this.cv) {
            if (this.cw == 0.0F) {
               this.a(avo.Dm, this.fn(), (this.al.i() - this.al.i()) * 0.2F + 1.0F);
               this.a(dxv.u);
            }

            this.cx = this.cw;
            this.cw += 0.05F;
            if (this.cx >= 2.0F) {
               this.cu = false;
               this.cv = false;
               this.cx = 0.0F;
               this.cw = 0.0F;
            }

            if (this.cw > 0.4F) {
               float $$0 = (float)this.dB();
               int $$1 = (int)(aym.a((this.cw - 0.4F) * (float) Math.PI) * 7.0F);
               ewu $$2 = this.dx();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.al.i() * 2.0F - 1.0F) * this.do() * 0.5F;
                  float $$5 = (this.al.i() * 2.0F - 1.0F) * this.do() * 0.5F;
                  this.dU().a(lb.ak, this.dz() + (double)$$4, (double)($$0 + 0.8F), this.dF() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gM() {
      this.cv = false;
      this.cw = 0.0F;
      this.cx = 0.0F;
   }

   @Override
   public void a(bqt $$0) {
      this.cu = false;
      this.cv = false;
      this.cx = 0.0F;
      this.cw = 0.0F;
      super.a($$0);
   }

   public boolean gH() {
      return this.cu;
   }

   public float G(float $$0) {
      return Math.min(0.5F + aym.i($$0, this.cx, this.cw) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aym.i($$0, this.cx, this.cw) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aym.a($$2 * (float) Math.PI) * aym.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float H(float $$0) {
      return aym.i($$0, this.ct, this.cs) * 0.15F * (float) Math.PI;
   }

   @Override
   public int Z() {
      return this.x() ? 20 : super.Z();
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dU().C) {
            this.y(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   protected void f(bqt $$0, float $$1) {
      if (!this.i($$0)) {
         super.f($$0, $$1);
      } else {
         cuh $$2 = this.fZ();
         int $$3 = $$2.m();
         int $$4 = $$2.n();
         $$2.a(aym.f($$1), this, bsc.g);
         if (brt.b.a($$3, $$4) != brt.b.a(this.fZ())) {
            this.a(avo.Dd);
            if (this.dU() instanceof aqt $$5) {
               $$5.a(new kx(lb.Q, cuk.pG.v()), this.dz(), this.dB() + 1.0, this.dF(), 20, 0.2, 0.1, 0.2, 0.1);
            }
         }
      }
   }

   private boolean i(bqt $$0) {
      return this.gK() && !$$0.a(awg.D);
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = $$0.a(this.dX().b((bso)this), (float)((int)this.g(btv.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   protected void t() {
      if (this.r()) {
         this.f(btv.q).a(40.0);
         this.t(40.0F);
      } else {
         this.f(btv.q).a(8.0);
      }
   }

   @Override
   protected void b(bqt $$0, float $$1) {
      this.a($$0, $$1, new bsc[]{bsc.g});
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      cuc $$3 = $$2.f();
      if (!this.dU().C || this.o_() && this.o($$2)) {
         if (this.r()) {
            if (this.o($$2) && this.eI() < this.eZ()) {
               $$2.a(1, $$0);
               cov $$5 = $$2.a(ke.t);
               float $$6 = $$5 != null ? (float)$$5.b() : 1.0F;
               this.c(2.0F * $$6);
               return bqa.a(this.dU().x_());
            } else {
               if ($$3 instanceof csz $$7 && this.j($$0)) {
                  csy $$8 = $$7.c();
                  if ($$8 != this.gJ()) {
                     this.a($$8);
                     $$2.a(1, $$0);
                     return bqa.a;
                  }

                  return super.b($$0, $$1);
               }

               if ($$2.a(cuk.pH) && this.j($$0) && !this.gK() && !this.o_()) {
                  this.m($$2.c(1));
                  $$2.a(1, $$0);
                  return bqa.a;
               } else if ($$2.a(cuk.ts) && this.j($$0) && this.gK() && !dae.f(this.fZ())) {
                  $$2.a(1, $$0, d($$1));
                  this.a(avo.aE);
                  cuh $$9 = this.fZ();
                  this.m(cuh.i);
                  this.b($$9);
                  return bqa.a;
               } else if (crv.h.a().d().get().a($$2) && this.x() && this.gK() && this.j($$0) && this.fZ().l()) {
                  $$2.h(1);
                  this.a(avo.Df);
                  cuh $$10 = this.fZ();
                  int $$11 = (int)((float)$$10.n() * 0.125F);
                  $$10.b(Math.max(0, $$10.m() - $$11));
                  return bqa.a;
               } else {
                  bqa $$12 = super.b($$0, $$1);
                  if (!$$12.a() && this.j($$0)) {
                     this.y(!this.gy());
                     this.by = false;
                     this.ca.n();
                     this.h(null);
                     return bqa.a;
                  } else {
                     return $$12;
                  }
               }
            }
         } else if ($$2.a(cuk.sW) && !this.aa_()) {
            $$2.a(1, $$0);
            this.h($$0);
            return bqa.a;
         } else {
            return super.b($$0, $$1);
         }
      } else {
         boolean $$4 = this.j($$0) || this.r() || $$2.a(cuk.sW) && !this.r() && !this.aa_();
         return $$4 ? bqa.b : bqa.d;
      }
   }

   private void h(cly $$0) {
      if (this.al.a(3) == 0) {
         this.f($$0);
         this.ca.n();
         this.h(null);
         this.y(true);
         this.dU().a(this, (byte)7);
      } else {
         this.dU().a(this, (byte)6);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cv = true;
         this.cw = 0.0F;
         this.cx = 0.0F;
      } else if ($$0 == 56) {
         this.gM();
      } else {
         super.b($$0);
      }
   }

   public float gI() {
      if (this.aa_()) {
         return 1.5393804F;
      } else if (this.r()) {
         float $$0 = this.eZ();
         float $$1 = ($$0 - this.eI()) / $$0;
         return (0.55F - $$1 * 0.4F) * (float) Math.PI;
      } else {
         return (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ad);
   }

   @Override
   public int ad() {
      return 8;
   }

   @Override
   public int a() {
      return this.as.a(cn);
   }

   @Override
   public void a(int $$0) {
      this.as.a(cn, $$0);
   }

   @Override
   public void c() {
      this.a(cy.a(this.al));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cz;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cz = $$0;
   }

   public csy gJ() {
      return csy.a(this.as.a(cm));
   }

   public boolean gK() {
      return !this.fZ().d();
   }

   private void a(csy $$0) {
      this.as.a(cm, $$0.a());
   }

   @Nullable
   public cfh b(aqt $$0, brp $$1) {
      cfh $$2 = bsb.bw.a((dca)$$0);
      if ($$2 != null && $$1 instanceof cfh $$3) {
         if (this.al.h()) {
            $$2.i(this.gF());
         } else {
            $$2.i($$3.gF());
         }

         if (this.r()) {
            $$2.b(this.X_());
            $$2.b(true, true);
            if (this.al.h()) {
               $$2.a(this.gJ());
            } else {
               $$2.a($$3.gJ());
            }
         }
      }

      return $$2;
   }

   public void z(boolean $$0) {
      this.as.a(cl, $$0);
   }

   @Override
   public boolean a(cee $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.r()) {
         return false;
      } else if (!($$0 instanceof cfh $$1)) {
         return false;
      } else if (!$$1.r()) {
         return false;
      } else {
         return $$1.x() ? false : this.gC() && $$1.gC();
      }
   }

   public boolean gL() {
      return this.as.a(cl);
   }

   @Override
   public boolean a(bso $$0, bso $$1) {
      if ($$0 instanceof cio || $$0 instanceof ciw || $$0 instanceof chw) {
         return false;
      } else if ($$0 instanceof cfh $$2) {
         return !$$2.r() || $$2.Q_() != $$1;
      } else {
         if ($$0 instanceof cly $$3 && $$1 instanceof cly $$4 && !$$4.a($$3)) {
            return false;
         }

         if ($$0 instanceof cgi $$5 && $$5.gN()) {
            return false;
         }

         if ($$0 instanceof btk $$6 && $$6.r()) {
            return false;
         }

         return true;
      }
   }

   @Override
   public boolean a(cly $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.6F * this.cQ()), (double)(this.do() * 0.4F));
   }

   public static boolean c(bsb<cfh> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.ci) && a($$1, $$3);
   }

   class a<T extends bso> extends bys<T> {
      private final cfh j;

      public a(cfh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof cgl ? !this.j.r() && this.a((cgl)this.b) : false;
      }

      private boolean a(cgl $$0) {
         return $$0.gI() >= cfh.this.al.a(5);
      }

      @Override
      public void c() {
         cfh.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         cfh.this.h(null);
         super.e();
      }
   }

   public static class b extends brp.a {
      public final ja<cfi> a;

      public b(ja<cfi> $$0) {
         super(false);
         this.a = $$0;
      }
   }

   class c extends cae {
      public c(double $$0) {
         super(cfh.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dJ() || this.b.bV();
      }
   }
}
