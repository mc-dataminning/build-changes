import java.util.EnumSet;
import javax.annotation.Nullable;

public class ced extends cef {
   private final byf a;
   @Nullable
   private bxj b;
   private final double c;
   private final cgt d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public ced(byf $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.O();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cef.a.a, cef.a.b));
      if (!($$0.O() instanceof cgs) && !($$0.O() instanceof cgr)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bxj $$0 = this.a.e();
      if ($$0 == null) {
         return false;
      } else if (this.a.gw()) {
         return false;
      } else if (this.a.g((bwi)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gw() ? false : !(this.a.g((bwi)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(exm.j);
      this.a.a(exm.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.m();
      this.a.a(exm.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gv();
      if (!$$0) {
         this.a.J().a(this.b, 10.0F, (float)this.a.ad());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gu();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
