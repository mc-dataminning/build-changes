import java.util.function.Predicate;

public class bzw extends cad {
   private static final int g = 240;
   private final Predicate<bqo> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bzw(btp $$0, Predicate<bqo> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bzw(btp $$0, int $$1, Predicate<bqo> $$2) {
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
         return !this.d.dP().ab().b(dcs.c) ? false : this.a(this.d.dP().al()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dn(), 2.0) && this.a(this.d.dP().al());
   }

   @Override
   public void e() {
      super.e();
      this.d.dP().a(this.d.an(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.dS().a(20) == 0) {
         this.d.dP().c(1019, this.e, 0);
         if (!this.d.aJ) {
            this.d.a(this.d.ft());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dP().a(this.d.an(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dP().al())) {
         this.d.dP().a(this.e, false);
         this.d.dP().c(1021, this.e, 0);
         this.d.dP().c(2001, this.e, dfy.i(this.d.dP().a_(this.e)));
      }
   }

   private boolean a(bqo $$0) {
      return this.h.test($$0);
   }
}
