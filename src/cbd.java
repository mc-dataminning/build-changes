import java.util.function.Predicate;

public class cbd extends cbk {
   private static final int g = 240;
   private final Predicate<brv> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cbd(bux $$0, Predicate<brv> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cbd(bux $$0, int $$1, Predicate<brv> $$2) {
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
         return !this.d.dX().ac().b(der.c) ? false : this.a(this.d.dX().am()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dv(), 2.0) && this.a(this.d.dX().am());
   }

   @Override
   public void e() {
      super.e();
      this.d.dX().a(this.d.ar(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.ea().a(20) == 0) {
         this.d.dX().c(1019, this.e, 0);
         if (!this.d.aF) {
            this.d.a(this.d.fC());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dX().a(this.d.ar(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dX().am())) {
         this.d.dX().a(this.e, false);
         this.d.dX().c(1021, this.e, 0);
         this.d.dX().c(2001, this.e, dhy.j(this.d.dX().a_(this.e)));
      }
   }

   private boolean a(brv $$0) {
      return this.h.test($$0);
   }
}
