import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccx extends cde {
   protected final bwo a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dhi f;

   public ccx(bwo $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dW();
      this.a(EnumSet.of(cde.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.O_() != null) {
         return false;
      } else if (!this.f.U()) {
         return false;
      } else if (!this.a.bY()) {
         return false;
      } else if (!this.f.h(this.a.dw())) {
         return false;
      } else {
         return !this.a.a(bvs.f).f() ? false : this.h();
      }
   }

   protected boolean h() {
      fby $$0 = this.i();
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
      return !this.a.L().m();
   }

   @Override
   public void d() {
      this.a.L().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected fby i() {
      bam $$0 = this.a.dZ();
      jh $$1 = this.a.dw();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         jh $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return fby.c($$3);
         }
      }

      return null;
   }
}
