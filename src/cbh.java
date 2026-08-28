import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbh extends cak {
   public static final int a = 120;
   protected final btu b;
   protected double c;
   protected double d;
   protected double e;
   protected final double f;
   protected int g;
   protected boolean h;
   private final boolean i;

   public cbh(btu $$0, double $$1) {
      this($$0, $$1, 120);
   }

   public cbh(btu $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, true);
   }

   public cbh(btu $$0, double $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cS()) {
         return false;
      } else {
         if (!this.h) {
            if (this.i && this.b.en() >= 100) {
               return false;
            }

            if (this.b.dT().a(b(this.g)) != 0) {
               return false;
            }
         }

         eww $$0 = this.h();
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.c;
            this.d = $$0.d;
            this.e = $$0.e;
            this.h = false;
            return true;
         }
      }
   }

   @Nullable
   protected eww h() {
      return ceh.a(this.b, 10, 7);
   }

   @Override
   public boolean c() {
      return !this.b.J().l() && !this.b.cS();
   }

   @Override
   public void d() {
      this.b.J().a(this.c, this.d, this.e, this.f);
   }

   @Override
   public void e() {
      this.b.J().n();
      super.e();
   }

   public void i() {
      this.h = true;
   }

   public void c(int $$0) {
      this.g = $$0;
   }
}
