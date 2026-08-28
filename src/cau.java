import java.util.function.Predicate;

public class cau extends cbb {
   private static final int g = 240;
   private final Predicate<brp> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public cau(bup $$0, Predicate<brp> $$1) {
      super($$0);
      this.h = $$1;
   }

   public cau(bup $$0, int $$1, Predicate<brp> $$2) {
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
         return !this.d.dS().ac().b(def.c) ? false : this.a(this.d.dS().am()) && !this.h();
      }
   }

   @Override
   public void d() {
      super.d();
      this.a = 0;
   }

   @Override
   public boolean c() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dq(), 2.0) && this.a(this.d.dS().am());
   }

   @Override
   public void e() {
      super.e();
      this.d.dS().a(this.d.ap(), this.e, -1);
   }

   @Override
   public void a() {
      super.a();
      if (this.d.dV().a(20) == 0) {
         this.d.dS().c(1019, this.e, 0);
         if (!this.d.aE) {
            this.d.a(this.d.fw());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dS().a(this.d.ap(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dS().am())) {
         this.d.dS().a(this.e, false);
         this.d.dS().c(1021, this.e, 0);
         this.d.dS().c(2001, this.e, dhm.j(this.d.dS().a_(this.e)));
      }
   }

   private boolean a(brp $$0) {
      return this.h.test($$0);
   }
}
