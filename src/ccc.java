import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccc extends cce {
   private final bwd a;
   @Nullable
   private bvg b;
   private final double c;
   private final ces d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public ccc(bwd $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.L();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cce.a.a, cce.a.b));
      if (!($$0.L() instanceof cer) && !($$0.L() instanceof ceq)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      bvg $$0 = this.a.ag_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gs()) {
         return false;
      } else if (this.a.g((buk)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gs() ? false : !(this.a.g((buk)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(etq.j);
      this.a.a(etq.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.m();
      this.a.a(etq.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gr();
      if (!$$0) {
         this.a.H().a(this.b, 10.0F, (float)this.a.aa());
      }

      if (--this.e <= 0) {
         this.e = this.a(10);
         if ($$0) {
            this.a.gq();
         } else {
            this.d.a(this.b, this.c);
         }
      }
   }
}
