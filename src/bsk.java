import java.util.EnumSet;
import javax.annotation.Nullable;

public class bsk extends bsr {
   protected final bme a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final csy f;

   public bsk(bme $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dM();
      this.a(EnumSet.of(bsr.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.q() != null) {
         return false;
      } else if (!this.f.O()) {
         return false;
      } else if (!this.a.bN()) {
         return false;
      } else if (!this.f.g(this.a.dm())) {
         return false;
      } else {
         return !this.a.c(blk.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      elb $$0 = this.i();
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
   protected elb i() {
      auf $$0 = this.a.eg();
      hv $$1 = this.a.dm();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         hv $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.g($$3) && this.a.h($$3) < 0.0F) {
            return elb.c($$3);
         }
      }

      return null;
   }
}
