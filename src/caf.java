import java.util.EnumSet;
import javax.annotation.Nullable;

public class caf extends cam {
   protected final btw a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dcw f;

   public caf(btw $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dP();
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.R()) {
         return false;
      } else if (!this.a.bR()) {
         return false;
      } else if (!this.f.h(this.a.dp())) {
         return false;
      } else {
         return !this.a.a(bsy.f).e() ? false : this.h();
      }
   }

   protected boolean h() {
      exa $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.c;
         this.c = $$0.d;
         this.d = $$0.e;
         return true;
      }
   }

   @Override
   public boolean c() {
      return !this.a.N().l();
   }

   @Override
   public void d() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected exa i() {
      ayw $$0 = this.a.dS();
      jd $$1 = this.a.dp();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jd $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return exa.c($$3);
         }
      }

      return null;
   }
}
