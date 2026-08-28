import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccd extends ccf {
   private final bwe a;
   @Nullable
   private bvh b;
   private final double c;
   private final cet d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public ccd(bwe $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.L();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      if (!($$0.L() instanceof ces) && !($$0.L() instanceof cer)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bvh $$0 = this.a.ag_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gp()) {
         return false;
      } else if (this.a.g((bul)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gp() ? false : !(this.a.g((bul)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(esm.j);
      this.a.a(esm.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(esm.j, this.h);
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
