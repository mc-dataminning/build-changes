import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwf extends bwm {
   protected final bpx a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final cxb f;

   public bwf(bpx $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dM();
      this.a(EnumSet.of(bwm.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.P()) {
         return false;
      } else if (!this.a.bN()) {
         return false;
      } else if (!this.f.h(this.a.dm())) {
         return false;
      } else {
         return !this.a.d(bpe.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      ept $$0 = this.i();
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
      return !this.a.K().l();
   }

   @Override
   public void c() {
      this.a.K().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected ept i() {
      axd $$0 = this.a.ei();
      ib $$1 = this.a.dm();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ib $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.h($$3) < 0.0F) {
            return ept.c($$3);
         }
      }

      return null;
   }
}
