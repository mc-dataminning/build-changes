import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdy extends cea {
   private final bya a;
   @Nullable
   private bxe b;
   private final double c;
   private final cgo d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cdy(bya $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.O();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cea.a.a, cea.a.b));
      if (!($$0.O() instanceof cgn) && !($$0.O() instanceof cgm)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bxe $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else if (this.a.gu()) {
         return false;
      } else if (this.a.g((bwf)$$0) < (double)(this.g * this.g)) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (this.d.k()) {
         return false;
      } else {
         return this.a.gu() ? false : !(this.a.g((bwf)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(exf.j);
      this.a.a(exf.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.m();
      this.a.a(exf.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gt();
      if (!$$0) {
         this.a.J().a(this.b, 10.0F, (float)this.a.ac());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gs();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
