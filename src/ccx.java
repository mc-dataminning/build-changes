import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccx extends ccz {
   private final bwy a;
   @Nullable
   private bwb b;
   private final double c;
   private final cfn d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public ccx(bwy $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.L();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(ccz.a.a, ccz.a.b));
      if (!($$0.L() instanceof cfm) && !($$0.L() instanceof cfl)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bwb $$0 = this.a.ah_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gp()) {
         return false;
      } else if (this.a.g((bvf)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gp() ? false : !(this.a.g((bvf)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(eug.j);
      this.a.a(eug.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(eug.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.go();
      if (!$$0) {
         this.a.H().a(this.b, 10.0F, (float)this.a.Z());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gn();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
