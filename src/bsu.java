import java.util.function.Predicate;

public class bsu extends btb {
   private static final int g = 240;
   private final Predicate<bjz> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bsu(bmq $$0, Predicate<bjz> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bsu(bmq $$0, int $$1, Predicate<bjz> $$2) {
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
         return !this.d.dL().Z().b(ctt.c) ? false : this.a(this.d.dL().ak()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dj(), 2.0) && this.a(this.d.dL().ak());
   }

   @Override
   public void d() {
      super.d();
      this.d.dL().a(this.d.aj(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.eg().a(20) == 0) {
         this.d.dL().c(1019, this.e, 0);
         if (!this.d.aF) {
            this.d.a(this.d.fo());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dL().a(this.d.aj(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dL().ak())) {
         this.d.dL().a(this.e, false);
         this.d.dL().c(1021, this.e, 0);
         this.d.dL().c(2001, this.e, cwy.i(this.d.dL().a_(this.e)));
      }
   }

   private boolean a(bjz $$0) {
      return this.h.test($$0);
   }
}
