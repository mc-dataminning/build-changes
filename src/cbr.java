import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbr extends cbt {
   private final bvs a;
   @Nullable
   private buv b;
   private final double c;
   private final ceh d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cbr(bvs $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.P();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
      if (!($$0.P() instanceof ceg) && !($$0.P() instanceof cef)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      buv $$0 = this.a.T_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gy()) {
         return false;
      } else if (this.a.g((btz)$$0) < (double)(this.g * this.g)) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (this.d.m()) {
         return false;
      } else {
         return this.a.gy() ? false : !(this.a.g((btz)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(erv.j);
      this.a.a(erv.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(erv.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gx();
      if (!$$0) {
         this.a.K().a(this.b, 10.0F, (float)this.a.ad());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gw();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
