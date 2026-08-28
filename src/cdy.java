import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdy extends cef {
   protected final bxr a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final djm f;

   public cdy(bxr $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dU();
      this.a(EnumSet.of(cef.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.f() != null) {
         return false;
      } else if (!this.f.V()) {
         return false;
      } else if (!this.a.bW()) {
         return false;
      } else if (!this.f.h(this.a.du())) {
         return false;
      } else {
         return !this.a.a(bws.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      ffc $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.d;
         this.c = $$0.e;
         this.d = $$0.f;
         return true;
      }
   }

   @Override
   public boolean c() {
      return !this.a.O().k();
   }

   @Override
   public void d() {
      this.a.O().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected ffc i() {
      azv $$0 = this.a.dX();
      iv $$1 = this.a.du();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         iv $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return ffc.c($$3);
         }
      }

      return null;
   }
}
