import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdc extends cde {
   private final bxd a;
   @Nullable
   private bwg b;
   private final double c;
   private final cfs d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cdc(bxd $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.L();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cde.a.a, cde.a.b));
      if (!($$0.L() instanceof cfr) && !($$0.L() instanceof cfq)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bwg $$0 = this.a.ah_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gr()) {
         return false;
      } else if (this.a.g((bvk)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gr() ? false : !(this.a.g((bvk)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(euo.j);
      this.a.a(euo.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(euo.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gq();
      if (!$$0) {
         this.a.H().a(this.b, 10.0F, (float)this.a.Z());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gp();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
