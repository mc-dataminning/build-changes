import java.util.function.Predicate;

public class bzj extends bzq {
   private static final int g = 240;
   private final Predicate<bqd> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bzj(btd $$0, Predicate<bqd> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bzj(btd $$0, int $$1, Predicate<bqd> $$2) {
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
         return !this.d.dQ().ab().b(dcb.c) ? false : this.a(this.d.dQ().al()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.do(), 2.0) && this.a(this.d.dQ().al());
   }

   @Override
   public void d() {
      super.d();
      this.d.dQ().a(this.d.am(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.dT().a(20) == 0) {
         this.d.dQ().c(1019, this.e, 0);
         if (!this.d.aJ) {
            this.d.a(this.d.ft());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dQ().a(this.d.am(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dQ().al())) {
         this.d.dQ().a(this.e, false);
         this.d.dQ().c(1021, this.e, 0);
         this.d.dQ().c(2001, this.e, dfh.i(this.d.dQ().a_(this.e)));
      }
   }

   private boolean a(bqd $$0) {
      return this.h.test($$0);
   }
}
