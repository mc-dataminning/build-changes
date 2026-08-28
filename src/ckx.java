import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckx extends btw implements ckn {
   public static final float b = 7.448451F;
   public static final int c = azc.f(24.166098F);
   private static final akg<Integer> d = akk.a(ckx.class, aki.b);
   eye e = eye.c;
   je bY = je.c;
   ckx.a bZ = ckx.a.a;

   public ckx(btq<? extends ckx> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bQ = new ckx.g(this);
      this.bP = new ckx.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.t() + this.ag) % c == 0;
   }

   @Override
   protected caa J() {
      return new ckx.d(this);
   }

   @Override
   protected void D() {
      this.bT.a(1, new ckx.c());
      this.bT.a(2, new ckx.i());
      this.bT.a(3, new ckx.e());
      this.bU.a(1, new ckx.b());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.am.a(d, azc.a($$0, 0, 64));
   }

   private void y() {
      this.i_();
      this.g(bvm.c).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.a(d);
   }

   @Override
   public void a(akg<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.ap() * 3;
   }

   @Override
   protected boolean ab() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         float $$0 = azc.b((float)(this.t() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azc.b((float)(this.t() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awd.ty, this.di(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dn() * 1.48F;
         float $$3 = azc.b(this.dI() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azc.a(this.dI() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.do() * 2.5F;
         this.dS().a(ln.Z, this.dx() + (double)$$3, this.dz() + (double)$$5, this.dD() + (double)$$4, 0.0, 0.0, 0.0);
         this.dS().a(ln.Z, this.dx() - (double)$$3, this.dz() + (double)$$5, this.dD() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void m_() {
      if (this.bI() && this.gi()) {
         this.d(8.0F);
      }

      super.m_();
   }

   @Override
   protected void ad() {
      super.ad();
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.bY = this.ds().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bY = new je($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("AX", this.bY.u());
      $$0.a("AY", this.bY.v());
      $$0.a("AZ", this.bY.w());
      $$0.a("Size", this.q());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected awc w() {
      return awd.tv;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.tz;
   }

   @Override
   protected awc n_() {
      return awd.tx;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(btq<?> $$0) {
      return true;
   }

   @Override
   public btm e(bur $$0) {
      int $$1 = this.q();
      btm $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cbc {
      private final cev b = cev.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cnp> $$0 = ckx.this.dS().a(this.b, ckx.this, ckx.this.cO().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(btj::dz).reversed());

               for (cnp $$1 : $$0) {
                  if (ckx.this.a($$1, cev.a)) {
                     ckx.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         buf $$0 = ckx.this.m();
         return $$0 != null ? ckx.this.a($$0, cev.a) : false;
      }
   }

   class c extends cbc {
      private int b;

      @Override
      public boolean b() {
         buf $$0 = ckx.this.m();
         return $$0 != null ? ckx.this.a($$0, cev.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         ckx.this.bZ = ckx.a.a;
         this.h();
      }

      @Override
      public void e() {
         ckx.this.bY = ckx.this.dS().a(dzw.a.e, ckx.this.bY).b(10 + ckx.this.af.a(20));
      }

      @Override
      public void a() {
         if (ckx.this.bZ == ckx.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckx.this.bZ = ckx.a.b;
               this.h();
               this.b = this.a((8 + ckx.this.af.a(4)) * 20);
               ckx.this.a(awd.tA, 10.0F, 0.95F + ckx.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckx.this.bY = ckx.this.m().ds().b(20 + ckx.this.af.a(20));
         if (ckx.this.bY.v() < ckx.this.dS().N()) {
            ckx.this.bY = new je(ckx.this.bY.u(), ckx.this.dS().N() + 1, ckx.this.bY.w());
         }
      }
   }

   class d extends caa {
      public d(final buh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckx.this.aW = ckx.this.aU;
         ckx.this.aU = ckx.this.dI();
      }
   }

   class e extends ckx.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return ckx.this.m() == null || ckx.this.bZ == ckx.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + ckx.this.af.i() * 10.0F;
         this.e = -4.0F + ckx.this.af.i() * 9.0F;
         this.f = ckx.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (ckx.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + ckx.this.af.i() * 9.0F;
         }

         if (ckx.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ckx.this.af.a(this.a(450)) == 0) {
            this.c = ckx.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ckx.this.e.e < ckx.this.dz() && !ckx.this.dS().u(ckx.this.ds().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckx.this.e.e > ckx.this.dz() && !ckx.this.dS().u(ckx.this.ds().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (je.c.equals(ckx.this.bY)) {
            ckx.this.bY = ckx.this.ds();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckx.this.e = eye.a(ckx.this.bY).b((double)(this.d * azc.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azc.a(this.c)));
      }
   }

   class f extends cae {
      public f(final buh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends caf {
      private float m = 0.1F;

      public g(final buh $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckx.this.Q) {
            ckx.this.v(ckx.this.dI() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckx.this.e.d - ckx.this.dx();
         double $$1 = ckx.this.e.e - ckx.this.dz();
         double $$2 = ckx.this.e.f - ckx.this.dD();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckx.this.dI();
            float $$7 = (float)azc.d($$2, $$0);
            float $$8 = azc.g(ckx.this.dI() + 90.0F);
            float $$9 = azc.g($$7 * (180.0F / (float)Math.PI));
            ckx.this.v(azc.e($$8, $$9, 4.0F) - 90.0F);
            ckx.this.aU = ckx.this.dI();
            if (azc.d($$6, ckx.this.dI()) < 3.0F) {
               this.m = azc.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azc.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azc.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckx.this.w($$10);
            float $$11 = ckx.this.dI() + 90.0F;
            double $$12 = (double)(this.m * azc.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azc.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azc.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eye $$15 = ckx.this.dv();
            ckx.this.h($$15.e(new eye($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cbc {
      public h() {
         this.a(EnumSet.of(cbc.a.a));
      }

      protected boolean h() {
         return ckx.this.e.c(ckx.this.dx(), ckx.this.dz(), ckx.this.dD()) < 4.0;
      }
   }

   class i extends ckx.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return ckx.this.m() != null && ckx.this.bZ == ckx.a.b;
      }

      @Override
      public boolean c() {
         buf $$0 = ckx.this.m();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bI()) {
            return false;
         } else {
            if ($$0 instanceof cnp $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (ckx.this.ag > this.e) {
                  this.e = ckx.this.ag + 20;
                  List<cfy> $$2 = ckx.this.dS().a(cfy.class, ckx.this.cO().g(16.0), bto.a);

                  for (cfy $$3 : $$2) {
                     $$3.gD();
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
         ckx.this.h(null);
         ckx.this.bZ = ckx.a.a;
      }

      @Override
      public void a() {
         buf $$0 = ckx.this.m();
         if ($$0 != null) {
            ckx.this.e = new eye($$0.dx(), $$0.e(0.5), $$0.dD());
            if (ckx.this.cO().g(0.2F).c($$0.cO())) {
               ckx.this.E($$0);
               ckx.this.bZ = ckx.a.a;
               if (!ckx.this.ba()) {
                  ckx.this.dS().c(1039, ckx.this.ds(), 0);
               }
            } else if (ckx.this.Q || ckx.this.aK > 0) {
               ckx.this.bZ = ckx.a.a;
            }
         }
      }
   }
}
