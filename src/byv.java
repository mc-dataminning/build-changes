import java.util.function.Predicate;

public class byv extends bzc {
   private static final int g = 240;
   private final Predicate<bpx> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public byv(bsq $$0, Predicate<bpx> $$1) {
      super($$0);
      this.h = $$1;
   }

   public byv(bsq $$0, int $$1, Predicate<bpx> $$2) {
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
         return !this.d.dU().ab().b(dbw.c) ? false : this.a(this.d.dU().al()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.ds(), 2.0) && this.a(this.d.dU().al());
   }

   @Override
   public void d() {
      super.d();
      this.d.dU().a(this.d.al(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.et().a(20) == 0) {
         this.d.dU().c(1019, this.e, 0);
         if (!this.d.aT) {
            this.d.a(this.d.fF());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dU().a(this.d.al(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dU().al())) {
         this.d.dU().a(this.e, false);
         this.d.dU().c(1021, this.e, 0);
         this.d.dU().c(2001, this.e, dfc.i(this.d.dU().a_(this.e)));
      }
   }

   private boolean a(bpx $$0) {
      return this.h.test($$0);
   }
}
