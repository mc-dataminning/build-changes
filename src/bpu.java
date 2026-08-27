import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpu extends bqb {
   protected final bjp a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final cpv f;

   public bpu(bjp $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dL();
      this.a(EnumSet.of(bqb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.q() != null) {
         return false;
      } else if (!this.f.N()) {
         return false;
      } else if (!this.a.bM()) {
         return false;
      } else if (!this.f.g(this.a.dl())) {
         return false;
      } else {
         return !this.a.c(biv.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      ehn $$0 = this.i();
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
      return !this.a.L().l();
   }

   @Override
   public void c() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected ehn i() {
      asc $$0 = this.a.ef();
      gw $$1 = this.a.dl();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         gw $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.g($$3) && this.a.h($$3) < 0.0F) {
            return ehn.c($$3);
         }
      }

      return null;
   }
}
