import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbr extends cby {
   protected final bvi a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dfb f;

   public cbr(bvi $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dX();
      this.a(EnumSet.of(cby.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.m() != null) {
         return false;
      } else if (!this.f.S()) {
         return false;
      } else if (!this.a.bZ()) {
         return false;
      } else if (!this.f.h(this.a.dx())) {
         return false;
      } else {
         return !this.a.a(bum.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      ezn $$0 = this.i();
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
   protected ezn i() {
      azs $$0 = this.a.ea();
      jh $$1 = this.a.dx();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jh $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return ezn.c($$3);
         }
      }

      return null;
   }
}
