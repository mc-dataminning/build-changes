import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clf extends bue implements ckv {
   public static final float b = 7.448451F;
   public static final int c = azf.f(24.166098F);
   private static final akh<Integer> d = akl.a(clf.class, akj.b);
   eyw e = eyw.c;
   jf bX = jf.c;
   clf.a bY = clf.a.a;

   public clf(bty<? extends clf> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clf.g(this);
      this.bO = new clf.f(this);
   }

   @Override
   public boolean aZ() {
      return (this.t() + this.ag) % c == 0;
   }

   @Override
   protected cai J() {
      return new clf.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clf.c());
      this.bS.a(2, new clf.i());
      this.bS.a(3, new clf.e());
      this.bT.a(1, new clf.b());
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.am.a(d, azf.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.g(bvu.c).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.a(d);
   }

   @Override
   public void a(akh<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.ap() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         float $$0 = azf.b((float)(this.t() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azf.b((float)(this.t() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awg.ty, this.di(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.dn() * 1.48F;
         float $$3 = azf.b(this.dI() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azf.a(this.dI() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.do() * 2.5F;
         this.dS().a(lo.Z, this.dx() + (double)$$3, this.dz() + (double)$$5, this.dD() + (double)$$4, 0.0, 0.0, 0.0);
         this.dS().a(lo.Z, this.dx() - (double)$$3, this.dz() + (double)$$5, this.dD() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bI() && this.gi()) {
         this.d(8.0F);
      }

      super.n_();
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.bX = this.ds().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new jf($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.q());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   protected awf w() {
      return awg.tv;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.tz;
   }

   @Override
   protected awf o_() {
      return awg.tx;
   }

   @Override
   protected float fd() {
      return 1.0F;
   }

   @Override
   public boolean a(bty<?> $$0) {
      return true;
   }

   @Override
   public btu e(buz $$0) {
      int $$1 = this.q();
      btu $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cbk {
      private final cfd b = cfd.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cnx> $$0 = clf.this.dS().a(this.b, clf.this, clf.this.cO().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(btr::dz).reversed());

               for (cnx $$1 : $$0) {
                  if (clf.this.a($$1, cfd.a)) {
                     clf.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bun $$0 = clf.this.m();
         return $$0 != null ? clf.this.a($$0, cfd.a) : false;
      }
   }

   class c extends cbk {
      private int b;

      @Override
      public boolean b() {
         bun $$0 = clf.this.m();
         return $$0 != null ? clf.this.a($$0, cfd.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         clf.this.bY = clf.a.a;
         this.h();
      }

      @Override
      public void e() {
         clf.this.bX = clf.this.dS().a(eao.a.e, clf.this.bX).b(10 + clf.this.af.a(20));
      }

      @Override
      public void a() {
         if (clf.this.bY == clf.a.a) {
            this.b--;
            if (this.b <= 0) {
               clf.this.bY = clf.a.b;
               this.h();
               this.b = this.a((8 + clf.this.af.a(4)) * 20);
               clf.this.a(awg.tA, 10.0F, 0.95F + clf.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         clf.this.bX = clf.this.m().ds().b(20 + clf.this.af.a(20));
         if (clf.this.bX.v() < clf.this.dS().N()) {
            clf.this.bX = new jf(clf.this.bX.u(), clf.this.dS().N() + 1, clf.this.bX.w());
         }
      }
   }

   class d extends cai {
      public d(final bup $$0) {
         super($$0);
      }

      @Override
      public void a() {
         clf.this.aV = clf.this.aT;
         clf.this.aT = clf.this.dI();
      }
   }

   class e extends clf.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return clf.this.m() == null || clf.this.bY == clf.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + clf.this.af.i() * 10.0F;
         this.e = -4.0F + clf.this.af.i() * 9.0F;
         this.f = clf.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (clf.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + clf.this.af.i() * 9.0F;
         }

         if (clf.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (clf.this.af.a(this.a(450)) == 0) {
            this.c = clf.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (clf.this.e.e < clf.this.dz() && !clf.this.dS().u(clf.this.ds().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (clf.this.e.e > clf.this.dz() && !clf.this.dS().u(clf.this.ds().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jf.c.equals(clf.this.bX)) {
            clf.this.bX = clf.this.ds();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         clf.this.e = eyw.a(clf.this.bX).b((double)(this.d * azf.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azf.a(this.c)));
      }
   }

   class f extends cam {
      public f(final bup $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends can {
      private float m = 0.1F;

      public g(final bup $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (clf.this.Q) {
            clf.this.v(clf.this.dI() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = clf.this.e.d - clf.this.dx();
         double $$1 = clf.this.e.e - clf.this.dz();
         double $$2 = clf.this.e.f - clf.this.dD();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = clf.this.dI();
            float $$7 = (float)azf.d($$2, $$0);
            float $$8 = azf.h(clf.this.dI() + 90.0F);
            float $$9 = azf.h($$7 * (180.0F / (float)Math.PI));
            clf.this.v(azf.e($$8, $$9, 4.0F) - 90.0F);
            clf.this.aT = clf.this.dI();
            if (azf.d($$6, clf.this.dI()) < 3.0F) {
               this.m = azf.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azf.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azf.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            clf.this.w($$10);
            float $$11 = clf.this.dI() + 90.0F;
            double $$12 = (double)(this.m * azf.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azf.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azf.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eyw $$15 = clf.this.dv();
            clf.this.h($$15.e(new eyw($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cbk {
      public h() {
         this.a(EnumSet.of(cbk.a.a));
      }

      protected boolean h() {
         return clf.this.e.c(clf.this.dx(), clf.this.dz(), clf.this.dD()) < 4.0;
      }
   }

   class i extends clf.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return clf.this.m() != null && clf.this.bY == clf.a.b;
      }

      @Override
      public boolean c() {
         bun $$0 = clf.this.m();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bI()) {
            return false;
         } else {
            if ($$0 instanceof cnx $$1 && ($$0.Q_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (clf.this.ag > this.e) {
                  this.e = clf.this.ag + 20;
                  List<cgg> $$2 = clf.this.dS().a(cgg.class, clf.this.cO().g(16.0), btw.a);

                  for (cgg $$3 : $$2) {
                     $$3.gD();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         clf.this.h(null);
         clf.this.bY = clf.a.a;
      }

      @Override
      public void a() {
         bun $$0 = clf.this.m();
         if ($$0 != null) {
            clf.this.e = new eyw($$0.dx(), $$0.e(0.5), $$0.dD());
            if (clf.this.cO().g(0.2F).c($$0.cO())) {
               clf.this.E($$0);
               clf.this.bY = clf.a.a;
               if (!clf.this.ba()) {
                  clf.this.dS().c(1039, clf.this.ds(), 0);
               }
            } else if (clf.this.Q || clf.this.aJ > 0) {
               clf.this.bY = clf.a.a;
            }
         }
      }
   }
}
