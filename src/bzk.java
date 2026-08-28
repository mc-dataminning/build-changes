import java.util.function.Predicate;

public class bzk extends bzr {
   private static final int g = 240;
   private final Predicate<bqe> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bzk(bte $$0, Predicate<bqe> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bzk(bte $$0, int $$1, Predicate<bqe> $$2) {
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
         return !this.d.dR().ab().b(dcc.c) ? false : this.a(this.d.dR().al()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dp(), 2.0) && this.a(this.d.dR().al());
   }

   @Override
   public void d() {
      super.d();
      this.d.dR().a(this.d.an(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.dU().a(20) == 0) {
         this.d.dR().c(1019, this.e, 0);
         if (!this.d.aK) {
            this.d.a(this.d.fu());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dR().a(this.d.an(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dR().al())) {
         this.d.dR().a(this.e, false);
         this.d.dR().c(1021, this.e, 0);
         this.d.dR().c(2001, this.e, dfi.i(this.d.dR().a_(this.e)));
      }
   }

   private boolean a(bqe $$0) {
      return this.h.test($$0);
   }
}
