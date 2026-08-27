import java.util.function.Predicate;

public class brq extends brx {
   private static final int g = 240;
   private final Predicate<biy> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public brq(bln $$0, Predicate<biy> $$1) {
      super($$0);
      this.h = $$1;
   }

   public brq(bln $$0, int $$1, Predicate<biy> $$2) {
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
         return !this.d.dN().Y().b(csb.c) ? false : this.a(this.d.dN().aj()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dl(), 2.0) && this.a(this.d.dN().aj());
   }

   @Override
   public void d() {
      super.d();
      this.d.dN().a(this.d.aj(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.eh().a(20) == 0) {
         this.d.dN().c(1019, this.e, 0);
         if (!this.d.aF) {
            this.d.a(this.d.fp());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dN().a(this.d.aj(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dN().aj())) {
         this.d.dN().a(this.e, false);
         this.d.dN().c(1021, this.e, 0);
         this.d.dN().c(2001, this.e, cvf.i(this.d.dN().a_(this.e)));
      }
   }

   private boolean a(biy $$0) {
      return this.h.test($$0);
   }
}
