import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bpi extends bpw {
   private static final btn d = btn.b().a(8.0).d();
   protected final bum a;
   private final Class<? extends bum> e;
   protected final cpq b;
   @Nullable
   protected bum c;
   private int f;
   private final double g;

   public bpi(bum $$0, double $$1) {
      this($$0, $$1, (Class<? extends bum>)$$0.getClass());
   }

   public bpi(bum $$0, double $$1, Class<? extends bum> $$2) {
      this.a = $$0;
      this.b = $$0.dK();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bpw.a.a, bpw.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.ge()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bv() && this.c.ge() && this.f < 60 && !this.c.fX();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.D().a(this.c, 10.0F, (float)this.a.W());
      this.a.H().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bum h() {
      List<? extends bum> $$0 = this.b.a(this.e, d, this.a, this.a.cG().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bum $$2 = null;

      for (bum $$3 : $$0) {
         if (this.a.a($$3) && !$$3.fX() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((akn)this.b, this.c);
   }
}
