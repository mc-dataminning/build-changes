import java.util.function.Predicate;

public class cbm extends cbt {
   private static final int g = 240;
   private final Predicate<bse> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cbm(bvg $$0, Predicate<bse> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cbm(bvg $$0, int $$1, Predicate<bse> $$2) {
      this($$0, $$2);
      this.c = $$1;
   }

   protected int f() {
      return Math.max(240, this.c);
   }

   @Override
   public boolean b() {
      if (!super.b()) {
         return false;
      } else {
         return !this.d.dY().ac().b(dfb.c) ? false : this.a(this.d.dY().ak()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dw(), 2.0) && this.a(this.d.dY().ak());
   }

   @Override
   public void e() {
      super.e();
      this.d.dY().a(this.d.as(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.eb().a(20) == 0) {
         this.d.dY().c(1019, this.e, 0);
         if (!this.d.aI) {
            this.d.a(this.d.fD());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dY().a(this.d.as(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dY().ak())) {
         this.d.dY().a(this.e, false);
         this.d.dY().c(1021, this.e, 0);
         this.d.dY().c(2001, this.e, dij.j(this.d.dY().a_(this.e)));
      }
   }

   private boolean a(bse $$0) {
      return this.h.test($$0);
   }
}
