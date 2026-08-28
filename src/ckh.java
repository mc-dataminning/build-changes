import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckh extends bti implements cjx {
   public static final float b = 7.448451F;
   public static final int c = ayz.f(24.166098F);
   private static final akk<Integer> d = ako.a(ckh.class, akm.b);
   evt e = evt.b;
   iz bX = iz.c;
   ckh.a bY = ckh.a.a;

   public ckh(btc<? extends ckh> $$0, dca $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new ckh.g(this);
      this.bO = new ckh.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bzn E() {
      return new ckh.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new ckh.c());
      this.bS.a(2, new ckh.i());
      this.bS.a(3, new ckh.e());
      this.bT.a(1, new ckh.b());
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
      this.f(buz.c).a((double)(6 + this.s()));
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
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
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
   protected avz d(brp $$0) {
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
   public boolean a(btc<?> $$0) {
      return true;
   }

   @Override
   public bsz e(bud $$0) {
      int $$1 = this.s();
      bsz $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cap {
      private final cei b = cei.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmz> $$0 = ckh.this.dP().a(this.b, ckh.this, ckh.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsw::dw).reversed());

               for (cmz $$1 : $$0) {
                  if (ckh.this.a($$1, cei.a)) {
                     ckh.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btr $$0 = ckh.this.p();
         return $$0 != null ? ckh.this.a($$0, cei.a) : false;
      }
   }

   class c extends cap {
      private int b;

      @Override
      public boolean a() {
         btr $$0 = ckh.this.p();
         return $$0 != null ? ckh.this.a($$0, cei.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ckh.this.bY = ckh.a.a;
         this.h();
      }

      @Override
      public void d() {
         ckh.this.bX = ckh.this.dP().a(dxw.a.e, ckh.this.bX).b(10 + ckh.this.ah.a(20));
      }

      @Override
      public void e() {
         if (ckh.this.bY == ckh.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckh.this.bY = ckh.a.b;
               this.h();
               this.b = this.a((8 + ckh.this.ah.a(4)) * 20);
               ckh.this.a(awa.tw, 10.0F, 0.95F + ckh.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckh.this.bX = ckh.this.p().dp().b(20 + ckh.this.ah.a(20));
         if (ckh.this.bX.v() < ckh.this.dP().z_()) {
            ckh.this.bX = new iz(ckh.this.bX.u(), ckh.this.dP().z_() + 1, ckh.this.bX.w());
         }
      }
   }

   class d extends bzn {
      public d(final btt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckh.this.ba = ckh.this.aY;
         ckh.this.aY = ckh.this.dF();
      }
   }

   class e extends ckh.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ckh.this.p() == null || ckh.this.bY == ckh.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ckh.this.ah.i() * 10.0F;
         this.e = -4.0F + ckh.this.ah.i() * 9.0F;
         this.f = ckh.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ckh.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + ckh.this.ah.i() * 9.0F;
         }

         if (ckh.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ckh.this.ah.a(this.a(450)) == 0) {
            this.c = ckh.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ckh.this.e.d < ckh.this.dw() && !ckh.this.dP().u(ckh.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckh.this.e.d > ckh.this.dw() && !ckh.this.dP().u(ckh.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iz.c.equals(ckh.this.bX)) {
            ckh.this.bX = ckh.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckh.this.e = evt.a(ckh.this.bX).b((double)(this.d * ayz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayz.a(this.c)));
      }
   }

   class f extends bzr {
      public f(final btt $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzs {
      private float m = 0.1F;

      public g(final btt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckh.this.Q) {
            ckh.this.r(ckh.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckh.this.e.c - ckh.this.du();
         double $$1 = ckh.this.e.d - ckh.this.dw();
         double $$2 = ckh.this.e.e - ckh.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckh.this.dF();
            float $$7 = (float)ayz.d($$2, $$0);
            float $$8 = ayz.g(ckh.this.dF() + 90.0F);
            float $$9 = ayz.g($$7 * (180.0F / (float)Math.PI));
            ckh.this.r(ayz.e($$8, $$9, 4.0F) - 90.0F);
            ckh.this.aY = ckh.this.dF();
            if (ayz.d($$6, ckh.this.dF()) < 3.0F) {
               this.m = ayz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckh.this.s($$10);
            float $$11 = ckh.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evt $$15 = ckh.this.ds();
            ckh.this.h($$15.e(new evt($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cap {
      public h() {
         this.a(EnumSet.of(cap.a.a));
      }

      protected boolean h() {
         return ckh.this.e.c(ckh.this.du(), ckh.this.dw(), ckh.this.dA()) < 4.0;
      }
   }

   class i extends ckh.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ckh.this.p() != null && ckh.this.bY == ckh.a.b;
      }

      @Override
      public boolean b() {
         btr $$0 = ckh.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cmz $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ckh.this.ai > this.e) {
                  this.e = ckh.this.ai + 20;
                  List<cfk> $$2 = ckh.this.dP().a(cfk.class, ckh.this.cK().g(16.0), btb.a);

                  for (cfk $$3 : $$2) {
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
         ckh.this.h(null);
         ckh.this.bY = ckh.a.a;
      }

      @Override
      public void e() {
         btr $$0 = ckh.this.p();
         if ($$0 != null) {
            ckh.this.e = new evt($$0.du(), $$0.e(0.5), $$0.dA());
            if (ckh.this.cK().g(0.2F).c($$0.cK())) {
               ckh.this.C($$0);
               ckh.this.bY = ckh.a.a;
               if (!ckh.this.aW()) {
                  ckh.this.dP().c(1039, ckh.this.dp(), 0);
               }
            } else if (ckh.this.Q || ckh.this.aO > 0) {
               ckh.this.bY = ckh.a.a;
            }
         }
      }
   }
}
