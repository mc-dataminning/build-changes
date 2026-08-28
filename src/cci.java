import java.util.EnumSet;

public class cci<T extends cla & cle & ckn> extends cbh {
   public static final bra a = bae.a(1, 2);
   private final T b;
   private cci.a c = cci.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cci(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cbh.a.a, cbh.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cvt.vX);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.P().m()) && this.h();
   }

   private boolean i() {
      return this.b.m() != null && this.b.m().bI();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fv()) {
         this.b.fB();
         this.b.b(false);
         this.b.fx().b(kr.J, cya.a);
      }
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      buk $$0 = this.b.m();
      if ($$0 != null) {
         boolean $$1 = this.b.Q().a($$0);
         boolean $$2 = this.f > 0;
         if ($$1 != $$2) {
            this.f = 0;
         }

         if ($$1) {
            this.f++;
         } else {
            this.f--;
         }

         double $$3 = this.b.g((bto)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.P().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.dV());
            }
         } else {
            this.h = 0;
            this.b.P().o();
         }

         this.b.K().a($$0, 30.0F, 30.0F);
         if (this.c == cci.a.a) {
            if (!$$4) {
               this.b.c(coq.a(this.b, cvt.vX));
               this.c = cci.a.b;
               this.b.b(true);
            }
         } else if (this.c == cci.a.b) {
            if (!this.b.fv()) {
               this.c = cci.a.a;
            }

            int $$5 = this.b.fz();
            cvp $$6 = this.b.fx();
            if ($$5 >= cud.b($$6, this.b)) {
               this.b.fA();
               this.c = cci.a.c;
               this.g = 20 + this.b.dV().a(20);
               this.b.b(false);
            }
         } else if (this.c == cci.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cci.a.d;
            }
         } else if (this.c == cci.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cci.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cci.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
