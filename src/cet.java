import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cet extends bnz implements cej {
   public static final float b = 7.448451F;
   public static final int c = awi.f(24.166098F);
   private static final aie<Integer> d = aih.a(cet.class, aig.b);
   enz e = enz.b;
   hz bS = hz.c;
   cet.a bT = cet.a.a;

   public cet(bnw<? extends cet> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cet.g(this);
      this.bK = new cet.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ag) % c == 0;
   }

   @Override
   protected bud H() {
      return new cet.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cet.c());
      this.bO.a(2, new cet.i());
      this.bO.a(3, new cet.e());
      this.bP.a(1, new cet.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0);
   }

   public void b(int $$0) {
      this.am.b(d, awi.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.f(bpp.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.am.b(d);
   }

   @Override
   public void a(aie<?> $$0) {
      if (d.equals($$0)) {
         this.A();
      }

      super.a($$0);
   }

   public int w() {
      return this.aj() * 3;
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         float $$0 = awi.b((float)(this.w() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = awi.b((float)(this.w() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atl.sQ, this.db(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dg() * 1.48F;
         float $$3 = awi.b(this.dC() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = awi.a(this.dC() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dh() * 2.5F;
         this.dM().a(jz.W, this.dr() + (double)$$3, this.dt() + (double)$$5, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
         this.dM().a(jz.W, this.dr() - (double)$$3, this.dt() + (double)$$5, this.dx() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bx() && this.ga()) {
         this.g(8);
      }

      super.d_();
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.bS = this.dm().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new hz($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.u());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected atk y() {
      return atl.sN;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.sR;
   }

   @Override
   protected atk n_() {
      return atl.sP;
   }

   @Override
   protected float eW() {
      return 1.0F;
   }

   @Override
   public boolean a(bnw<?> $$0) {
      return true;
   }

   @Override
   public bnt e(bot $$0) {
      int $$1 = this.u();
      bnt $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bvf {
      private final byy b = byy.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<chl> $$0 = cet.this.dM().a(this.b, cet.this, cet.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bnq::dt).reversed());

               for (chl $$1 : $$0) {
                  if (cet.this.a($$1, byy.a)) {
                     cet.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         boi $$0 = cet.this.q();
         return $$0 != null ? cet.this.a($$0, byy.a) : false;
      }
   }

   class c extends bvf {
      private int b;

      @Override
      public boolean a() {
         boi $$0 = cet.this.q();
         return $$0 != null ? cet.this.a($$0, byy.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cet.this.bT = cet.a.a;
         this.h();
      }

      @Override
      public void d() {
         cet.this.bS = cet.this.dM().a(dqv.a.e, cet.this.bS).b(10 + cet.this.af.a(20));
      }

      @Override
      public void e() {
         if (cet.this.bT == cet.a.a) {
            this.b--;
            if (this.b <= 0) {
               cet.this.bT = cet.a.b;
               this.h();
               this.b = this.a((8 + cet.this.af.a(4)) * 20);
               cet.this.a(atl.sS, 10.0F, 0.95F + cet.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         cet.this.bS = cet.this.q().dm().b(20 + cet.this.af.a(20));
         if (cet.this.bS.v() < cet.this.dM().A_()) {
            cet.this.bS = new hz(cet.this.bS.u(), cet.this.dM().A_() + 1, cet.this.bS.w());
         }
      }
   }

   class d extends bud {
      public d(bok $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cet.this.aW = cet.this.aU;
         cet.this.aU = cet.this.dC();
      }
   }

   class e extends cet.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cet.this.q() == null || cet.this.bT == cet.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cet.this.af.i() * 10.0F;
         this.e = -4.0F + cet.this.af.i() * 9.0F;
         this.f = cet.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cet.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + cet.this.af.i() * 9.0F;
         }

         if (cet.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cet.this.af.a(this.a(450)) == 0) {
            this.c = cet.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cet.this.e.d < cet.this.dt() && !cet.this.dM().u(cet.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cet.this.e.d > cet.this.dt() && !cet.this.dM().u(cet.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hz.c.equals(cet.this.bS)) {
            cet.this.bS = cet.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cet.this.e = enz.a(cet.this.bS).b((double)(this.d * awi.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * awi.a(this.c)));
      }
   }

   class f extends buh {
      public f(bok $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bui {
      private float m = 0.1F;

      public g(bok $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cet.this.O) {
            cet.this.r(cet.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cet.this.e.c - cet.this.dr();
         double $$1 = cet.this.e.d - cet.this.dt();
         double $$2 = cet.this.e.e - cet.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cet.this.dC();
            float $$7 = (float)awi.d($$2, $$0);
            float $$8 = awi.g(cet.this.dC() + 90.0F);
            float $$9 = awi.g($$7 * (180.0F / (float)Math.PI));
            cet.this.r(awi.e($$8, $$9, 4.0F) - 90.0F);
            cet.this.aU = cet.this.dC();
            if (awi.d($$6, cet.this.dC()) < 3.0F) {
               this.m = awi.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = awi.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(awi.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cet.this.s($$10);
            float $$11 = cet.this.dC() + 90.0F;
            double $$12 = (double)(this.m * awi.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * awi.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * awi.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            enz $$15 = cet.this.dp();
            cet.this.g($$15.e(new enz($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bvf {
      public h() {
         this.a(EnumSet.of(bvf.a.a));
      }

      protected boolean h() {
         return cet.this.e.c(cet.this.dr(), cet.this.dt(), cet.this.dx()) < 4.0;
      }
   }

   class i extends cet.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cet.this.q() != null && cet.this.bT == cet.a.b;
      }

      @Override
      public boolean b() {
         boi $$0 = cet.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof chl $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cet.this.ag > this.e) {
                  this.e = cet.this.ag + 20;
                  List<caa> $$2 = cet.this.dM().a(caa.class, cet.this.cH().g(16.0), bnv.a);

                  for (caa $$3 : $$2) {
                     $$3.gr();
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
         cet.this.h(null);
         cet.this.bT = cet.a.a;
      }

      @Override
      public void e() {
         boi $$0 = cet.this.q();
         if ($$0 != null) {
            cet.this.e = new enz($$0.dr(), $$0.e(0.5), $$0.dx());
            if (cet.this.cH().g(0.2F).c($$0.cH())) {
               cet.this.B($$0);
               cet.this.bT = cet.a.a;
               if (!cet.this.aU()) {
                  cet.this.dM().c(1039, cet.this.dm(), 0);
               }
            } else if (cet.this.O || cet.this.aK > 0) {
               cet.this.bT = cet.a.a;
            }
         }
      }
   }
}
