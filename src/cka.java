import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cka extends btb implements cjq {
   public static final float b = 7.448451F;
   public static final int c = ayu.f(24.166098F);
   private static final akg<Integer> d = akk.a(cka.class, aki.b);
   evm e = evm.b;
   iz bX = iz.c;
   cka.a bY = cka.a.a;

   public cka(bsv<? extends cka> $$0, dbt $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cka.g(this);
      this.bO = new cka.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bzg E() {
      return new cka.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cka.c());
      this.bS.a(2, new cka.i());
      this.bS.a(3, new cka.e());
      this.bT.a(1, new cka.b());
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayu.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(bus.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(akg<?> $$0) {
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
         float $$0 = ayu.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayu.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), avw.tu, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayu.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayu.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dk() * 2.5F;
         this.dP().a(lj.Z, this.du() + (double)$$3, this.dw() + (double)$$5, this.dA() + (double)$$4, 0.0, 0.0, 0.0);
         this.dP().a(lj.Z, this.du() - (double)$$3, this.dw() + (double)$$5, this.dA() - (double)$$4, 0.0, 0.0, 0.0);
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
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
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
   public avx de() {
      return avx.f;
   }

   @Override
   protected avv v() {
      return avw.tr;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.tv;
   }

   @Override
   protected avv o_() {
      return avw.tt;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bsv<?> $$0) {
      return true;
   }

   @Override
   public bss e(btw $$0) {
      int $$1 = this.s();
      bss $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cai {
      private final ceb b = ceb.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cms> $$0 = cka.this.dP().a(this.b, cka.this, cka.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsp::dw).reversed());

               for (cms $$1 : $$0) {
                  if (cka.this.a($$1, ceb.a)) {
                     cka.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btk $$0 = cka.this.p();
         return $$0 != null ? cka.this.a($$0, ceb.a) : false;
      }
   }

   class c extends cai {
      private int b;

      @Override
      public boolean a() {
         btk $$0 = cka.this.p();
         return $$0 != null ? cka.this.a($$0, ceb.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cka.this.bY = cka.a.a;
         this.h();
      }

      @Override
      public void d() {
         cka.this.bX = cka.this.dP().a(dxp.a.e, cka.this.bX).b(10 + cka.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cka.this.bY == cka.a.a) {
            this.b--;
            if (this.b <= 0) {
               cka.this.bY = cka.a.b;
               this.h();
               this.b = this.a((8 + cka.this.ah.a(4)) * 20);
               cka.this.a(avw.tw, 10.0F, 0.95F + cka.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cka.this.bX = cka.this.p().dp().b(20 + cka.this.ah.a(20));
         if (cka.this.bX.v() < cka.this.dP().z_()) {
            cka.this.bX = new iz(cka.this.bX.u(), cka.this.dP().z_() + 1, cka.this.bX.w());
         }
      }
   }

   class d extends bzg {
      public d(final btm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cka.this.ba = cka.this.aY;
         cka.this.aY = cka.this.dF();
      }
   }

   class e extends cka.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cka.this.p() == null || cka.this.bY == cka.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cka.this.ah.i() * 10.0F;
         this.e = -4.0F + cka.this.ah.i() * 9.0F;
         this.f = cka.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cka.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cka.this.ah.i() * 9.0F;
         }

         if (cka.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cka.this.ah.a(this.a(450)) == 0) {
            this.c = cka.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cka.this.e.d < cka.this.dw() && !cka.this.dP().u(cka.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cka.this.e.d > cka.this.dw() && !cka.this.dP().u(cka.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iz.c.equals(cka.this.bX)) {
            cka.this.bX = cka.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cka.this.e = evm.a(cka.this.bX).b((double)(this.d * ayu.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayu.a(this.c)));
      }
   }

   class f extends bzk {
      public f(final btm $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzl {
      private float m = 0.1F;

      public g(final btm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cka.this.Q) {
            cka.this.r(cka.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cka.this.e.c - cka.this.du();
         double $$1 = cka.this.e.d - cka.this.dw();
         double $$2 = cka.this.e.e - cka.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cka.this.dF();
            float $$7 = (float)ayu.d($$2, $$0);
            float $$8 = ayu.g(cka.this.dF() + 90.0F);
            float $$9 = ayu.g($$7 * (180.0F / (float)Math.PI));
            cka.this.r(ayu.e($$8, $$9, 4.0F) - 90.0F);
            cka.this.aY = cka.this.dF();
            if (ayu.d($$6, cka.this.dF()) < 3.0F) {
               this.m = ayu.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayu.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayu.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cka.this.s($$10);
            float $$11 = cka.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayu.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayu.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayu.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evm $$15 = cka.this.ds();
            cka.this.h($$15.e(new evm($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cai {
      public h() {
         this.a(EnumSet.of(cai.a.a));
      }

      protected boolean h() {
         return cka.this.e.c(cka.this.du(), cka.this.dw(), cka.this.dA()) < 4.0;
      }
   }

   class i extends cka.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cka.this.p() != null && cka.this.bY == cka.a.b;
      }

      @Override
      public boolean b() {
         btk $$0 = cka.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cms $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cka.this.ai > this.e) {
                  this.e = cka.this.ai + 20;
                  List<cfd> $$2 = cka.this.dP().a(cfd.class, cka.this.cK().g(16.0), bsu.a);

                  for (cfd $$3 : $$2) {
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
         cka.this.h(null);
         cka.this.bY = cka.a.a;
      }

      @Override
      public void e() {
         btk $$0 = cka.this.p();
         if ($$0 != null) {
            cka.this.e = new evm($$0.du(), $$0.e(0.5), $$0.dA());
            if (cka.this.cK().g(0.2F).c($$0.cK())) {
               cka.this.C($$0);
               cka.this.bY = cka.a.a;
               if (!cka.this.aW()) {
                  cka.this.dP().c(1039, cka.this.dp(), 0);
               }
            } else if (cka.this.Q || cka.this.aO > 0) {
               cka.this.bY = cka.a.a;
            }
         }
      }
   }
}
