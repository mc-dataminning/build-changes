import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cje extends bsf implements ciu {
   public static final float b = 7.448451F;
   public static final int c = ayd.f(24.166098F);
   private static final ajr<Integer> d = ajv.a(cje.class, ajt.b);
   euk e = euk.b;
   io bX = io.c;
   cje.a bY = cje.a.a;

   public cje(bsa<? extends cje> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cje.g(this);
      this.bO = new cje.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected byk E() {
      return new cje.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cje.c());
      this.bS.a(2, new cje.i());
      this.bS.a(3, new cje.e());
      this.bT.a(1, new cje.b());
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayd.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(btw.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.ao.a(d);
   }

   @Override
   public void a(ajr<?> $$0) {
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
         float $$0 = ayd.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayd.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), avh.tu, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayd.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayd.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
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
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
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
   public avi de() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.tr;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.tv;
   }

   @Override
   protected avg o_() {
      return avh.tt;
   }

   @Override
   protected float fe() {
      return 1.0F;
   }

   @Override
   public boolean a(bsa<?> $$0) {
      return true;
   }

   @Override
   public brx e(bta $$0) {
      int $$1 = this.s();
      brx $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bzm {
      private final cdf b = cdf.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<clw> $$0 = cje.this.dP().a(this.b, cje.this, cje.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bru::dw).reversed());

               for (clw $$1 : $$0) {
                  if (cje.this.a($$1, cdf.a)) {
                     cje.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bso $$0 = cje.this.p();
         return $$0 != null ? cje.this.a($$0, cdf.a) : false;
      }
   }

   class c extends bzm {
      private int b;

      @Override
      public boolean a() {
         bso $$0 = cje.this.p();
         return $$0 != null ? cje.this.a($$0, cdf.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cje.this.bY = cje.a.a;
         this.h();
      }

      @Override
      public void d() {
         cje.this.bX = cje.this.dP().a(dwt.a.e, cje.this.bX).b(10 + cje.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cje.this.bY == cje.a.a) {
            this.b--;
            if (this.b <= 0) {
               cje.this.bY = cje.a.b;
               this.h();
               this.b = this.a((8 + cje.this.ah.a(4)) * 20);
               cje.this.a(avh.tw, 10.0F, 0.95F + cje.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cje.this.bX = cje.this.p().dp().b(20 + cje.this.ah.a(20));
         if (cje.this.bX.v() < cje.this.dP().z_()) {
            cje.this.bX = new io(cje.this.bX.u(), cje.this.dP().z_() + 1, cje.this.bX.w());
         }
      }
   }

   class d extends byk {
      public d(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cje.this.bb = cje.this.aZ;
         cje.this.aZ = cje.this.dF();
      }
   }

   class e extends cje.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cje.this.p() == null || cje.this.bY == cje.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cje.this.ah.i() * 10.0F;
         this.e = -4.0F + cje.this.ah.i() * 9.0F;
         this.f = cje.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cje.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cje.this.ah.i() * 9.0F;
         }

         if (cje.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cje.this.ah.a(this.a(450)) == 0) {
            this.c = cje.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cje.this.e.d < cje.this.dw() && !cje.this.dP().u(cje.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cje.this.e.d > cje.this.dw() && !cje.this.dP().u(cje.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (io.c.equals(cje.this.bX)) {
            cje.this.bX = cje.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cje.this.e = euk.a(cje.this.bX).b((double)(this.d * ayd.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayd.a(this.c)));
      }
   }

   class f extends byo {
      public f(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends byp {
      private float m = 0.1F;

      public g(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cje.this.Q) {
            cje.this.r(cje.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cje.this.e.c - cje.this.du();
         double $$1 = cje.this.e.d - cje.this.dw();
         double $$2 = cje.this.e.e - cje.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cje.this.dF();
            float $$7 = (float)ayd.d($$2, $$0);
            float $$8 = ayd.g(cje.this.dF() + 90.0F);
            float $$9 = ayd.g($$7 * (180.0F / (float)Math.PI));
            cje.this.r(ayd.e($$8, $$9, 4.0F) - 90.0F);
            cje.this.aZ = cje.this.dF();
            if (ayd.d($$6, cje.this.dF()) < 3.0F) {
               this.m = ayd.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayd.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayd.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cje.this.s($$10);
            float $$11 = cje.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayd.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayd.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayd.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            euk $$15 = cje.this.ds();
            cje.this.g($$15.e(new euk($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bzm {
      public h() {
         this.a(EnumSet.of(bzm.a.a));
      }

      protected boolean h() {
         return cje.this.e.c(cje.this.du(), cje.this.dw(), cje.this.dA()) < 4.0;
      }
   }

   class i extends cje.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cje.this.p() != null && cje.this.bY == cje.a.b;
      }

      @Override
      public boolean b() {
         bso $$0 = cje.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof clw $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cje.this.ai > this.e) {
                  this.e = cje.this.ai + 20;
                  List<ceh> $$2 = cje.this.dP().a(ceh.class, cje.this.cK().g(16.0), brz.a);

                  for (ceh $$3 : $$2) {
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
         cje.this.h(null);
         cje.this.bY = cje.a.a;
      }

      @Override
      public void e() {
         bso $$0 = cje.this.p();
         if ($$0 != null) {
            cje.this.e = new euk($$0.du(), $$0.e(0.5), $$0.dA());
            if (cje.this.cK().g(0.2F).c($$0.cK())) {
               cje.this.C($$0);
               cje.this.bY = cje.a.a;
               if (!cje.this.aW()) {
                  cje.this.dP().c(1039, cje.this.dp(), 0);
               }
            } else if (cje.this.Q || cje.this.aP > 0) {
               cje.this.bY = cje.a.a;
            }
         }
      }
   }
}
