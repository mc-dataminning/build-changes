import java.util.function.Predicate;

public class bve extends bvl {
   private static final int g = 240;
   private final Predicate<bmi> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bve(boz $$0, Predicate<bmi> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bve(boz $$0, int $$1, Predicate<bmi> $$2) {
      this($$0, $$2);
      this.c = $$1;
   }

   protected int f() {
      return Math.max(240, this.c);
   }

   @Override
   public boolean a() {
      if (!super.a()) {
         return false;
      } else {
         return !this.d.dJ().Z().b(cwa.c) ? false : this.a(this.d.dJ().aj()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dh(), 2.0) && this.a(this.d.dJ().aj());
   }

   @Override
   public void d() {
      super.d();
      this.d.dJ().a(this.d.aj(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.ef().a(20) == 0) {
         this.d.dJ().c(1019, this.e, 0);
         if (!this.d.aG) {
            this.d.a(this.d.fq());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dJ().a(this.d.aj(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dJ().aj())) {
         this.d.dJ().a(this.e, false);
         this.d.dJ().c(1021, this.e, 0);
         this.d.dJ().c(2001, this.e, czf.i(this.d.dJ().a_(this.e)));
      }
   }

   private boolean a(bmi $$0) {
      return this.h.test($$0);
   }
}
