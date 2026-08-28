import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzt extends caa {
   protected final btl a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dcg f;

   public bzt(btl $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dR();
      this.a(EnumSet.of(caa.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.R()) {
         return false;
      } else if (!this.a.bS()) {
         return false;
      } else if (!this.f.h(this.a.dr())) {
         return false;
      } else {
         return !this.a.a(bso.f).e() ? false : this.h();
      }
   }

   protected boolean h() {
      ewh $$0 = this.i();
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
      return !this.a.J().l();
   }

   @Override
   public void c() {
      this.a.J().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected ewh i() {
      ayo $$0 = this.a.dU();
      ja $$1 = this.a.dr();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ja $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return ewh.c($$3);
         }
      }

      return null;
   }
}
