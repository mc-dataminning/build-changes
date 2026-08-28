import java.util.EnumSet;

public class ccu<T extends clm & clq & ckz> extends cbt {
   public static final brj a = bak.a(1, 2);
   private final T b;
   private ccu.a c = ccu.a.a;
   private final double d;
   private final float e;
   private int f;
   private int g;
   private int h;

   public ccu(T $$0, double $$1, float $$2) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2 * $$2;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
   }

   @Override
   public boolean b() {
      return this.i() && this.h();
   }

   private boolean h() {
      return this.b.b(cwb.vX);
   }

   @Override
   public boolean c() {
      return this.i() && (this.b() || !this.b.P().m()) && this.h();
   }

   private boolean i() {
      return this.b.m() != null && this.b.m().bM();
   }

   @Override
   public void e() {
      super.e();
      this.b.w(false);
      this.b.h(null);
      this.f = 0;
      if (this.b.fB()) {
         this.b.fH();
         this.b.b(false);
         this.b.fD().b(kt.N, cyc.a);
      }
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      buv $$0 = this.b.m();
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

         double $$3 = this.b.g((btz)$$0);
         boolean $$4 = ($$3 > (double)this.e || this.f < 5) && this.g == 0;
         if ($$4) {
            this.h--;
            if (this.h <= 0) {
               this.b.P().a($$0, this.k() ? this.d : this.d * 0.5);
               this.h = a.a(this.b.ea());
            }
         } else {
            this.h = 0;
            this.b.P().o();
         }

         this.b.K().a($$0, 30.0F, 30.0F);
         if (this.c == ccu.a.a) {
            if (!$$4) {
               this.b.c(cpd.a(this.b, cwb.vX));
               this.c = ccu.a.b;
               this.b.b(true);
            }
         } else if (this.c == ccu.a.b) {
            if (!this.b.fB()) {
               this.c = ccu.a.a;
            }

            int $$5 = this.b.fF();
            cvx $$6 = this.b.fD();
            if ($$5 >= cuo.b($$6, this.b)) {
               this.b.fG();
               this.c = ccu.a.c;
               this.g = 20 + this.b.ea().a(20);
               this.b.b(false);
            }
         } else if (this.c == ccu.a.c) {
            this.g--;
            if (this.g == 0) {
               this.c = ccu.a.d;
            }
         } else if (this.c == ccu.a.d && $$1) {
            this.b.a($$0, 1.0F);
            this.c = ccu.a.a;
         }
      }
   }

   private boolean k() {
      return this.c == ccu.a.a;
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
