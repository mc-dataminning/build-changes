import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbw extends cby {
   private final bvx a;
   @Nullable
   private bva b;
   private final double c;
   private final cem d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cbw(bvx $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.P();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cby.a.a, cby.a.b));
      if (!($$0.P() instanceof cel) && !($$0.P() instanceof cek)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bva $$0 = this.a.T_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gx()) {
         return false;
      } else if (this.a.g((bue)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gx() ? false : !(this.a.g((bue)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(esb.j);
      this.a.a(esb.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(esb.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gw();
      if (!$$0) {
         this.a.K().a(this.b, 10.0F, (float)this.a.ad());
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
