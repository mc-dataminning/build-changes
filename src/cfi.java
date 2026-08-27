import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cfi extends boo implements cey {
   public static final float b = 7.448451F;
   public static final int c = awm.f(24.166098F);
   private static final aii<Integer> d = ail.a(cfi.class, aik.b);
   eov e = eov.b;
   ib bU = ib.c;
   cfi.a bV = cfi.a.a;

   public cfi(bol<? extends cfi> $$0, cwe $$1) {
      super($$0, $$1);
      this.bK = 5;
      this.bM = new cfi.g(this);
      this.bL = new cfi.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ag) % c == 0;
   }

   @Override
   protected bus H() {
      return new cfi.d(this);
   }

   @Override
   protected void B() {
      this.bP.a(1, new cfi.c());
      this.bP.a(2, new cfi.i());
      this.bP.a(3, new cfi.e());
      this.bQ.a(1, new cfi.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0);
   }

   public void b(int $$0) {
      this.am.b(d, awm.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.f(bqe.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.am.b(d);
   }

   @Override
   public void a(aii<?> $$0) {
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
      if (this.dJ().B) {
         float $$0 = awm.b((float)(this.w() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = awm.b((float)(this.w() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.sQ, this.cY(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dd() * 1.48F;
         float $$3 = awm.b(this.dz() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = awm.a(this.dz() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.de() * 2.5F;
         this.dJ().a(kb.W, this.do() + (double)$$3, this.dq() + (double)$$5, this.du() + (double)$$4, 0.0, 0.0, 0.0);
         this.dJ().a(kb.W, this.do() - (double)$$3, this.dq() + (double)$$5, this.du() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bx() && this.gf()) {
         this.g(8);
      }

      super.d_();
   }

   @Override
   protected void aa() {
      super.aa();
   }

   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.bU = this.dj().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bU = new ib($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("AX", this.bU.u());
      $$0.a("AY", this.bU.v());
      $$0.a("AZ", this.bU.w());
      $$0.a("Size", this.u());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public atq cY() {
      return atq.f;
   }

   @Override
   protected ato y() {
      return atp.sN;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.sR;
   }

   @Override
   protected ato n_() {
      return atp.sP;
   }

   @Override
   protected float eY() {
      return 1.0F;
   }

   @Override
   public boolean a(bol<?> $$0) {
      return true;
   }

   @Override
   public boi e(bpi $$0) {
      int $$1 = this.u();
      boi $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bvu {
      private final bzn b = bzn.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cia> $$0 = cfi.this.dJ().a(this.b, cfi.this, cfi.this.cE().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bof::dq).reversed());

               for (cia $$1 : $$0) {
                  if (cfi.this.a($$1, bzn.a)) {
                     cfi.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         box $$0 = cfi.this.q();
         return $$0 != null ? cfi.this.a($$0, bzn.a) : false;
      }
   }

   class c extends bvu {
      private int b;

      @Override
      public boolean a() {
         box $$0 = cfi.this.q();
         return $$0 != null ? cfi.this.a($$0, bzn.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cfi.this.bV = cfi.a.a;
         this.h();
      }

      @Override
      public void d() {
         cfi.this.bU = cfi.this.dJ().a(drq.a.e, cfi.this.bU).b(10 + cfi.this.af.a(20));
      }

      @Override
      public void e() {
         if (cfi.this.bV == cfi.a.a) {
            this.b--;
            if (this.b <= 0) {
               cfi.this.bV = cfi.a.b;
               this.h();
               this.b = this.a((8 + cfi.this.af.a(4)) * 20);
               cfi.this.a(atp.sS, 10.0F, 0.95F + cfi.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         cfi.this.bU = cfi.this.q().dj().b(20 + cfi.this.af.a(20));
         if (cfi.this.bU.v() < cfi.this.dJ().A_()) {
            cfi.this.bU = new ib(cfi.this.bU.u(), cfi.this.dJ().A_() + 1, cfi.this.bU.w());
         }
      }
   }

   class d extends bus {
      public d(boz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cfi.this.aX = cfi.this.aV;
         cfi.this.aV = cfi.this.dz();
      }
   }

   class e extends cfi.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cfi.this.q() == null || cfi.this.bV == cfi.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cfi.this.af.i() * 10.0F;
         this.e = -4.0F + cfi.this.af.i() * 9.0F;
         this.f = cfi.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cfi.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + cfi.this.af.i() * 9.0F;
         }

         if (cfi.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cfi.this.af.a(this.a(450)) == 0) {
            this.c = cfi.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cfi.this.e.d < cfi.this.dq() && !cfi.this.dJ().u(cfi.this.dj().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cfi.this.e.d > cfi.this.dq() && !cfi.this.dJ().u(cfi.this.dj().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ib.c.equals(cfi.this.bU)) {
            cfi.this.bU = cfi.this.dj();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cfi.this.e = eov.a(cfi.this.bU).b((double)(this.d * awm.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * awm.a(this.c)));
      }
   }

   class f extends buw {
      public f(boz $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bux {
      private float m = 0.1F;

      public g(boz $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cfi.this.O) {
            cfi.this.r(cfi.this.dz() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cfi.this.e.c - cfi.this.do();
         double $$1 = cfi.this.e.d - cfi.this.dq();
         double $$2 = cfi.this.e.e - cfi.this.du();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cfi.this.dz();
            float $$7 = (float)awm.d($$2, $$0);
            float $$8 = awm.g(cfi.this.dz() + 90.0F);
            float $$9 = awm.g($$7 * (180.0F / (float)Math.PI));
            cfi.this.r(awm.e($$8, $$9, 4.0F) - 90.0F);
            cfi.this.aV = cfi.this.dz();
            if (awm.d($$6, cfi.this.dz()) < 3.0F) {
               this.m = awm.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = awm.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(awm.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cfi.this.s($$10);
            float $$11 = cfi.this.dz() + 90.0F;
            double $$12 = (double)(this.m * awm.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * awm.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * awm.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eov $$15 = cfi.this.dm();
            cfi.this.g($$15.e(new eov($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bvu {
      public h() {
         this.a(EnumSet.of(bvu.a.a));
      }

      protected boolean h() {
         return cfi.this.e.c(cfi.this.do(), cfi.this.dq(), cfi.this.du()) < 4.0;
      }
   }

   class i extends cfi.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cfi.this.q() != null && cfi.this.bV == cfi.a.b;
      }

      @Override
      public boolean b() {
         box $$0 = cfi.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cia $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cfi.this.ag > this.e) {
                  this.e = cfi.this.ag + 20;
                  List<cap> $$2 = cfi.this.dJ().a(cap.class, cfi.this.cE().g(16.0), bok.a);

                  for (cap $$3 : $$2) {
                     $$3.gw();
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
         cfi.this.h(null);
         cfi.this.bV = cfi.a.a;
      }

      @Override
      public void e() {
         box $$0 = cfi.this.q();
         if ($$0 != null) {
            cfi.this.e = new eov($$0.do(), $$0.e(0.5), $$0.du());
            if (cfi.this.cE().g(0.2F).c($$0.cE())) {
               cfi.this.B($$0);
               cfi.this.bV = cfi.a.a;
               if (!cfi.this.aU()) {
                  cfi.this.dJ().c(1039, cfi.this.dj(), 0);
               }
            } else if (cfi.this.O || cfi.this.aL > 0) {
               cfi.this.bV = cfi.a.a;
            }
         }
      }
   }
}
