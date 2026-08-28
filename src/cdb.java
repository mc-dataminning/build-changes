import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdb extends cdd {
   private final bxc a;
   @Nullable
   private bwf b;
   private final double c;
   private final cfr d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cdb(bxc $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.L();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cdd.a.a, cdd.a.b));
      if (!($$0.L() instanceof cfq) && !($$0.L() instanceof cfp)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bwf $$0 = this.a.ah_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gr()) {
         return false;
      } else if (this.a.g((bvj)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gr() ? false : !(this.a.g((bvj)this.b) <= (double)(this.f * this.f));
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
      this.d.o();
      this.a.a(eun.j, this.h);
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
