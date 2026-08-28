import java.util.EnumSet;

public class cdd<T extends clv & clz & cli> extends ccc {
   public static final brs a = bap.a(1, 2);
   private final T b;
   private cdd.a c = cdd.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public cdd(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cwj.wn);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.P().m()) && this.h();
   }

   private boolean i() {
      return this.b.m() != null && this.b.m().bN();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fC()) {
         this.b.fI();
         this.b.b(false);
         this.b.fE().b(ku.O, cyk.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      bve $$0 = this.b.m();
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

         double $$3 = this.b.g((bui)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.P().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.eb());
            }
         } else {
            this.h = 0;
            this.b.P().o();
         }

         this.b.K().a($$0, 30.0F, 30.0F);
         if (this.c == cdd.a.a) {
            if (!$$4) {
               this.b.c(cpm.a(this.b, cwj.wn));
               this.c = cdd.a.b;
               this.b.b(true);
            }
         } else if (this.c == cdd.a.b) {
            if (!this.b.fC()) {
               this.c = cdd.a.a;
            }

            int $$5 = this.b.fG();
            cwf $$6 = this.b.fE();
            if ($$5 >= cuw.b($$6, this.b)) {
               this.b.fH();
               this.c = cdd.a.c;
               this.g = 20 + this.b.eb().a(20);
               this.b.b(false);
            }
         } else if (this.c == cdd.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = cdd.a.d;
            }
         } else if (this.c == cdd.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = cdd.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == cdd.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
