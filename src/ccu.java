import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccu extends ccw {
   private final bwv a;
   @Nullable
   private bvy b;
   private final double c;
   private final cfk d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public ccu(bwv $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.O();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      if (!($$0.O() instanceof cfj) && !($$0.O() instanceof cfi)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bvy $$0 = this.a.ae_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gv()) {
         return false;
      } else if (this.a.g((bva)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gv() ? false : !(this.a.g((bva)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(eun.j);
      this.a.a(eun.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.m();
      this.a.a(eun.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gu();
      if (!$$0) {
         this.a.J().a(this.b, 10.0F, (float)this.a.ac());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gt();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
