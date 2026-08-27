import java.util.EnumSet;
import javax.annotation.Nullable;

public class bze extends bzl {
   protected final bsw a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dca f;

   public bze(bsw $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dU();
      this.a(EnumSet.of(bzl.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.R()) {
         return false;
      } else if (!this.a.bV()) {
         return false;
      } else if (!this.f.h(this.a.du())) {
         return false;
      } else {
         return !this.a.d(bsc.f).d() ? false : this.h();
      }
   }

   protected boolean h() {
      ewu $$0 = this.i();
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
   protected ewu i() {
      ayt $$0 = this.a.et();
      ir $$1 = this.a.du();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ir $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.d($$3) < 0.0F) {
            return ewu.c($$3);
         }
      }

      return null;
   }
}
