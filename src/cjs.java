import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cjs extends bss implements cji {
   public static final float b = 7.448451F;
   public static final int c = ayg.f(24.166098F);
   private static final ajp<Integer> d = ajt.a(cjs.class, ajr.b);
   ewf e = ewf.b;
   ja bZ = ja.c;
   cjs.a ca = cjs.a.a;

   public cjs(bsm<? extends cjs> $$0, dcf $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjs.g(this);
      this.bQ = new cjs.f(this);
   }

   @Override
   public boolean aW() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected byx E() {
      return new cjs.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cjs.c());
      this.bU.a(2, new cjs.i());
      this.bU.a(3, new cjs.e());
      this.bV.a(1, new cjs.b());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayg.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(buj.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int u() {
      return this.am() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         float $$0 = ayg.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayg.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dQ().a(this.dv(), this.dx(), this.dB(), avh.tx, this.df(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dk() * 1.48F;
         float $$3 = ayg.b(this.dG() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayg.a(this.dG() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dl() * 2.5F;
         this.dQ().a(lj.Z, this.dv() + (double)$$3, this.dx() + (double)$$5, this.dB() + (double)$$4, 0.0, 0.0, 0.0);
         this.dQ().a(lj.Z, this.dv() - (double)$$3, this.dx() + (double)$$5, this.dB() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bE() && this.gi()) {
         this.d(8.0F);
      }

      super.n_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.bZ = this.dq().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bZ = new ja($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AX", this.bZ.u());
      $$0.a("AY", this.bZ.v());
      $$0.a("AZ", this.bZ.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.tu;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.ty;
   }

   @Override
   protected avg o_() {
      return avh.tw;
   }

   @Override
   protected float fb() {
      return 1.0F;
   }

   @Override
   public boolean a(bsm<?> $$0) {
      return true;
   }

   @Override
   public bsj e(btn $$0) {
      int $$1 = this.s();
      bsj $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bzz {
      private final cds b = cds.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmk> $$0 = cjs.this.dQ().a(this.b, cjs.this, cjs.this.cL().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsg::dx).reversed());

               for (cmk $$1 : $$0) {
                  if (cjs.this.a($$1, cds.a)) {
                     cjs.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btb $$0 = cjs.this.p();
         return $$0 != null ? cjs.this.a($$0, cds.a) : false;
      }
   }

   class c extends bzz {
      private int b;

      @Override
      public boolean a() {
         btb $$0 = cjs.this.p();
         return $$0 != null ? cjs.this.a($$0, cds.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cjs.this.ca = cjs.a.a;
         this.h();
      }

      @Override
      public void d() {
         cjs.this.bZ = cjs.this.dQ().a(dyf.a.e, cjs.this.bZ).b(10 + cjs.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cjs.this.ca == cjs.a.a) {
            this.b--;
            if (this.b <= 0) {
               cjs.this.ca = cjs.a.b;
               this.h();
               this.b = this.a((8 + cjs.this.ah.a(4)) * 20);
               cjs.this.a(avh.tz, 10.0F, 0.95F + cjs.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cjs.this.bZ = cjs.this.p().dq().b(20 + cjs.this.ah.a(20));
         if (cjs.this.bZ.v() < cjs.this.dQ().z_()) {
            cjs.this.bZ = new ja(cjs.this.bZ.u(), cjs.this.dQ().z_() + 1, cjs.this.bZ.w());
         }
      }
   }

   class d extends byx {
      public d(final btd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cjs.this.ba = cjs.this.aY;
         cjs.this.aY = cjs.this.dG();
      }
   }

   class e extends cjs.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cjs.this.p() == null || cjs.this.ca == cjs.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cjs.this.ah.i() * 10.0F;
         this.e = -4.0F + cjs.this.ah.i() * 9.0F;
         this.f = cjs.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cjs.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cjs.this.ah.i() * 9.0F;
         }

         if (cjs.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cjs.this.ah.a(this.a(450)) == 0) {
            this.c = cjs.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cjs.this.e.d < cjs.this.dx() && !cjs.this.dQ().u(cjs.this.dq().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cjs.this.e.d > cjs.this.dx() && !cjs.this.dQ().u(cjs.this.dq().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ja.c.equals(cjs.this.bZ)) {
            cjs.this.bZ = cjs.this.dq();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cjs.this.e = ewf.a(cjs.this.bZ).b((double)(this.d * ayg.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayg.a(this.c)));
      }
   }

   class f extends bzb {
      public f(final btd $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzc {
      private float m = 0.1F;

      public g(final btd $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cjs.this.Q) {
            cjs.this.s(cjs.this.dG() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cjs.this.e.c - cjs.this.dv();
         double $$1 = cjs.this.e.d - cjs.this.dx();
         double $$2 = cjs.this.e.e - cjs.this.dB();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cjs.this.dG();
            float $$7 = (float)ayg.d($$2, $$0);
            float $$8 = ayg.g(cjs.this.dG() + 90.0F);
            float $$9 = ayg.g($$7 * (180.0F / (float)Math.PI));
            cjs.this.s(ayg.e($$8, $$9, 4.0F) - 90.0F);
            cjs.this.aY = cjs.this.dG();
            if (ayg.d($$6, cjs.this.dG()) < 3.0F) {
               this.m = ayg.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayg.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayg.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cjs.this.t($$10);
            float $$11 = cjs.this.dG() + 90.0F;
            double $$12 = (double)(this.m * ayg.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayg.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayg.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ewf $$15 = cjs.this.dt();
            cjs.this.i($$15.e(new ewf($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bzz {
      public h() {
         this.a(EnumSet.of(bzz.a.a));
      }

      protected boolean h() {
         return cjs.this.e.c(cjs.this.dv(), cjs.this.dx(), cjs.this.dB()) < 4.0;
      }
   }

   class i extends cjs.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cjs.this.p() != null && cjs.this.ca == cjs.a.b;
      }

      @Override
      public boolean b() {
         btb $$0 = cjs.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bE()) {
            return false;
         } else {
            if ($$0 instanceof cmk $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cjs.this.ai > this.e) {
                  this.e = cjs.this.ai + 20;
                  List<ceu> $$2 = cjs.this.dQ().a(ceu.class, cjs.this.cL().g(16.0), bsl.a);

                  for (ceu $$3 : $$2) {
                     $$3.gy();
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
         cjs.this.h(null);
         cjs.this.ca = cjs.a.a;
      }

      @Override
      public void e() {
         btb $$0 = cjs.this.p();
         if ($$0 != null) {
            cjs.this.e = new ewf($$0.dv(), $$0.e(0.5), $$0.dB());
            if (cjs.this.cL().g(0.2F).c($$0.cL())) {
               cjs.this.D($$0);
               cjs.this.ca = cjs.a.a;
               if (!cjs.this.aX()) {
                  cjs.this.dQ().c(1039, cjs.this.dq(), 0);
               }
            } else if (cjs.this.Q || cjs.this.aO > 0) {
               cjs.this.ca = cjs.a.a;
            }
         }
      }
   }
}
