import java.util.EnumSet;
import javax.annotation.Nullable;

public class byq extends byx {
   protected final bsi a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dad f;

   public byq(bsi $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dN();
      this.a(EnumSet.of(byx.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.Q()) {
         return false;
      } else if (!this.a.bO()) {
         return false;
      } else if (!this.f.h(this.a.dn())) {
         return false;
      } else {
         return !this.a.d(bro.f).d() ? false : this.h();
      }
   }

   protected boolean h() {
      etp $$0 = this.i();
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
   public boolean b() {
      return !this.a.K().l();
   }

   @Override
   public void c() {
      this.a.K().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected etp i() {
      ayg $$0 = this.a.ej();
      in $$1 = this.a.dn();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         in $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.h($$3) < 0.0F) {
            return etp.c($$3);
         }
      }

      return null;
   }
}
