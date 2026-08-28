import java.util.EnumSet;
import javax.annotation.Nullable;

public class cai extends cak {
   private final buj a;
   @Nullable
   private btl b;
   private final double c;
   private final ccy d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cai(buj $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.J();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cak.a.a, cak.a.b));
      if (!($$0.J() instanceof ccx) && !($$0.J() instanceof ccw)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      btl $$0 = this.a.P_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gp()) {
         return false;
      } else if (this.a.g((bsq)$$0) < (double)(this.g * this.g)) {
         return false;
      } else {
         this.b = $$0;
         return true;
      }
   }

   @Override
   public boolean c() {
      if (this.d.l()) {
         return false;
      } else {
         return this.a.gp() ? false : !(this.a.g((bsq)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(epp.j);
      this.a.a(epp.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.n();
      this.a.a(epp.j, this.h);
   }

   @Override
   public void a() {
      this.a.F().a(this.b, 10.0F, (float)this.a.aa());
      if (--this.e <= 0) {
         this.e = this.a(10);
         if (this.a.go()) {
            this.a.gn();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
