import java.util.function.Predicate;

public class bpr extends bpy {
   private static final int g = 240;
   private final Predicate<bhb> h;
   protected int a;
   protected int b = -1;
   protected int c = -1;

   public bpr(bjo $$0, Predicate<bhb> $$1) {
      super($$0);
      this.h = $$1;
   }

   public bpr(bjo $$0, int $$1, Predicate<bhb> $$2) {
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
         return !this.d.dL().X().b(cpx.c) ? false : this.a(this.d.dL().ai()) && !this.h();
      }
   }

   @Override
   public void c() {
      super.c();
      this.a = 0;
   }

   @Override
   public boolean b() {
      return this.a <= this.f() && !this.h() && this.e.a(this.d.dj(), 2.0) && this.a(this.d.dL().ai());
   }

   @Override
   public void d() {
      super.d();
      this.d.dL().a(this.d.ah(), this.e, -1);
   }

   @Override
   public void e() {
      super.e();
      if (this.d.ef().a(20) == 0) {
         this.d.dL().c(1019, this.e, 0);
         if (!this.d.aF) {
            this.d.a(this.d.fo());
         }
      }

      this.a++;
      int $$0 = (int)((float)this.a / (float)this.f() * 10.0F);
      if ($$0 != this.b) {
         this.d.dL().a(this.d.ah(), this.e, $$0);
         this.b = $$0;
      }

      if (this.a == this.f() && this.a(this.d.dL().ai())) {
         this.d.dL().a(this.e, false);
         this.d.dL().c(1021, this.e, 0);
         this.d.dL().c(2001, this.e, ctc.i(this.d.dL().a_(this.e)));
      }
   }

   private boolean a(bhb $$0) {
      return this.h.test($$0);
   }
}
