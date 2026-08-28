import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ckg extends bth implements cjw {
   public static final float b = 7.448451F;
   public static final int c = ayz.f(24.166098F);
   private static final akk<Integer> d = ako.a(ckg.class, akm.b);
   evs e = evs.b;
   iz bX = iz.c;
   ckg.a bY = ckg.a.a;

   public ckg(btb<? extends ckg> $$0, dbz $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new ckg.g(this);
      this.bO = new ckg.f(this);
   }

   @Override
   public boolean aV() {
      return (this.u() + this.ai) % c == 0;
   }

   @Override
   protected bzm E() {
      return new ckg.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new ckg.c());
      this.bS.a(2, new ckg.i());
      this.bS.a(3, new ckg.e());
      this.bT.a(1, new ckg.b());
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
      this.f(buy.c).a((double)(6 + this.s()));
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
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
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
   protected avz d(bro $$0) {
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
   public boolean a(btb<?> $$0) {
      return true;
   }

   @Override
   public bsy e(buc $$0) {
      int $$1 = this.s();
      bsy $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cao {
      private final ceh b = ceh.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cmy> $$0 = ckg.this.dP().a(this.b, ckg.this, ckg.this.cK().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bsv::dw).reversed());

               for (cmy $$1 : $$0) {
                  if (ckg.this.a($$1, ceh.a)) {
                     ckg.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         btq $$0 = ckg.this.p();
         return $$0 != null ? ckg.this.a($$0, ceh.a) : false;
      }
   }

   class c extends cao {
      private int b;

      @Override
      public boolean a() {
         btq $$0 = ckg.this.p();
         return $$0 != null ? ckg.this.a($$0, ceh.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         ckg.this.bY = ckg.a.a;
         this.h();
      }

      @Override
      public void d() {
         ckg.this.bX = ckg.this.dP().a(dxv.a.e, ckg.this.bX).b(10 + ckg.this.ah.a(20));
      }

      @Override
      public void e() {
         if (ckg.this.bY == ckg.a.a) {
            this.b--;
            if (this.b <= 0) {
               ckg.this.bY = ckg.a.b;
               this.h();
               this.b = this.a((8 + ckg.this.ah.a(4)) * 20);
               ckg.this.a(awa.tw, 10.0F, 0.95F + ckg.this.ah.i() * 0.1F);
            }
         }
      }

      private void h() {
         ckg.this.bX = ckg.this.p().dp().b(20 + ckg.this.ah.a(20));
         if (ckg.this.bX.v() < ckg.this.dP().z_()) {
            ckg.this.bX = new iz(ckg.this.bX.u(), ckg.this.dP().z_() + 1, ckg.this.bX.w());
         }
      }
   }

   class d extends bzm {
      public d(final bts $$0) {
         super($$0);
      }

      @Override
      public void a() {
         ckg.this.ba = ckg.this.aY;
         ckg.this.aY = ckg.this.dF();
      }
   }

   class e extends ckg.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return ckg.this.p() == null || ckg.this.bY == ckg.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + ckg.this.ah.i() * 10.0F;
         this.e = -4.0F + ckg.this.ah.i() * 9.0F;
         this.f = ckg.this.ah.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (ckg.this.ah.a(this.a(350)) == 0) {
            this.e = -4.0F + ckg.this.ah.i() * 9.0F;
         }

         if (ckg.this.ah.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (ckg.this.ah.a(this.a(450)) == 0) {
            this.c = ckg.this.ah.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (ckg.this.e.d < ckg.this.dw() && !ckg.this.dP().u(ckg.this.dp().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (ckg.this.e.d > ckg.this.dw() && !ckg.this.dP().u(ckg.this.dp().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (iz.c.equals(ckg.this.bX)) {
            ckg.this.bX = ckg.this.dp();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         ckg.this.e = evs.a(ckg.this.bX).b((double)(this.d * ayz.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * ayz.a(this.c)));
      }
   }

   class f extends bzq {
      public f(final bts $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bzr {
      private float m = 0.1F;

      public g(final bts $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (ckg.this.Q) {
            ckg.this.r(ckg.this.dF() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = ckg.this.e.c - ckg.this.du();
         double $$1 = ckg.this.e.d - ckg.this.dw();
         double $$2 = ckg.this.e.e - ckg.this.dA();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = ckg.this.dF();
            float $$7 = (float)ayz.d($$2, $$0);
            float $$8 = ayz.g(ckg.this.dF() + 90.0F);
            float $$9 = ayz.g($$7 * (180.0F / (float)Math.PI));
            ckg.this.r(ayz.e($$8, $$9, 4.0F) - 90.0F);
            ckg.this.aY = ckg.this.dF();
            if (ayz.d($$6, ckg.this.dF()) < 3.0F) {
               this.m = ayz.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = ayz.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(ayz.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            ckg.this.s($$10);
            float $$11 = ckg.this.dF() + 90.0F;
            double $$12 = (double)(this.m * ayz.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * ayz.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * ayz.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            evs $$15 = ckg.this.ds();
            ckg.this.h($$15.e(new evs($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends cao {
      public h() {
         this.a(EnumSet.of(cao.a.a));
      }

      protected boolean h() {
         return ckg.this.e.c(ckg.this.du(), ckg.this.dw(), ckg.this.dA()) < 4.0;
      }
   }

   class i extends ckg.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return ckg.this.p() != null && ckg.this.bY == ckg.a.b;
      }

      @Override
      public boolean b() {
         btq $$0 = ckg.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bD()) {
            return false;
         } else {
            if ($$0 instanceof cmy $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (ckg.this.ai > this.e) {
                  this.e = ckg.this.ai + 20;
                  List<cfj> $$2 = ckg.this.dP().a(cfj.class, ckg.this.cK().g(16.0), bta.a);

                  for (cfj $$3 : $$2) {
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
         ckg.this.h(null);
         ckg.this.bY = ckg.a.a;
      }

      @Override
      public void e() {
         btq $$0 = ckg.this.p();
         if ($$0 != null) {
            ckg.this.e = new evs($$0.du(), $$0.e(0.5), $$0.dA());
            if (ckg.this.cK().g(0.2F).c($$0.cK())) {
               ckg.this.C($$0);
               ckg.this.bY = ckg.a.a;
               if (!ckg.this.aW()) {
                  ckg.this.dP().c(1039, ckg.this.dp(), 0);
               }
            } else if (ckg.this.Q || ckg.this.aO > 0) {
               ckg.this.bY = ckg.a.a;
            }
         }
      }
   }
}
