import java.util.EnumSet;
import javax.annotation.Nullable;

public class cca extends ccc {
   private final bwb a;
   @Nullable
   private bve b;
   private final double c;
   private final ceq d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cca(bwb $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.P();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      if (!($$0.P() instanceof cep) && !($$0.P() instanceof ceo)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bve $$0 = this.a.T_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gy()) {
         return false;
      } else if (this.a.g((bui)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gy() ? false : !(this.a.g((bui)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(esf.j);
      this.a.a(esf.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(esf.j, this.h);
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
