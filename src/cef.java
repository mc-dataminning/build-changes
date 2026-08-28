import java.util.EnumSet;

public class cef extends cdv {
   protected final bxh a;
   private final double b;
   private final boolean c;
   private ewj d;
   private double e;
   private double f;
   private double g;
   private int h;
   private int i;
   private final int j = 20;
   private long k;
   private static final long l = 20L;

   public cef(bxh $$0, double $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.a(EnumSet.of(cdv.a.a, cdv.a.b));
   }

   @Override
   public boolean b() {
      long $$0 = this.a.dV().ae();
      if ($$0 - this.k < 20L) {
         return false;
      } else {
         this.k = $$0;
         bwz $$1 = this.a.f();
         if ($$1 == null) {
            return false;
         } else if (!$$1.bK()) {
            return false;
         } else {
            this.d = this.a.O().a($$1, 0);
            return this.d != null ? true : this.a.h($$1);
         }
      }
   }

   @Override
   public boolean c() {
      bwz $$0 = this.a.f();
      if ($$0 == null) {
         return false;
      } else if (!$$0.bK()) {
         return false;
      } else if (!this.c) {
         return !this.a.O().k();
      } else if (!this.a.a($$0.dv())) {
         return false;
      } else {
         if ($$0 instanceof cqs $$1 && ($$1.U_() || $$1.b())) {
            return false;
         }

         return true;
      }
   }

   @Override
   public void d() {
      this.a.O().a(this.d, this.b);
      this.a.v(true);
      this.h = 0;
      this.i = 0;
   }

   @Override
   public void e() {
      bwz $$0 = this.a.f();
      if (!bwh.e.test($$0)) {
         this.a.g(null);
      }

      this.a.v(false);
      this.a.O().m();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      bwz $$0 = this.a.f();
      if ($$0 != null) {
         this.a.J().a($$0, 30.0F, 30.0F);
         this.h = Math.max(this.h - 1, 0);
         if ((this.c || this.a.P().a($$0))
            && this.h <= 0
            && (this.e == 0.0 && this.f == 0.0 && this.g == 0.0 || $$0.i(this.e, this.f, this.g) >= 1.0 || this.a.dY().i() < 0.05F)) {
            this.e = $$0.dA();
            this.f = $$0.dC();
            this.g = $$0.dG();
            this.h = 4 + this.a.dY().a(7);
            double $$1 = this.a.g((bwa)$$0);
            if ($$1 > 1024.0) {
               this.h += 10;
            } else if ($$1 > 256.0) {
               this.h += 5;
            }

            if (!this.a.O().a($$0, this.b)) {
               this.h += 15;
            }

            this.h = this.a(this.h);
         }

         this.i = Math.max(this.i - 1, 0);
         this.a($$0);
      }
   }

   protected void a(bwz $$0) {
      if (this.b($$0)) {
         this.h();
         this.a.a(btx.a);
         this.a.c(a(this.a), $$0);
      }
   }

   protected void h() {
      this.i = this.a(20);
   }

   protected boolean i() {
      return this.i <= 0;
   }

   protected boolean b(bwz $$0) {
      return this.i() && this.a.h($$0) && this.a.P().a($$0);
   }

   protected int k() {
      return this.i;
   }

   protected int l() {
      return this.a(20);
   }
}
