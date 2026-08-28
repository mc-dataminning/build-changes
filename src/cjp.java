import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cjp extends bsp implements cjf {
   public static final float b = 7.448451F;
   public static final int c = aye.f(24.166098F);
   private static final ajp<Integer> d = ajt.a(cjp.class, ajr.b);
   evz e = evz.b;
   ja bZ = ja.c;
   cjp.a ca = cjp.a.a;

   public cjp(bsj<? extends cjp> $$0, dcd $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bR = new cjp.g(this);
      this.bQ = new cjp.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected byu E() {
      return new cjp.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cjp.c());
      this.bU.a(2, new cjp.i());
      this.bU.a(3, new cjp.e());
      this.bV.a(1, new cjp.b());
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, aye.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(bug.c).a((double)(6 + this.s()));
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
         float $$0 = aye.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = aye.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), avf.tx, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = aye.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = aye.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dk() * 2.5F;
         this.dP().a(lj.Z, this.du() + (double)$$3, this.dw() + (double)$$5, this.dA() + (double)$$4, 0.0, 0.0, 0.0);
         this.dP().a(lj.Z, this.du() - (double)$$3, this.dw() + (double)$$5, this.dA() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bD() && this.gh()) {
         this.d(8.0F);
      }

      super.n_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      this.bZ = this.dp().b(5);
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
   public avg de() {
      return avg.f;
   }

   @Override
   protected ave v() {
      return avf.tu;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.ty;
   }

   @Override
   protected ave o_() {
      return avf.tw;
   }

   @Override
   protected float fa() {
      return 1.0F;
   }

   @Override
   public boolean a(bsj<?> $$0) {
      return true;
   }

   @Override
   public bsg e(btk $$0) {
      int $$1 = this.s();
      bsg $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bzw {
      private final cdp b = cdp.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmh> $$0 = cjp.this.dP().a(this.b, cjp.this, cjp.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsd::dw).reversed());

               for (cmh $$1 : $$0) {
                  if (cjp.this.a($$1, cdp.a)) {
                     cjp.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bsy $$0 = cjp.this.p();
         return $$0 != null ? cjp.this.a($$0, cdp.a) : false;
      }
   }

   class c extends bzw {
      private int b;

      @Override
      public boolean a() {
         bsy $$0 = cjp.this.p();
         return $$0 != null ? cjp.this.a($$0, cdp.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cjp.this.ca = cjp.a.a;
         this.h();
      }

      @Override
      public void d() {
         cjp.this.bZ = cjp.this.dP().a(dxz.a.e, cjp.this.bZ).b(10 + cjp.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cjp.this.ca == cjp.a.a) {
            this.b--;
            if (this.b <= 0) {
               cjp.this.ca = cjp.a.b;
               this.h();
               this.b = this.a((8 + cjp.this.ah.a(4)) * 20);
               cjp.this.a(avf.tz, 10.0F, 0.95F + cjp.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cjp.this.bZ = cjp.this.p().dp().b(20 + cjp.this.ah.a(20));
         if (cjp.this.bZ.v() < cjp.this.dP().z_()) {
            cjp.this.bZ = new ja(cjp.this.bZ.u(), cjp.this.dP().z_() + 1, cjp.this.bZ.w());
         }
      }
   }

   class d extends byu {
      public d(final bta $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cjp.this.ba = cjp.this.aY;
         cjp.this.aY = cjp.this.dF();
      }
   }

   class e extends cjp.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cjp.this.p() == null || cjp.this.ca == cjp.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cjp.this.ah.i() * 10.0F;
         this.e = -4.0F + cjp.this.ah.i() * 9.0F;
         this.f = cjp.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cjp.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cjp.this.ah.i() * 9.0F;
         }

         if (cjp.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cjp.this.ah.a(this.a(450)) == 0) {
            this.c = cjp.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cjp.this.e.d < cjp.this.dw() && !cjp.this.dP().u(cjp.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cjp.this.e.d > cjp.this.dw() && !cjp.this.dP().u(cjp.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ja.c.equals(cjp.this.bZ)) {
            cjp.this.bZ = cjp.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cjp.this.e = evz.a(cjp.this.bZ).b((double)(this.d * aye.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * aye.a(this.c)));
      }
   }

   class f extends byy {
      public f(final bta $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends byz {
      private float m = 0.1F;

      public g(final bta $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cjp.this.Q) {
            cjp.this.s(cjp.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cjp.this.e.c - cjp.this.du();
         double $$1 = cjp.this.e.d - cjp.this.dw();
         double $$2 = cjp.this.e.e - cjp.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cjp.this.dF();
            float $$7 = (float)aye.d($$2, $$0);
            float $$8 = aye.g(cjp.this.dF() + 90.0F);
            float $$9 = aye.g($$7 * (180.0F / (float)Math.PI));
            cjp.this.s(aye.e($$8, $$9, 4.0F) - 90.0F);
            cjp.this.aY = cjp.this.dF();
            if (aye.d($$6, cjp.this.dF()) < 3.0F) {
               this.m = aye.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = aye.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(aye.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cjp.this.t($$10);
            float $$11 = cjp.this.dF() + 90.0F;
            double $$12 = (double)(this.m * aye.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * aye.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * aye.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evz $$15 = cjp.this.ds();
            cjp.this.h($$15.e(new evz($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bzw {
      public h() {
         this.a(EnumSet.of(bzw.a.a));
      }

      protected boolean h() {
         return cjp.this.e.c(cjp.this.du(), cjp.this.dw(), cjp.this.dA()) < 4.0;
      }
   }

   class i extends cjp.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cjp.this.p() != null && cjp.this.ca == cjp.a.b;
      }

      @Override
      public boolean b() {
         bsy $$0 = cjp.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cmh $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cjp.this.ai > this.e) {
                  this.e = cjp.this.ai + 20;
                  List<cer> $$2 = cjp.this.dP().a(cer.class, cjp.this.cK().g(16.0), bsi.a);

                  for (cer $$3 : $$2) {
                     $$3.gx();
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
         cjp.this.h(null);
         cjp.this.ca = cjp.a.a;
      }

      @Override
      public void e() {
         bsy $$0 = cjp.this.p();
         if ($$0 != null) {
            cjp.this.e = new evz($$0.du(), $$0.e(0.5), $$0.dA());
            if (cjp.this.cK().g(0.2F).c($$0.cK())) {
               cjp.this.D($$0);
               cjp.this.ca = cjp.a.a;
               if (!cjp.this.aW()) {
                  cjp.this.dP().c(1039, cjp.this.dp(), 0);
               }
            } else if (cjp.this.Q || cjp.this.aO > 0) {
               cjp.this.ca = cjp.a.a;
            }
         }
      }
   }
}
