import java.util.EnumSet;
import javax.annotation.Nullable;

public class bpm extends bpt {
   protected final bjh a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final cpl f;

   public bpm(bjh $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dK();
      this.a(EnumSet.of(bpt.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.j() != null) {
         return false;
      } else if (!this.f.N()) {
         return false;
      } else if (!this.a.bM()) {
         return false;
      } else if (!this.f.g(this.a.dk())) {
         return false;
      } else {
         return !this.a.c(bin.f).b() ? false : this.h();
      }
   }

   protected boolean h() {
      ehd $$0 = this.i();
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
      return !this.a.H().l();
   }

   @Override
   public void c() {
      this.a.H().a(this.b, this.c, this.d, this.e);
   }

   @Nullable
   protected ehd i() {
      aru $$0 = this.a.ee();
      gu $$1 = this.a.dk();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         gu $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.g($$3) && this.a.h($$3) < 0.0F) {
            return ehd.c($$3);
         }
      }

      return null;
   }
}
