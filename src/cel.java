import java.util.EnumSet;
import javax.annotation.Nullable;

public class cel extends ces {
   protected final bye a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final djz f;

   public cel(bye $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dV();
      this.a(EnumSet.of(ces.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.f() != null) {
         return false;
      } else if (!this.f.V()) {
         return false;
      } else if (!this.a.bX()) {
         return false;
      } else if (!this.f.h(this.a.dv())) {
         return false;
      } else {
         return !this.a.a(bxf.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      ffs $$0 = this.i();
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
   protected ffs i() {
      azz $$0 = this.a.dY();
      iw $$1 = this.a.dv();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         iw $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return ffs.c($$3);
         }
      }

      return null;
   }
}
