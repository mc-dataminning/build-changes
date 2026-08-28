import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbf extends cbh {
   private final bvg a;
   @Nullable
   private buk b;
   private final double c;
   private final cdv d;
   private int e;
   private final float f;
   private final float g;
   private float h;

   public cbf(bvg $$0, double $$1, float $$2, float $$3) {
      this.a = $$0;
      this.c = $$1;
      this.d = $$0.P();
      this.g = $$2;
      this.f = $$3;
      this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      if (!($$0.P() instanceof cdu) && !($$0.P() instanceof cdt)) {
         throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
      }
   }

   @Override
   public boolean b() {
      buk $$0 = this.a.R_();
      if ($$0 == null) {
         return false;
      } else if (this.a.gs()) {
         return false;
      } else if (this.a.g((bto)$$0) < (double)(this.g * this.g)) {
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
         return this.a.gs() ? false : !(this.a.g((bto)this.b) <= (double)(this.f * this.f));
      }
   }

   @Override
   public void d() {
      this.e = 0;
      this.h = this.a.a(erg.j);
      this.a.a(erg.j, 0.0F);
   }

   @Override
   public void e() {
      this.b = null;
      this.d.o();
      this.a.a(erg.j, this.h);
   }

   @Override
   public void a() {
      boolean $$0 = this.a.gr();
      if (!$$0) {
         this.a.K().a(this.b, 10.0F, (float)this.a.ae());
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
