import java.util.EnumSet;
import javax.annotation.Nullable;

public class bxu extends byb {
   protected final brm a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final czu f;

   public bxu(brm $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dN();
      this.a(EnumSet.of(byb.a.a));
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
         return !this.a.d(bqs.f).d() ? false : this.h();
      }
   }

   protected boolean h() {
      etf $$0 = this.i();
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
   protected etf i() {
      ayd $$0 = this.a.ej();
      im $$1 = this.a.dn();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         im $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.h($$3) < 0.0F) {
            return etf.c($$3);
         }
      }

      return null;
   }
}
