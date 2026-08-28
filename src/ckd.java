import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckd extends bte implements cjt {
   public static final float b = 7.448451F;
   public static final int c = ayx.f(24.166098F);
   private static final akj<Integer> d = akn.a(ckd.class, akl.b);
   evp e = evp.b;
   iz bX = iz.c;
   ckd.a bY = ckd.a.a;

   public ckd(bsy<? extends ckd> $$0, dbw $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new ckd.g(this);
      this.bO = new ckd.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bzj E() {
      return new ckd.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new ckd.c());
      this.bS.a(2, new ckd.i());
      this.bS.a(3, new ckd.e());
      this.bT.a(1, new ckd.b());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayx.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(buv.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(akj<?> $$0) {
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
         float $$0 = ayx.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayx.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), avz.tu, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayx.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayx.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
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
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      this.bX = this.dp().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new iz($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ur $$0) {
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
   public awa de() {
      return awa.f;
   }

   @Override
   protected avy v() {
      return avz.tr;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.tv;
   }

   @Override
   protected avy o_() {
      return avz.tt;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bsy<?> $$0) {
      return true;
   }

   @Override
   public bsv e(btz $$0) {
      int $$1 = this.s();
      bsv $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cal {
      private final cee b = cee.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmv> $$0 = ckd.this.dP().a(this.b, ckd.this, ckd.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bss::dw).reversed());

               for (cmv $$1 : $$0) {
                  if (ckd.this.a($$1, cee.a)) {
                     ckd.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btn $$0 = ckd.this.p();
         return $$0 != null ? ckd.this.a($$0, cee.a) : false;
      }
   }

   class c extends cal {
      private int b;

      @Override
      public boolean a() {
         btn $$0 = ckd.this.p();
         return $$0 != null ? ckd.this.a($$0, cee.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ckd.this.bY = ckd.a.a;
         this.h();
      }

      @Override
      public void d() {
         ckd.this.bX = ckd.this.dP().a(dxs.a.e, ckd.this.bX).b(10 + ckd.this.ah.a(20));
      }

      @Override
      public void e() {
         if (ckd.this.bY == ckd.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckd.this.bY = ckd.a.b;
               this.h();
               this.b = this.a((8 + ckd.this.ah.a(4)) * 20);
               ckd.this.a(avz.tw, 10.0F, 0.95F + ckd.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckd.this.bX = ckd.this.p().dp().b(20 + ckd.this.ah.a(20));
         if (ckd.this.bX.v() < ckd.this.dP().z_()) {
            ckd.this.bX = new iz(ckd.this.bX.u(), ckd.this.dP().z_() + 1, ckd.this.bX.w());
         }
      }
   }

   class d extends bzj {
      public d(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckd.this.ba = ckd.this.aY;
         ckd.this.aY = ckd.this.dF();
      }
   }

   class e extends ckd.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ckd.this.p() == null || ckd.this.bY == ckd.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ckd.this.ah.i() * 10.0F;
         this.e = -4.0F + ckd.this.ah.i() * 9.0F;
         this.f = ckd.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ckd.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + ckd.this.ah.i() * 9.0F;
         }

         if (ckd.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ckd.this.ah.a(this.a(450)) == 0) {
            this.c = ckd.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ckd.this.e.d < ckd.this.dw() && !ckd.this.dP().u(ckd.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckd.this.e.d > ckd.this.dw() && !ckd.this.dP().u(ckd.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iz.c.equals(ckd.this.bX)) {
            ckd.this.bX = ckd.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckd.this.e = evp.a(ckd.this.bX).b((double)(this.d * ayx.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayx.a(this.c)));
      }
   }

   class f extends bzn {
      public f(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzo {
      private float m = 0.1F;

      public g(final btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckd.this.Q) {
            ckd.this.r(ckd.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckd.this.e.c - ckd.this.du();
         double $$1 = ckd.this.e.d - ckd.this.dw();
         double $$2 = ckd.this.e.e - ckd.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckd.this.dF();
            float $$7 = (float)ayx.d($$2, $$0);
            float $$8 = ayx.g(ckd.this.dF() + 90.0F);
            float $$9 = ayx.g($$7 * (180.0F / (float)Math.PI));
            ckd.this.r(ayx.e($$8, $$9, 4.0F) - 90.0F);
            ckd.this.aY = ckd.this.dF();
            if (ayx.d($$6, ckd.this.dF()) < 3.0F) {
               this.m = ayx.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayx.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayx.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckd.this.s($$10);
            float $$11 = ckd.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayx.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayx.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayx.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evp $$15 = ckd.this.ds();
            ckd.this.h($$15.e(new evp($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cal {
      public h() {
         this.a(EnumSet.of(cal.a.a));
      }

      protected boolean h() {
         return ckd.this.e.c(ckd.this.du(), ckd.this.dw(), ckd.this.dA()) < 4.0;
      }
   }

   class i extends ckd.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ckd.this.p() != null && ckd.this.bY == ckd.a.b;
      }

      @Override
      public boolean b() {
         btn $$0 = ckd.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cmv $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ckd.this.ai > this.e) {
                  this.e = ckd.this.ai + 20;
                  List<cfg> $$2 = ckd.this.dP().a(cfg.class, ckd.this.cK().g(16.0), bsx.a);

                  for (cfg $$3 : $$2) {
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
         ckd.this.h(null);
         ckd.this.bY = ckd.a.a;
      }

      @Override
      public void e() {
         btn $$0 = ckd.this.p();
         if ($$0 != null) {
            ckd.this.e = new evp($$0.du(), $$0.e(0.5), $$0.dA());
            if (ckd.this.cK().g(0.2F).c($$0.cK())) {
               ckd.this.C($$0);
               ckd.this.bY = ckd.a.a;
               if (!ckd.this.aW()) {
                  ckd.this.dP().c(1039, ckd.this.dp(), 0);
               }
            } else if (ckd.this.Q || ckd.this.aO > 0) {
               ckd.this.bY = ckd.a.a;
            }
         }
      }
   }
}
