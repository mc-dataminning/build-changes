import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cke extends btf implements cju {
   public static final float b = 7.448451F;
   public static final int c = ayy.f(24.166098F);
   private static final akj<Integer> d = akn.a(cke.class, akl.b);
   evq e = evq.b;
   iz bX = iz.c;
   cke.a bY = cke.a.a;

   public cke(bsz<? extends cke> $$0, dbx $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new cke.g(this);
      this.bO = new cke.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bzk E() {
      return new cke.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cke.c());
      this.bS.a(2, new cke.i());
      this.bS.a(3, new cke.e());
      this.bT.a(1, new cke.b());
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.ao.a(d, ayy.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(buw.c).a((double)(6 + this.s()));
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
         float $$0 = ayy.b((float)(this.u() + this.ai) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = ayy.b((float)(this.u() + this.ai + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dP().a(this.du(), this.dw(), this.dA(), avz.tu, this.de(), 0.95F + this.ah.i() * 0.05F, 0.95F + this.ah.i() * 0.05F, false);
         }

         float $$2 = this.dj() * 1.48F;
         float $$3 = ayy.b(this.dF() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = ayy.a(this.dF() * (float) (Math.PI / 180.0)) * $$2;
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
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
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
   protected avy d(brm $$0) {
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
   public boolean a(bsz<?> $$0) {
      return true;
   }

   @Override
   public bsw e(bua $$0) {
      int $$1 = this.s();
      bsw $$2 = super.e($$0);
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
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmw> $$0 = cke.this.dP().a(this.b, cke.this, cke.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bst::dw).reversed());

               for (cmw $$1 : $$0) {
                  if (cke.this.a($$1, cef.a)) {
                     cke.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bto $$0 = cke.this.p();
         return $$0 != null ? cke.this.a($$0, cef.a) : false;
      }
   }

   class c extends cam {
      private int b;

      @Override
      public boolean a() {
         bto $$0 = cke.this.p();
         return $$0 != null ? cke.this.a($$0, cef.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cke.this.bY = cke.a.a;
         this.h();
      }

      @Override
      public void d() {
         cke.this.bX = cke.this.dP().a(dxt.a.e, cke.this.bX).b(10 + cke.this.ah.a(20));
      }

      @Override
      public void e() {
         if (cke.this.bY == cke.a.a) {
            this.b--;
            if (this.b <= 0) {
               cke.this.bY = cke.a.b;
               this.h();
               this.b = this.a((8 + cke.this.ah.a(4)) * 20);
               cke.this.a(avz.tw, 10.0F, 0.95F + cke.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         cke.this.bX = cke.this.p().dp().b(20 + cke.this.ah.a(20));
         if (cke.this.bX.v() < cke.this.dP().z_()) {
            cke.this.bX = new iz(cke.this.bX.u(), cke.this.dP().z_() + 1, cke.this.bX.w());
         }
      }
   }

   class d extends bzk {
      public d(final btq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cke.this.ba = cke.this.aY;
         cke.this.aY = cke.this.dF();
      }
   }

   class e extends cke.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cke.this.p() == null || cke.this.bY == cke.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cke.this.ah.i() * 10.0F;
         this.e = -4.0F + cke.this.ah.i() * 9.0F;
         this.f = cke.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cke.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + cke.this.ah.i() * 9.0F;
         }

         if (cke.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cke.this.ah.a(this.a(450)) == 0) {
            this.c = cke.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cke.this.e.d < cke.this.dw() && !cke.this.dP().u(cke.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cke.this.e.d > cke.this.dw() && !cke.this.dP().u(cke.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iz.c.equals(cke.this.bX)) {
            cke.this.bX = cke.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cke.this.e = evq.a(cke.this.bX).b((double)(this.d * ayy.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayy.a(this.c)));
      }
   }

   class f extends bzo {
      public f(final btq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzp {
      private float m = 0.1F;

      public g(final btq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cke.this.Q) {
            cke.this.r(cke.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cke.this.e.c - cke.this.du();
         double $$1 = cke.this.e.d - cke.this.dw();
         double $$2 = cke.this.e.e - cke.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cke.this.dF();
            float $$7 = (float)ayy.d($$2, $$0);
            float $$8 = ayy.g(cke.this.dF() + 90.0F);
            float $$9 = ayy.g($$7 * (180.0F / (float)Math.PI));
            cke.this.r(ayy.e($$8, $$9, 4.0F) - 90.0F);
            cke.this.aY = cke.this.dF();
            if (ayy.d($$6, cke.this.dF()) < 3.0F) {
               this.m = ayy.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayy.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayy.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cke.this.s($$10);
            float $$11 = cke.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayy.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayy.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayy.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evq $$15 = cke.this.ds();
            cke.this.h($$15.e(new evq($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cam {
      public h() {
         this.a(EnumSet.of(cam.a.a));
      }

      protected boolean h() {
         return cke.this.e.c(cke.this.du(), cke.this.dw(), cke.this.dA()) < 4.0;
      }
   }

   class i extends cke.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cke.this.p() != null && cke.this.bY == cke.a.b;
      }

      @Override
      public boolean b() {
         bto $$0 = cke.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cmw $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cke.this.ai > this.e) {
                  this.e = cke.this.ai + 20;
                  List<cfh> $$2 = cke.this.dP().a(cfh.class, cke.this.cK().g(16.0), bsy.a);

                  for (cfh $$3 : $$2) {
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
         cke.this.h(null);
         cke.this.bY = cke.a.a;
      }

      @Override
      public void e() {
         bto $$0 = cke.this.p();
         if ($$0 != null) {
            cke.this.e = new evq($$0.du(), $$0.e(0.5), $$0.dA());
            if (cke.this.cK().g(0.2F).c($$0.cK())) {
               cke.this.C($$0);
               cke.this.bY = cke.a.a;
               if (!cke.this.aW()) {
                  cke.this.dP().c(1039, cke.this.dp(), 0);
               }
            } else if (cke.this.Q || cke.this.aO > 0) {
               cke.this.bY = cke.a.a;
            }
         }
      }
   }
}
