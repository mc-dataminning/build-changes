import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbz extends ccg {
   protected final bvq a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dgj f;

   public cbz(bvq $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dV();
      this.a(EnumSet.of(ccg.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.O_() != null) {
         return false;
      } else if (!this.f.V()) {
         return false;
      } else if (!this.a.bY()) {
         return false;
      } else if (!this.f.h(this.a.dv())) {
         return false;
      } else {
         return !this.a.a(buu.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      fbb $$0 = this.i();
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
      return !this.a.P().k();
   }

   @Override
   public void d() {
      this.a.P().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected fbb i() {
      azh $$0 = this.a.dY();
      ji $$1 = this.a.dv();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ji $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return fbb.c($$3);
         }
      }

      return null;
   }
}
