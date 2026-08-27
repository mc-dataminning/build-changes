import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cjf extends bsf implements ciu {
   public static final float b = 7.448451F;
   public static final int c = aym.f(24.166098F);
   private static final ajy<Integer> d = akc.a(cjf.class, aka.b);
   ewu e = ewu.b;
   ir cg = ir.c;
   cjf.a ch = cjf.a.a;

   public cjf(bsb<? extends cjf> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
      this.bY = new cjf.g(this);
      this.bX = new cjf.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.t() + this.am) % c == 0;
   }

   @Override
   protected byj E() {
      return new cjf.d(this);
   }

   @Override
   protected void y() {
      this.cb.a(1, new cjf.c());
      this.cb.a(2, new cjf.i());
      this.cb.a(3, new cjf.e());
      this.cc.a(1, new cjf.b());
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.as.a(d, aym.a($$0, 0, 64));
   }

   private void x() {
      this.i_();
      this.f(btv.c).a((double)(6 + this.r()));
   }

   public int r() {
      return this.as.a(d);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (d.equals($$0)) {
         this.x();
      }

      super.a($$0);
   }

   public int t() {
      return this.al() * 3;
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dU().C) {
         float $$0 = aym.b((float)(this.t() + this.am) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aym.b((float)(this.t() + this.am + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.tS, this.dj(), 0.95F + this.al.i() * 0.05F, 0.95F + this.al.i() * 0.05F, false);
         }

         float $$2 = this.do() * 1.48F;
         float $$3 = aym.b(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = aym.a(this.dK() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dp() * 2.5F;
         this.dU().a(lb.X, this.dz() + (double)$$3, this.dB() + (double)$$5, this.dF() + (double)$$4, 0.0, 0.0, 0.0);
         this.dU().a(lb.X, this.dz() - (double)$$3, this.dB() + (double)$$5, this.dF() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void m_() {
      if (this.bI() && this.gs() && (!this.dU().t(this.du()).a(ddg.h) || this.p() instanceof cly)) {
         this.g(8);
      }

      super.m_();
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.cg = this.du().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.cg = new ir($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("AX", this.cg.u());
      $$0.a("AY", this.cg.v());
      $$0.a("AZ", this.cg.w());
      $$0.a("Size", this.r());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected avn u() {
      return avo.tP;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.tT;
   }

   @Override
   protected avn n_() {
      return avo.tR;
   }

   @Override
   protected float fn() {
      return 1.0F;
   }

   @Override
   public boolean a(bsb<?> $$0) {
      return true;
   }

   @Override
   public bry e(bsz $$0) {
      int $$1 = this.r();
      bry $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bzl {
      private final cde b = cde.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cly> $$0 = cjf.this.dU().a(this.b, cjf.this, cjf.this.cP().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(brv::dB).reversed());

               for (cly $$1 : $$0) {
                  if (cjf.this.a($$1, cde.a)) {
                     cjf.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bso $$0 = cjf.this.p();
         return $$0 != null ? cjf.this.a($$0, cde.a) : false;
      }
   }

   class c extends bzl {
      private int b;

      @Override
      public boolean a() {
         bso $$0 = cjf.this.p();
         return $$0 != null ? cjf.this.a($$0, cde.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cjf.this.ch = cjf.a.a;
         this.h();
      }

      @Override
      public void d() {
         cjf.this.cg = cjf.this.dU().a(dyu.a.e, cjf.this.cg).b(10 + cjf.this.al.a(20));
      }

      @Override
      public void e() {
         if (cjf.this.ch == cjf.a.a) {
            this.b--;
            if (this.b <= 0) {
               cjf.this.ch = cjf.a.b;
               this.h();
               this.b = this.a((8 + cjf.this.al.a(4)) * 20);
               cjf.this.a(avo.tU, 10.0F, 0.95F + cjf.this.al.i() * 0.1F);
            }
         }
      }

      private void h() {
         cjf.this.cg = cjf.this.p().du().b(20 + cjf.this.al.a(20));
         if (cjf.this.cg.v() < cjf.this.dU().A_()) {
            cjf.this.cg = new ir(cjf.this.cg.u(), cjf.this.dU().A_() + 1, cjf.this.cg.w());
         }
      }
   }

   class d extends byj {
      public d(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cjf.this.bl = cjf.this.bj;
         cjf.this.bj = cjf.this.dK();
      }
   }

   class e extends cjf.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cjf.this.p() == null || cjf.this.ch == cjf.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cjf.this.al.i() * 10.0F;
         this.e = -4.0F + cjf.this.al.i() * 9.0F;
         this.f = cjf.this.al.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cjf.this.al.a(this.a(350)) == 0) {
            this.e = -4.0F + cjf.this.al.i() * 9.0F;
         }

         if (cjf.this.al.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cjf.this.al.a(this.a(450)) == 0) {
            this.c = cjf.this.al.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cjf.this.e.d < cjf.this.dB() && !cjf.this.dU().u(cjf.this.du().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cjf.this.e.d > cjf.this.dB() && !cjf.this.dU().u(cjf.this.du().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ir.c.equals(cjf.this.cg)) {
            cjf.this.cg = cjf.this.du();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cjf.this.e = ewu.a(cjf.this.cg).b((double)(this.d * aym.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aym.a(this.c)));
      }
   }

   class f extends byn {
      public f(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends byo {
      private float m = 0.1F;

      public g(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cjf.this.R) {
            cjf.this.r(cjf.this.dK() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cjf.this.e.c - cjf.this.dz();
         double $$1 = cjf.this.e.d - cjf.this.dB();
         double $$2 = cjf.this.e.e - cjf.this.dF();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cjf.this.dK();
            float $$7 = (float)aym.d($$2, $$0);
            float $$8 = aym.g(cjf.this.dK() + 90.0F);
            float $$9 = aym.g($$7 * (180.0F / (float)Math.PI));
            cjf.this.r(aym.e($$8, $$9, 4.0F) - 90.0F);
            cjf.this.bj = cjf.this.dK();
            if (aym.d($$6, cjf.this.dK()) < 3.0F) {
               this.m = aym.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aym.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aym.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cjf.this.s($$10);
            float $$11 = cjf.this.dK() + 90.0F;
            double $$12 = (double)(this.m * aym.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aym.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aym.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ewu $$15 = cjf.this.dx();
            cjf.this.g($$15.e(new ewu($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bzl {
      public h() {
         this.a(EnumSet.of(bzl.a.a));
      }

      protected boolean h() {
         return cjf.this.e.c(cjf.this.dz(), cjf.this.dB(), cjf.this.dF()) < 4.0;
      }
   }

   class i extends cjf.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cjf.this.p() != null && cjf.this.ch == cjf.a.b;
      }

      @Override
      public boolean b() {
         bso $$0 = cjf.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bI()) {
            return false;
         } else {
            if ($$0 instanceof cly $$1 && ($$0.O_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cjf.this.am > this.e) {
                  this.e = cjf.this.am + 20;
                  List<ceh> $$2 = cjf.this.dU().a(ceh.class, cjf.this.cP().g(16.0), bsa.a);

                  for (ceh $$3 : $$2) {
                     $$3.gI();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
         cjf.this.h(null);
         cjf.this.ch = cjf.a.a;
      }

      @Override
      public void e() {
         bso $$0 = cjf.this.p();
         if ($$0 != null) {
            cjf.this.e = new ewu($$0.dz(), $$0.e(0.5), $$0.dF());
            if (cjf.this.cP().g(0.2F).c($$0.cP())) {
               cjf.this.C($$0);
               cjf.this.ch = cjf.a.a;
               if (!cjf.this.ba()) {
                  cjf.this.dU().c(1039, cjf.this.du(), 0);
               }
            } else if (cjf.this.R || cjf.this.aZ > 0) {
               cjf.this.ch = cjf.a.a;
            }
         }
      }
   }
}
