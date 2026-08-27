import java.util.EnumSet;
import javax.annotation.Nullable;

public class byu extends bzm {
   private final cfh a;
   @Nullable
   private clw b;
   private final dax c;
   private final float d;
   private int e;
   private final cdf f;

   public byu(cfh $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dP();
      this.d = $$1;
      this.f = cdf.b().a((double)$$1);
      this.a(EnumSet.of(bzm.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bD()) {
         return false;
      } else {
         return this.a.g((bru)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.el().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.du(), this.b.dy(), this.b.dA(), 10.0F, (float)this.a.Z());
      this.e--;
   }

   private boolean a(clw $$0) {
      for (bpt $$1 : bpt.values()) {
         cto $$2 = $$0.b($$1);
         if (this.a.s() && $$2.a(ctr.rz)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
