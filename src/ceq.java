import java.util.EnumSet;
import javax.annotation.Nullable;

public class ceq extends ces {
   private final bys a;
   @Nullable
   private bxw b;
   private final double c;
   private final chg d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public ceq(bys $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.O();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(ces.a.a, ces.a.b));
      if (!($$0.O() instanceof chf) && !($$0.O() instanceof che)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bxw $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else if (this.a.gx()) {
         return false;
      } else if (this.a.g((bwv)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gx() ? false : !(this.a.g((bwv)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(eyh.j);
      this.a.a(eyh.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.m();
      this.a.a(eyh.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gw();
      if (!$$0) {
         this.a.J().a(this.b, 10.0F, (float)this.a.ad());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gv();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
