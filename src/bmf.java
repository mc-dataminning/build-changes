import java.util.function.Predicate;

public class bmf extends bmm {
   private static final int g = 240;
   private final Predicate<bdu> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bmf(bgb $$0, Predicate<bdu> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bmf(bgb $$0, int $$1, Predicate<bdu> $$2) {
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
         return !this.d.dI().X().b(cmi.c) ? false : this.a(this.d.dI().ai()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dg(), 2.0) && this.a(this.d.dI().ai());
   }

   @Override
   public void d() {
      super.d();
      this.d.dI().a(this.d.af(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.ec().a(20) == 0) {
         this.d.dI().c(1019, this.e, 0);
         if (!this.d.aG) {
            this.d.a(this.d.fj());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dI().a(this.d.af(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dI().ai())) {
         this.d.dI().a(this.e, false);
         this.d.dI().c(1021, this.e, 0);
         this.d.dI().c(2001, this.e, cpn.i(this.d.dI().a_(this.e)));
      }
   }

   private boolean a(bdu $$0) {
      return this.h.test($$0);
   }
}
