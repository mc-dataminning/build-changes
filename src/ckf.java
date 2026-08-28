import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckf extends btd implements cjv {
   public static final float b = 7.448451F;
   public static final int c = ayo.f(24.166098F);
   private static final ajw<Integer> d = aka.a(ckf.class, ajy.b);
   exc e = exc.b;
   jd cb = jd.c;
   ckf.a cc = ckf.a.a;

   public ckf(bsx<? extends ckf> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = 5;
      this.bT = new ckf.g(this);
      this.bS = new ckf.f(this);
   }

   @Override
   public boolean aW() {
      return (this.t() + this.ai) % c == 0;
   }

   @Override
   protected bzk H() {
      return new ckf.d(this);
   }

   @Override
   protected void B() {
      this.bW.a(1, new ckf.c());
      this.bW.a(2, new ckf.i());
      this.bW.a(3, new ckf.e());
      this.bX.a(1, new ckf.b());
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayo.a($$0, 0, 64));
   }

   private void x() {
      this.i_();
      this.f(buw.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajw<?> $$0) {
      if (d.equals($$0)) {
         this.x();
      }

      super.a($$0);
   }

   public int t() {
      return this.an() * 3;
   }

   @Override
   protected boolean Z() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().B) {
         float $$0 = ayo.b((float)(this.t() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayo.b((float)(this.t() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dO().a(this.dt(), this.dv(), this.dz(), avp.tx, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayo.b(this.dE() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayo.a(this.dE() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dk() * 2.5F;
         this.dO().a(lm.Z, this.dt() + (double)$$3, this.dv() + (double)$$5, this.dz() + (double)$$4, 0.0, 0.0, 0.0);
         this.dO().a(lm.Z, this.dt() - (double)$$3, this.dv() + (double)$$5, this.dz() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void m_() {
      if (this.bE() && this.ge()) {
         this.d(8.0F);
      }

      super.m_();
   }

   @Override
   protected void ab() {
      super.ab();
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.cb = this.do().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.cb = new jd($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("AX", this.cb.u());
      $$0.a("AY", this.cb.v());
      $$0.a("AZ", this.cb.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected avo v() {
      return avp.tu;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.ty;
   }

   @Override
   protected avo n_() {
      return avp.tw;
   }

   @Override
   protected float fa() {
      return 1.0F;
   }

   @Override
   public boolean a(bsx<?> $$0) {
      return true;
   }

   @Override
   public bsu e(bua $$0) {
      int $$1 = this.s();
      bsu $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cam {
      private final cef b = cef.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmx> $$0 = ckf.this.dO().a(this.b, ckf.this, ckf.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsr::dv).reversed());

               for (cmx $$1 : $$0) {
                  if (ckf.this.a($$1, cef.a)) {
                     ckf.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         btn $$0 = ckf.this.p();
         return $$0 != null ? ckf.this.a($$0, cef.a) : false;
      }
   }

   class c extends cam {
      private int b;

      @Override
      public boolean b() {
         btn $$0 = ckf.this.p();
         return $$0 != null ? ckf.this.a($$0, cef.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         ckf.this.cc = ckf.a.a;
         this.h();
      }

      @Override
      public void e() {
         ckf.this.cb = ckf.this.dO().a(dyy.a.e, ckf.this.cb).b(10 + ckf.this.ah.a(20));
      }

      @Override
      public void a() {
         if (ckf.this.cc == ckf.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckf.this.cc = ckf.a.b;
               this.h();
               this.b = this.a((8 + ckf.this.ah.a(4)) * 20);
               ckf.this.a(avp.tz, 10.0F, 0.95F + ckf.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckf.this.cb = ckf.this.p().do().b(20 + ckf.this.ah.a(20));
         if (ckf.this.cb.v() < ckf.this.dO().z_()) {
            ckf.this.cb = new jd(ckf.this.cb.u(), ckf.this.dO().z_() + 1, ckf.this.cb.w());
         }
      }
   }

   class d extends bzk {
      public d(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckf.this.ba = ckf.this.aY;
         ckf.this.aY = ckf.this.dE();
      }
   }

   class e extends ckf.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return ckf.this.p() == null || ckf.this.cc == ckf.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + ckf.this.ah.i() * 10.0F;
         this.e = -4.0F + ckf.this.ah.i() * 9.0F;
         this.f = ckf.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (ckf.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + ckf.this.ah.i() * 9.0F;
         }

         if (ckf.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ckf.this.ah.a(this.a(450)) == 0) {
            this.c = ckf.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ckf.this.e.d < ckf.this.dv() && !ckf.this.dO().u(ckf.this.do().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckf.this.e.d > ckf.this.dv() && !ckf.this.dO().u(ckf.this.do().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jd.c.equals(ckf.this.cb)) {
            ckf.this.cb = ckf.this.do();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckf.this.e = exc.a(ckf.this.cb).b((double)(this.d * ayo.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayo.a(this.c)));
      }
   }

   class f extends bzo {
      public f(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzp {
      private float m = 0.1F;

      public g(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckf.this.Q) {
            ckf.this.t(ckf.this.dE() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckf.this.e.c - ckf.this.dt();
         double $$1 = ckf.this.e.d - ckf.this.dv();
         double $$2 = ckf.this.e.e - ckf.this.dz();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckf.this.dE();
            float $$7 = (float)ayo.d($$2, $$0);
            float $$8 = ayo.g(ckf.this.dE() + 90.0F);
            float $$9 = ayo.g($$7 * (180.0F / (float)Math.PI));
            ckf.this.t(ayo.e($$8, $$9, 4.0F) - 90.0F);
            ckf.this.aY = ckf.this.dE();
            if (ayo.d($$6, ckf.this.dE()) < 3.0F) {
               this.m = ayo.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayo.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayo.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckf.this.u($$10);
            float $$11 = ckf.this.dE() + 90.0F;
            double $$12 = (double)(this.m * ayo.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayo.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayo.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            exc $$15 = ckf.this.dr();
            ckf.this.i($$15.e(new exc($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cam {
      public h() {
         this.a(EnumSet.of(cam.a.a));
      }

      protected boolean h() {
         return ckf.this.e.c(ckf.this.dt(), ckf.this.dv(), ckf.this.dz()) < 4.0;
      }
   }

   class i extends ckf.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return ckf.this.p() != null && ckf.this.cc == ckf.a.b;
      }

      @Override
      public boolean c() {
         btn $$0 = ckf.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bE()) {
            return false;
         } else {
            if ($$0 instanceof cmx $$1 && ($$0.R_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (ckf.this.ai > this.e) {
                  this.e = ckf.this.ai + 20;
                  List<cfh> $$2 = ckf.this.dO().a(cfh.class, ckf.this.cK().g(16.0), bsw.a);

                  for (cfh $$3 : $$2) {
                     $$3.gy();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         ckf.this.h(null);
         ckf.this.cc = ckf.a.a;
      }

      @Override
      public void a() {
         btn $$0 = ckf.this.p();
         if ($$0 != null) {
            ckf.this.e = new exc($$0.dt(), $$0.e(0.5), $$0.dz());
            if (ckf.this.cK().g(0.2F).c($$0.cK())) {
               ckf.this.D($$0);
               ckf.this.cc = ckf.a.a;
               if (!ckf.this.aX()) {
                  ckf.this.dO().c(1039, ckf.this.do(), 0);
               }
            } else if (ckf.this.Q || ckf.this.aO > 0) {
               ckf.this.cc = ckf.a.a;
            }
         }
      }
   }
}
