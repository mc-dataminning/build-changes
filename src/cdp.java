import java.util.function.Predicate;

public class cdp extends cdw {
   private static final int g = 240;
   private final Predicate<bud> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cdp(bxl $$0, Predicate<bud> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cdp(bxl $$0, int $$1, Predicate<bud> $$2) {
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
         return !a(this.d).O().c(dji.d) ? false : this.a(this.d.dU().an()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.ds(), 2.0) && this.a(this.d.dU().an());
   }

   @Override
   public void e() {
      super.e();
      this.d.dU().a(this.d.ao(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.dX().a(20) == 0) {
         this.d.dU().c(1019, this.e, 0);
         if (!this.d.aI) {
            this.d.a(this.d.fz());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dU().a(this.d.ao(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dU().an())) {
         this.d.dU().a(this.e, false);
         this.d.dU().c(1021, this.e, 0);
         this.d.dU().c(2001, this.e, dmr.j(this.d.dU().a_(this.e)));
      }
   }

   private boolean a(bud $$0) {
      return this.h.test($$0);
   }
}
