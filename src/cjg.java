import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cjg extends bsh implements ciw {
   public static final float b = 7.448451F;
   public static final int c = ayf.f(24.166098F);
   private static final ajs<Integer> d = ajw.a(cjg.class, aju.b);
   eum e = eum.b;
   io bX = io.c;
   cjg.a bY = cjg.a.a;

   public cjg(bsc<? extends cjg> $$0, daz $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cjg.g(this);
      this.bO = new cjg.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bym E() {
      return new cjg.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cjg.c());
      this.bS.a(2, new cjg.i());
      this.bS.a(3, new cjg.e());
      this.bT.a(1, new cjg.b());
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayf.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(bty.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajs<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int u() {
      return this.al() * 3;
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         float $$0 = ayf.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayf.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), avi.tu, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayf.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayf.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dk() * 2.5F;
         this.dP().a(ky.Z, this.du() + (double)$$3, this.dw() + (double)$$5, this.dA() + (double)$$4, 0.0, 0.0, 0.0);
         this.dP().a(ky.Z, this.du() - (double)$$3, this.dw() + (double)$$5, this.dA() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bD() && this.gj()) {
         this.g(8);
      }

      super.n_();
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.bX = this.dp().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new io($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ud $$0) {
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
   public avj de() {
      return avj.f;
   }

   @Override
   protected avh v() {
      return avi.tr;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.tv;
   }

   @Override
   protected avh o_() {
      return avi.tt;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bsc<?> $$0) {
      return true;
   }

   @Override
   public brz e(btc $$0) {
      int $$1 = this.s();
      brz $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bzo {
      private final cdh b = cdh.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cly> $$0 = cjg.this.dP().a(this.b, cjg.this, cjg.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(brw::dw).reversed());

               for (cly $$1 : $$0) {
                  if (cjg.this.a($$1, cdh.a)) {
                     cjg.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bsq $$0 = cjg.this.p();
         return $$0 != null ? cjg.this.a($$0, cdh.a) : false;
      }
   }

   class c extends bzo {
      private int b;

      @Override
      public boolean a() {
         bsq $$0 = cjg.this.p();
         return $$0 != null ? cjg.this.a($$0, cdh.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cjg.this.bY = cjg.a.a;
         this.h();
      }

      @Override
      public void d() {
         cjg.this.bX = cjg.this.dP().a(dwv.a.e, cjg.this.bX).b(10 + cjg.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cjg.this.bY == cjg.a.a) {
            this.b--;
            if (this.b <= 0) {
               cjg.this.bY = cjg.a.b;
               this.h();
               this.b = this.a((8 + cjg.this.ah.a(4)) * 20);
               cjg.this.a(avi.tw, 10.0F, 0.95F + cjg.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cjg.this.bX = cjg.this.p().dp().b(20 + cjg.this.ah.a(20));
         if (cjg.this.bX.v() < cjg.this.dP().z_()) {
            cjg.this.bX = new io(cjg.this.bX.u(), cjg.this.dP().z_() + 1, cjg.this.bX.w());
         }
      }
   }

   class d extends bym {
      public d(bss $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cjg.this.ba = cjg.this.aY;
         cjg.this.aY = cjg.this.dF();
      }
   }

   class e extends cjg.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cjg.this.p() == null || cjg.this.bY == cjg.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cjg.this.ah.i() * 10.0F;
         this.e = -4.0F + cjg.this.ah.i() * 9.0F;
         this.f = cjg.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cjg.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cjg.this.ah.i() * 9.0F;
         }

         if (cjg.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cjg.this.ah.a(this.a(450)) == 0) {
            this.c = cjg.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cjg.this.e.d < cjg.this.dw() && !cjg.this.dP().u(cjg.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cjg.this.e.d > cjg.this.dw() && !cjg.this.dP().u(cjg.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (io.c.equals(cjg.this.bX)) {
            cjg.this.bX = cjg.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cjg.this.e = eum.a(cjg.this.bX).b((double)(this.d * ayf.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayf.a(this.c)));
      }
   }

   class f extends byq {
      public f(bss $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends byr {
      private float m = 0.1F;

      public g(bss $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cjg.this.Q) {
            cjg.this.r(cjg.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cjg.this.e.c - cjg.this.du();
         double $$1 = cjg.this.e.d - cjg.this.dw();
         double $$2 = cjg.this.e.e - cjg.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cjg.this.dF();
            float $$7 = (float)ayf.d($$2, $$0);
            float $$8 = ayf.g(cjg.this.dF() + 90.0F);
            float $$9 = ayf.g($$7 * (180.0F / (float)Math.PI));
            cjg.this.r(ayf.e($$8, $$9, 4.0F) - 90.0F);
            cjg.this.aY = cjg.this.dF();
            if (ayf.d($$6, cjg.this.dF()) < 3.0F) {
               this.m = ayf.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayf.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayf.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cjg.this.s($$10);
            float $$11 = cjg.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayf.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayf.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayf.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eum $$15 = cjg.this.ds();
            cjg.this.g($$15.e(new eum($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bzo {
      public h() {
         this.a(EnumSet.of(bzo.a.a));
      }

      protected boolean h() {
         return cjg.this.e.c(cjg.this.du(), cjg.this.dw(), cjg.this.dA()) < 4.0;
      }
   }

   class i extends cjg.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cjg.this.p() != null && cjg.this.bY == cjg.a.b;
      }

      @Override
      public boolean b() {
         bsq $$0 = cjg.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cly $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cjg.this.ai > this.e) {
                  this.e = cjg.this.ai + 20;
                  List<cej> $$2 = cjg.this.dP().a(cej.class, cjg.this.cK().g(16.0), bsb.a);

                  for (cej $$3 : $$2) {
                     $$3.gz();
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
         cjg.this.h(null);
         cjg.this.bY = cjg.a.a;
      }

      @Override
      public void e() {
         bsq $$0 = cjg.this.p();
         if ($$0 != null) {
            cjg.this.e = new eum($$0.du(), $$0.e(0.5), $$0.dA());
            if (cjg.this.cK().g(0.2F).c($$0.cK())) {
               cjg.this.C($$0);
               cjg.this.bY = cjg.a.a;
               if (!cjg.this.aW()) {
                  cjg.this.dP().c(1039, cjg.this.dp(), 0);
               }
            } else if (cjg.this.Q || cjg.this.aO > 0) {
               cjg.this.bY = cjg.a.a;
            }
         }
      }
   }
}
