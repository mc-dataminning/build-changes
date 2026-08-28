import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckf extends btg implements cjv {
   public static final float b = 7.448451F;
   public static final int c = ayz.f(24.166098F);
   private static final akk<Integer> d = ako.a(ckf.class, akm.b);
   evr e = evr.b;
   iz bX = iz.c;
   ckf.a bY = ckf.a.a;

   public ckf(bta<? extends ckf> $$0, dby $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new ckf.g(this);
      this.bO = new ckf.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bzl E() {
      return new ckf.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new ckf.c());
      this.bS.a(2, new ckf.i());
      this.bS.a(3, new ckf.e());
      this.bT.a(1, new ckf.b());
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayz.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(bux.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(akk<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int u() {
      return this.al() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         float $$0 = ayz.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayz.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), awa.tu, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayz.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayz.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dk() * 2.5F;
         this.dP().a(li.Z, this.du() + (double)$$3, this.dw() + (double)$$5, this.dA() + (double)$$4, 0.0, 0.0, 0.0);
         this.dP().a(li.Z, this.du() - (double)$$3, this.dw() + (double)$$5, this.dA() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bD() && this.gk()) {
         this.g(8);
      }

      super.n_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      this.bX = this.dp().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new iz($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awb de() {
      return awb.f;
   }

   @Override
   protected avz v() {
      return awa.tr;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.tv;
   }

   @Override
   protected avz o_() {
      return awa.tt;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bta<?> $$0) {
      return true;
   }

   @Override
   public bsx e(bub $$0) {
      int $$1 = this.s();
      bsx $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends can {
      private final ceg b = ceg.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmx> $$0 = ckf.this.dP().a(this.b, ckf.this, ckf.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsu::dw).reversed());

               for (cmx $$1 : $$0) {
                  if (ckf.this.a($$1, ceg.a)) {
                     ckf.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btp $$0 = ckf.this.p();
         return $$0 != null ? ckf.this.a($$0, ceg.a) : false;
      }
   }

   class c extends can {
      private int b;

      @Override
      public boolean a() {
         btp $$0 = ckf.this.p();
         return $$0 != null ? ckf.this.a($$0, ceg.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ckf.this.bY = ckf.a.a;
         this.h();
      }

      @Override
      public void d() {
         ckf.this.bX = ckf.this.dP().a(dxu.a.e, ckf.this.bX).b(10 + ckf.this.ah.a(20));
      }

      @Override
      public void e() {
         if (ckf.this.bY == ckf.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckf.this.bY = ckf.a.b;
               this.h();
               this.b = this.a((8 + ckf.this.ah.a(4)) * 20);
               ckf.this.a(awa.tw, 10.0F, 0.95F + ckf.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckf.this.bX = ckf.this.p().dp().b(20 + ckf.this.ah.a(20));
         if (ckf.this.bX.v() < ckf.this.dP().z_()) {
            ckf.this.bX = new iz(ckf.this.bX.u(), ckf.this.dP().z_() + 1, ckf.this.bX.w());
         }
      }
   }

   class d extends bzl {
      public d(final btr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckf.this.ba = ckf.this.aY;
         ckf.this.aY = ckf.this.dF();
      }
   }

   class e extends ckf.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ckf.this.p() == null || ckf.this.bY == ckf.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ckf.this.ah.i() * 10.0F;
         this.e = -4.0F + ckf.this.ah.i() * 9.0F;
         this.f = ckf.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
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

         if (ckf.this.e.d < ckf.this.dw() && !ckf.this.dP().u(ckf.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckf.this.e.d > ckf.this.dw() && !ckf.this.dP().u(ckf.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iz.c.equals(ckf.this.bX)) {
            ckf.this.bX = ckf.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckf.this.e = evr.a(ckf.this.bX).b((double)(this.d * ayz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayz.a(this.c)));
      }
   }

   class f extends bzp {
      public f(final btr $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzq {
      private float m = 0.1F;

      public g(final btr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckf.this.Q) {
            ckf.this.r(ckf.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckf.this.e.c - ckf.this.du();
         double $$1 = ckf.this.e.d - ckf.this.dw();
         double $$2 = ckf.this.e.e - ckf.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckf.this.dF();
            float $$7 = (float)ayz.d($$2, $$0);
            float $$8 = ayz.g(ckf.this.dF() + 90.0F);
            float $$9 = ayz.g($$7 * (180.0F / (float)Math.PI));
            ckf.this.r(ayz.e($$8, $$9, 4.0F) - 90.0F);
            ckf.this.aY = ckf.this.dF();
            if (ayz.d($$6, ckf.this.dF()) < 3.0F) {
               this.m = ayz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckf.this.s($$10);
            float $$11 = ckf.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evr $$15 = ckf.this.ds();
            ckf.this.h($$15.e(new evr($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends can {
      public h() {
         this.a(EnumSet.of(can.a.a));
      }

      protected boolean h() {
         return ckf.this.e.c(ckf.this.du(), ckf.this.dw(), ckf.this.dA()) < 4.0;
      }
   }

   class i extends ckf.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ckf.this.p() != null && ckf.this.bY == ckf.a.b;
      }

      @Override
      public boolean b() {
         btp $$0 = ckf.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cmx $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ckf.this.ai > this.e) {
                  this.e = ckf.this.ai + 20;
                  List<cfi> $$2 = ckf.this.dP().a(cfi.class, ckf.this.cK().g(16.0), bsz.a);

                  for (cfi $$3 : $$2) {
                     $$3.gA();
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
         ckf.this.h(null);
         ckf.this.bY = ckf.a.a;
      }

      @Override
      public void e() {
         btp $$0 = ckf.this.p();
         if ($$0 != null) {
            ckf.this.e = new evr($$0.du(), $$0.e(0.5), $$0.dA());
            if (ckf.this.cK().g(0.2F).c($$0.cK())) {
               ckf.this.C($$0);
               ckf.this.bY = ckf.a.a;
               if (!ckf.this.aW()) {
                  ckf.this.dP().c(1039, ckf.this.dp(), 0);
               }
            } else if (ckf.this.Q || ckf.this.aO > 0) {
               ckf.this.bY = ckf.a.a;
            }
         }
      }
   }
}
