import java.util.EnumSet;
import javax.annotation.Nullable;

public class bru extends bsb {
   protected final blp a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final csa f;

   public bru(blp $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dN();
      this.a(EnumSet.of(bsb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.q() != null) {
         return false;
      } else if (!this.f.O()) {
         return false;
      } else if (!this.a.bN()) {
         return false;
      } else if (!this.f.g(this.a.dn())) {
         return false;
      } else {
         return !this.a.c(bkv.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      eju $$0 = this.i();
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
      return !this.a.N().l();
   }

   @Override
   public void c() {
      this.a.N().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected eju i() {
      ats $$0 = this.a.eh();
      ht $$1 = this.a.dn();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ht $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.g($$3) && this.a.h($$3) < 0.0F) {
            return eju.c($$3);
         }
      }

      return null;
   }
}
