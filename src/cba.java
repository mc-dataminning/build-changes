import java.util.EnumSet;
import javax.annotation.Nullable;

public class cba extends cbh {
   protected final bus a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final deg f;

   public cba(bus $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dS();
      this.a(EnumSet.of(cbh.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.m() != null) {
         return false;
      } else if (!this.f.S()) {
         return false;
      } else if (!this.a.bV()) {
         return false;
      } else if (!this.f.h(this.a.ds())) {
         return false;
      } else {
         return !this.a.a(btw.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      eys $$0 = this.i();
      if ($$0 == null) {
         return false;
      } else {
         this.b = $$0.d;
         this.c = $$0.e;
         this.d = $$0.f;
         return true;
      }
   }

   @Override
   public boolean c() {
      return !this.a.P().m();
   }

   @Override
   public void d() {
      this.a.P().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected eys i() {
      azl $$0 = this.a.dV();
      je $$1 = this.a.ds();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         je $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return eys.c($$3);
         }
      }

      return null;
   }
}
