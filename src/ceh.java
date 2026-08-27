import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ceh extends btk implements btn<ja<cei>> {
   public static final double ck = 0.6;
   public static final double cl = 0.8;
   public static final double cm = 1.33;
   private static final ajy<ja<cei>> cn = akc.a(ceh.class, aka.x);
   private static final ajy<Boolean> co = akc.a(ceh.class, aka.k);
   private static final ajy<Boolean> cp = akc.a(ceh.class, aka.k);
   private static final ajy<Integer> cq = akc.a(ceh.class, aka.b);
   private static final aks<cei> cr = cei.b;
   @Nullable
   private ceh.a<cly> cs;
   @Nullable
   private cat ct;
   private float cu;
   private float cv;
   private float cw;
   private float cx;
   private float cy;
   private float cz;

   public ceh(bsb<? extends ceh> $$0, dca $$1) {
      super($$0, $$1);
      this.gK();
   }

   public akt gE() {
      return this.gF().a().a();
   }

   @Override
   protected void y() {
      this.ct = new ceh.c(this, 0.6, $$0 -> $$0.a(awm.ae), true);
      this.cb.a(1, new bzf(this));
      this.cb.a(1, new cae(this, 1.5));
      this.cb.a(2, new caq(this));
      this.cb.a(3, new ceh.b(this));
      this.cb.a(4, this.ct);
      this.cb.a(5, new byy(this, 1.1, 8));
      this.cb.a(6, new bzj(this, 1.0, 10.0F, 5.0F, false));
      this.cb.a(7, new byz(this, 0.8));
      this.cb.a(8, new bzr(this, 0.3F));
      this.cb.a(9, new cab(this));
      this.cb.a(10, new byx(this, 0.8));
      this.cb.a(11, new cay(this, 0.8, 1.0000001E-5F));
      this.cb.a(12, new bzt(this, cly.class, 10.0F));
      this.cc.a(1, new cbh<>(this, cey.class, false, null));
      this.cc.a(1, new cbh<>(this, cff.class, false, cff.ch));
   }

   public ja<cei> gF() {
      return this.as.a(cn);
   }

   @Override
   public void i(ja<cei> $$0) {
      this.as.a(cn, $$0);
   }

   public void z(boolean $$0) {
      this.as.a(co, $$0);
   }

   public boolean gG() {
      return this.as.a(co);
   }

   void A(boolean $$0) {
      this.as.a(cp, $$0);
   }

   boolean gL() {
      return this.as.a(cp);
   }

   public csy gH() {
      return csy.a(this.as.a(cq));
   }

   private void a(csy $$0) {
      this.as.a(cq, $$0.a());
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cn, lh.ak.g(cr));
      $$0.a(co, false);
      $$0.a(cp, false);
      $$0.a(cq, csy.o.a());
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("variant", this.gF().e().orElse(cr).a().toString());
      $$0.a("CollarColor", (byte)this.gH().a());
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      Optional.ofNullable(akt.a($$0.l("variant"))).map($$0x -> aks.a(li.l, $$0x)).flatMap(lh.ak::b).ifPresent(this::i);
      if ($$0.b("CollarColor", 99)) {
         this.a(csy.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void Y() {
      if (this.G().b()) {
         double $$0 = this.G().c();
         if ($$0 == 0.6) {
            this.b(bsz.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bsz.a);
            this.h(true);
         } else {
            this.b(bsz.a);
            this.h(false);
         }
      } else {
         this.b(bsz.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected avn u() {
      if (this.r()) {
         if (this.gC()) {
            return avo.ec;
         } else {
            return this.al.a(4) == 0 ? avo.ed : avo.dV;
         }
      } else {
         return avo.dW;
      }
   }

   @Override
   public int O() {
      return 120;
   }

   public void gI() {
      this.b(avo.dZ);
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.eb;
   }

   @Override
   protected avn n_() {
      return avo.dX;
   }

   public static btu.a gJ() {
      return bsq.A().a(btv.q, 10.0).a(btv.r, 0.3F).a(btv.c, 3.0);
   }

   @Override
   protected void a(cly $$0, bpz $$1, cuh $$2) {
      if (this.o($$2)) {
         this.a(avo.dY, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gM() {
      return (float)this.g(btv.c);
   }

   @Override
   public boolean C(brv $$0) {
      return $$0.a(this.dX().b((bso)this), this.gM());
   }

   @Override
   public void l() {
      super.l();
      if (this.ct != null && this.ct.i() && !this.r() && this.am % 100 == 0) {
         this.a(avo.ea, 1.0F, 1.0F);
      }

      this.gN();
   }

   private void gN() {
      if ((this.gG() || this.gL()) && this.am % 5 == 0) {
         this.a(avo.ec, 0.6F + 0.4F * (this.al.i() - this.al.i()), 1.0F);
      }

      this.gO();
      this.gP();
   }

   private void gO() {
      this.cv = this.cu;
      this.cx = this.cw;
      if (this.gG()) {
         this.cu = Math.min(1.0F, this.cu + 0.15F);
         this.cw = Math.min(1.0F, this.cw + 0.08F);
      } else {
         this.cu = Math.max(0.0F, this.cu - 0.22F);
         this.cw = Math.max(0.0F, this.cw - 0.13F);
      }
   }

   private void gP() {
      this.cz = this.cy;
      if (this.gL()) {
         this.cy = Math.min(1.0F, this.cy + 0.1F);
      } else {
         this.cy = Math.max(0.0F, this.cy - 0.13F);
      }
   }

   public float G(float $$0) {
      return aym.i($$0, this.cv, this.cu);
   }

   public float H(float $$0) {
      return aym.i($$0, this.cx, this.cw);
   }

   public float I(float $$0) {
      return aym.i($$0, this.cz, this.cy);
   }

   @Nullable
   public ceh b(aqt $$0, brp $$1) {
      ceh $$2 = bsb.r.a((dca)$$0);
      if ($$2 != null && $$1 instanceof ceh $$3) {
         if (this.al.h()) {
            $$2.i(this.gF());
         } else {
            $$2.i($$3.gF());
         }

         if (this.r()) {
            $$2.b(this.X_());
            $$2.b(true, true);
            if (this.al.h()) {
               $$2.a(this.gH());
            } else {
               $$2.a($$3.gH());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cee $$0) {
      if (!this.r()) {
         return false;
      } else {
         return !($$0 instanceof ceh $$1) ? false : $$1.r() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.aq() > 0.9F;
      awt<cei> $$5 = $$4 ? awf.b : awf.a;
      lh.ak.a($$5, $$0.F_()).ifPresent(this::i);
      aqt $$6 = $$0.E();
      boolean $$7 = $$6.t(this.du()).a(ddg.h);
      boolean $$8 = $$6.a().a(this.du(), awp.o).b();
      if ($$7 || $$8) {
         this.i(lh.ak.g(cei.k));
         this.gc();
      }

      return $$3;
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      cuc $$3 = $$2.f();
      if (this.r()) {
         if (this.j($$0)) {
            if ($$3 instanceof csz $$4) {
               csy $$5 = $$4.c();
               if ($$5 != this.gH()) {
                  if (!this.dU().x_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gc();
                  }

                  return bqa.a(this.dU().x_());
               }
            } else if (this.o($$2) && this.eI() < this.eZ()) {
               if (!this.dU().x_()) {
                  this.a($$0, $$1, $$2);
                  cov $$6 = $$2.a(ke.t);
                  this.c($$6 != null ? (float)$$6.b() : 1.0F);
               }

               return bqa.a(this.dU().x_());
            }

            bqa $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gy());
               return bqa.a(this.dU().x_());
            }

            return $$7;
         }
      } else if (this.o($$2)) {
         if (!this.dU().x_()) {
            this.a($$0, $$1, $$2);
            this.h($$0);
            this.gc();
         }

         return bqa.a(this.dU().x_());
      }

      bqa $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gc();
      }

      return $$8;
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.ae);
   }

   @Override
   public boolean h(double $$0) {
      return !this.r() && this.am > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gK();
   }

   protected void gK() {
      if (this.cs == null) {
         this.cs = new ceh.a<>(this, cly.class, 16.0F, 0.8, 1.33);
      }

      this.cb.a(this.cs);
      if (!this.r()) {
         this.cb.a(4, this.cs);
      }
   }

   private void h(cly $$0) {
      if (this.al.a(3) == 0) {
         this.f($$0);
         this.y(true);
         this.dU().a(this, (byte)7);
      } else {
         this.dU().a(this, (byte)6);
      }
   }

   @Override
   public boolean cb() {
      return this.cf() || super.cb();
   }

   static class a<T extends bso> extends bys<T> {
      private final ceh i;

      public a(ceh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsa.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.r() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.r() && super.b();
      }
   }

   static class b extends bzl {
      private final ceh a;
      @Nullable
      private cly b;
      @Nullable
      private ir c;
      private int d;

      public b(ceh $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.r()) {
            return false;
         } else if (this.a.gy()) {
            return false;
         } else {
            bso $$0 = this.a.Q_();
            if ($$0 instanceof cly) {
               this.b = (cly)$$0;
               if (!$$0.fU()) {
                  return false;
               }

               if (this.a.g((brv)this.b) > 100.0) {
                  return false;
               }

               ir $$1 = this.b.du();
               dtc $$2 = this.a.dU().a_($$1);
               if ($$2.a(awe.R)) {
                  this.c = $$2.d(deu.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new ir($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (ceh $$1 : this.a.dU().a(ceh.class, new ewp(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gG() || $$1.gL())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.r() && !this.a.gy() && this.b != null && this.b.fU() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.x(false);
            this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.z(false);
         float $$0 = this.a.dU().f(1.0F);
         if (this.b.gp() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dU().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.J().n();
      }

      private void i() {
         ayt $$0 = this.a.et();
         ir.a $$1 = new ir.a();
         $$1.g(this.a.gl() ? this.a.gn().du() : this.a.du());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.du());
         eru $$2 = this.a.dU().o().be().b(ern.aS);
         ers $$3 = new ers.a((aqt)this.a.dU()).a(eug.f, this.a.ds()).a(eug.a, this.a).a(euf.i);

         for (cuh $$5 : $$2.a($$3)) {
            this.a
               .dU()
               .b(
                  new cig(
                     this.a.dU(),
                     (double)$$1.u() - (double)aym.a(this.a.bj * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)aym.b(this.a.bj * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.J().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g((brv)this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cat {
      @Nullable
      private cly c;
      private final ceh d;

      public c(ceh $$0, double $$1, Predicate<cuh> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.et().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.et().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.r();
      }
   }
}
