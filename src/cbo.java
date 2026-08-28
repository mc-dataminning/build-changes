import java.util.function.Predicate;

public class cbo extends cbv {
   private static final int g = 240;
   private final Predicate<bsg> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cbo(bvi $$0, Predicate<bsg> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cbo(bvi $$0, int $$1, Predicate<bsg> $$2) {
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
         return !a(this.d).O().b(dge.c) ? false : this.a(this.d.dW().am()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.du(), 2.0) && this.a(this.d.dW().am());
   }

   @Override
   public void e() {
      super.e();
      this.d.dW().a(this.d.ar(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.dZ().a(20) == 0) {
         this.d.dW().c(1019, this.e, 0);
         if (!this.d.aI) {
            this.d.a(this.d.fA());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dW().a(this.d.ar(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dW().am())) {
         this.d.dW().a(this.e, false);
         this.d.dW().c(1021, this.e, 0);
         this.d.dW().c(2001, this.e, djm.j(this.d.dW().a_(this.e)));
      }
   }

   private boolean a(bsg $$0) {
      return this.h.test($$0);
   }
}
