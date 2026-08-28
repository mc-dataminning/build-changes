import java.util.function.Predicate;

public class bzv extends cac {
   private static final int g = 240;
   private final Predicate<bqp> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bzv(btp $$0, Predicate<bqp> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bzv(btp $$0, int $$1, Predicate<bqp> $$2) {
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
         return !this.d.dP().ab().b(dbs.c) ? false : this.a(this.d.dP().al()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dn(), 2.0) && this.a(this.d.dP().al());
   }

   @Override
   public void d() {
      super.d();
      this.d.dP().a(this.d.al(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.el().a(20) == 0) {
         this.d.dP().c(1019, this.e, 0);
         if (!this.d.aJ) {
            this.d.a(this.d.fw());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dP().a(this.d.al(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dP().al())) {
         this.d.dP().a(this.e, false);
         this.d.dP().c(1021, this.e, 0);
         this.d.dP().c(2001, this.e, dex.i(this.d.dP().a_(this.e)));
      }
   }

   private boolean a(bqp $$0) {
      return this.h.test($$0);
   }
}
