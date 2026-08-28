import java.util.EnumSet;
import javax.annotation.Nullable;

public class cad extends cak {
   protected final btu a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dcu f;

   public cad(btu $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dQ();
      this.a(EnumSet.of(cak.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.R()) {
         return false;
      } else if (!this.a.bR()) {
         return false;
      } else if (!this.f.h(this.a.dq())) {
         return false;
      } else {
         return !this.a.a(bsx.f).e() ? false : this.h();
      }
   }

   protected boolean h() {
      eww $$0 = this.i();
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
      return !this.a.J().l();
   }

   @Override
   public void d() {
      this.a.J().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected eww i() {
      ayv $$0 = this.a.dT();
      jd $$1 = this.a.dq();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jd $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return eww.c($$3);
         }
      }

      return null;
   }
}
