import java.util.EnumSet;
import javax.annotation.Nullable;

public class cak extends cam {
   private final bul a;
   @Nullable
   private btn b;
   private final double c;
   private final cda d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cak(bul $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.N();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cam.a.a, cam.a.b));
      if (!($$0.N() instanceof ccz) && !($$0.N() instanceof ccy)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      btn $$0 = this.a.T_();
      if ($$0 == null) {
         return false;
      } else if (this.a.go()) {
         return false;
      } else if (this.a.g((bsr)$$0) < (double)(this.g * this.g)) {
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
         return this.a.go() ? false : !(this.a.g((bsr)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(ept.j);
      this.a.a(ept.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.n();
      this.a.a(ept.j, this.h);
   }

   @Override
   public void a() {
      this.a.I().a(this.b, 10.0F, (float)this.a.ac());
      if (--this.e <= 0) {
         this.e = this.a(10);
         if (this.a.gn()) {
            this.a.gm();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
