import java.util.function.Predicate;

public class cea extends ceh {
   private static final int g = 240;
   private final Predicate<buo> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cea(bxw $$0, Predicate<buo> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cea(bxw $$0, int $$1, Predicate<buo> $$2) {
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
         return !a(this.d).O().c(djt.d) ? false : this.a(this.d.dV().an()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dt(), 2.0) && this.a(this.d.dV().an());
   }

   @Override
   public void e() {
      super.e();
      this.d.dV().a(this.d.ao(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.dY().a(20) == 0) {
         this.d.dV().c(1019, this.e, 0);
         if (!this.d.aI) {
            this.d.a(this.d.fA());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dV().a(this.d.ao(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dV().an())) {
         this.d.dV().a(this.e, false);
         this.d.dV().c(1021, this.e, 0);
         this.d.dV().c(2001, this.e, dnc.j(this.d.dV().a_(this.e)));
      }
   }

   private boolean a(buo $$0) {
      return this.h.test($$0);
   }
}
