import java.util.function.Predicate;

public class bpe extends bpl {
   private static final int g = 240;
   private final Predicate<bgn> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bpe(bja $$0, Predicate<bgn> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bpe(bja $$0, int $$1, Predicate<bgn> $$2) {
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
         return !this.d.dK().X().b(cpi.c) ? false : this.a(this.d.dK().ai()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.di(), 2.0) && this.a(this.d.dK().ai());
   }

   @Override
   public void d() {
      super.d();
      this.d.dK().a(this.d.ah(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.ee().a(20) == 0) {
         this.d.dK().c(1019, this.e, 0);
         if (!this.d.aF) {
            this.d.a(this.d.fm());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dK().a(this.d.ah(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dK().ai())) {
         this.d.dK().a(this.e, false);
         this.d.dK().c(1021, this.e, 0);
         this.d.dK().c(2001, this.e, csm.i(this.d.dK().a_(this.e)));
      }
   }

   private boolean a(bgn $$0) {
      return this.h.test($$0);
   }
}
