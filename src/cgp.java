import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgp extends bvs implements bvv<jp<cgq>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final akk<jp<cgq>> cf = ako.a(cgp.class, akm.x);
   private static final akk<Boolean> cg = ako.a(cgp.class, akm.k);
   private static final akk<Boolean> ch = ako.a(cgp.class, akm.k);
   private static final akk<Integer> ci = ako.a(cgp.class, akm.b);
   private static final alg<cgq> cj = cgq.c;
   @Nullable
   private cgp.a<coh> ck;
   @Nullable
   private cdb cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public cgp(bug<? extends cgp> $$0, dev $$1) {
      super($$0, $$1);
      this.gN();
   }

   @Override
   protected void D() {
      this.cl = new cgp.c(this, 0.6, $$0 -> $$0.a(axi.af), true);
      this.bS.a(1, new cbn(this));
      this.bS.a(1, new bvs.a(1.5));
      this.bS.a(2, new ccy(this));
      this.bS.a(3, new cgp.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cbg(this, 1.1, 8));
      this.bS.a(6, new cbr(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cbh(this, 0.8));
      this.bS.a(8, new cbz(this, 0.3F));
      this.bS.a(9, new ccj(this));
      this.bS.a(10, new cbf(this, 0.8));
      this.bS.a(11, new cdg(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new ccb(this, coh.class, 10.0F));
      this.bT.a(1, new cdp<>(this, chg.class, false, null));
      this.bT.a(1, new cdp<>(this, chn.class, false, chn.bY));
   }

   public jp<cgq> gH() {
      return this.am.a(cf);
   }

   public void j(jp<cgq> $$0) {
      this.am.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.am.a(cg, $$0);
   }

   public boolean gI() {
      return this.am.a(cg);
   }

   void B(boolean $$0) {
      this.am.a(ch, $$0);
   }

   boolean gO() {
      return this.am.a(ch);
   }

   public cuu gJ() {
      return cuu.a(this.am.a(ci));
   }

   private void a(cuu $$0) {
      this.am.a(ci, $$0.a());
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cf, lx.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cuu.o.a());
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("variant", this.gH().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gJ().a());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      Optional.ofNullable(alh.c($$0.l("variant"))).map($$0x -> alg.a(ly.l, $$0x)).flatMap(lx.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cuu.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void ac() {
      if (this.M().b()) {
         double $$0 = this.M().c();
         if ($$0 == 0.6) {
            this.b(bvh.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bvh.a);
            this.h(true);
         } else {
            this.b(bvh.a);
            this.h(false);
         }
      } else {
         this.b(bvh.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awj w() {
      if (this.q()) {
         if (this.gF()) {
            return awk.dY;
         } else {
            return this.af.a(4) == 0 ? awk.dZ : awk.dR;
         }
      } else {
         return awk.dS;
      }
   }

   @Override
   public int T() {
      return 120;
   }

   public void gK() {
      this.b(awk.dV);
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.dX;
   }

   @Override
   protected awj o_() {
      return awk.dT;
   }

   public static bwc.a gL() {
      return cgm.gA().a(bwd.s, 10.0).a(bwd.v, 0.3F).a(bwd.c, 3.0);
   }

   @Override
   protected void gB() {
      this.a(awk.dU, 1.0F, 1.0F);
   }

   @Override
   public void l() {
      super.l();
      if (this.cl != null && this.cl.i() && !this.q() && this.ag % 100 == 0) {
         this.a(awk.dW, 1.0F, 1.0F);
      }

      this.gP();
   }

   private void gP() {
      if ((this.gI() || this.gO()) && this.ag % 5 == 0) {
         this.a(awk.dY, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gQ();
      this.gR();
      this.cq = false;
      if (this.gI()) {
         jg $$0 = this.dx();

         for (coh $$2 : this.dX().a(coh.class, new ezc($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fT()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gM() {
      return this.cq;
   }

   private void gQ() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gI()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gR() {
      this.cs = this.cr;
      if (this.gO()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return azj.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return azj.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return azj.h($$0, this.cs, this.cr);
   }

   @Nullable
   public cgp b(arm $$0, btq $$1) {
      cgp $$2 = bug.p.a($$0, buf.e);
      if ($$2 != null && $$1 instanceof cgp $$3) {
         if (this.af.h()) {
            $$2.j(this.gH());
         } else {
            $$2.j($$3.gH());
         }

         if (this.q()) {
            $$2.b(this.ab_());
            $$2.b(true, true);
            if (this.af.h()) {
               $$2.a(this.gJ());
            } else {
               $$2.a($$3.gJ());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgm $$0) {
      if (!this.q()) {
         return false;
      } else {
         return !($$0 instanceof cgp $$1) ? false : $$1.q() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ar() > 0.9F;
      axp<cgq> $$5 = $$4 ? axa.b : axa.a;
      lx.ai.a($$5, $$0.E_()).ifPresent(this::j);
      arm $$6 = $$0.E();
      if ($$6.a().a(this.dx(), axl.o).b()) {
         this.j(lx.ai.b(cgq.l));
         this.gb();
      }

      return $$3;
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      cvt $$3 = $$2.h();
      if (this.q()) {
         if (this.j($$0)) {
            if ($$3 instanceof cuv $$4) {
               cuu $$5 = $$4.c();
               if ($$5 != this.gJ()) {
                  if (!this.dX().y_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gb();
                  }

                  return bry.a;
               }
            } else if (this.l($$2) && this.eG() < this.eV()) {
               if (!this.dX().y_()) {
                  this.a($$0, $$1, $$2);
                  crg $$6 = $$2.a(kt.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gB();
               }

               return bry.a;
            }

            bry $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gv());
               return bry.a;
            }

            return $$7;
         }
      } else if (this.l($$2)) {
         if (!this.dX().y_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.gb();
            this.gB();
         }

         return bry.a;
      }

      bry $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gb();
      }

      return $$8;
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.af);
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && this.ag > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gN();
   }

   protected void gN() {
      if (this.ck == null) {
         this.ck = new cgp.a<>(this, coh.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.q()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(coh $$0) {
      if (this.af.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dX().a(this, (byte)7);
      } else {
         this.dX().a(this, (byte)6);
      }
   }

   @Override
   public boolean cf() {
      return this.cj() || super.cf();
   }

   static class a<T extends buv> extends cba<T> {
      private final cgp i;

      public a(cgp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bue.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.q() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.q() && super.c();
      }
   }

   static class b extends cbt {
      private final cgp a;
      @Nullable
      private coh b;
      @Nullable
      private jg c;
      private int d;

      public b(cgp $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.q()) {
            return false;
         } else if (this.a.gv()) {
            return false;
         } else {
            buv $$0 = this.a.T_();
            if ($$0 instanceof coh) {
               this.b = (coh)$$0;
               if (!$$0.fT()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jg $$1 = this.b.dx();
               dvd $$2 = this.a.dX().a_($$1);
               if ($$2.a(awz.S)) {
                  this.c = $$2.d(dhr.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jg($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cgp $$1 : this.a.dX().a(cgp.class, new ezc(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gI() || $$1.gO())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.q() && !this.a.gv() && this.b != null && this.b.fT() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dX().f(1.0F);
         if (this.b.go() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dX().E_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.P().o();
      }

      private void i() {
         azr $$0 = this.a.ea();
         jg.a $$1 = new jg.a();
         $$1.g(this.a.M_() ? this.a.C().dx() : this.a.dx());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dx());
         eub $$2 = this.a.dX().o().bd().b(ets.aq);
         etz $$3 = new etz.a((arm)this.a.dX()).a(ews.f, this.a.dv()).a(ews.a, this.a).a(ewr.j);

         for (cvx $$5 : $$2.a($$3)) {
            this.a
               .dX()
               .b(
                  new ckq(
                     this.a.dX(),
                     (double)$$1.u() - (double)azj.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)azj.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.P().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends cdb {
      @Nullable
      private coh c;
      private final cgp d;

      public c(cgp $$0, double $$1, Predicate<cvx> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.ea().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.ea().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.q();
      }
   }
}
