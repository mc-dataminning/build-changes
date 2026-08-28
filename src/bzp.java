import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzp extends bzw {
   protected final bth a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final dcd f;

   public bzp(bth $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dP();
      this.a(EnumSet.of(bzw.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.R()) {
         return false;
      } else if (!this.a.bQ()) {
         return false;
      } else if (!this.f.h(this.a.dp())) {
         return false;
      } else {
         return !this.a.a(bsk.f).e() ? false : this.h();
      }
   }

   protected boolean h() {
      evz $$0 = this.i();
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
   protected evz i() {
      aym $$0 = this.a.dS();
      ja $$1 = this.a.dp();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         ja $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.c($$3) < 0.0F) {
            return evz.c($$3);
         }
      }

      return null;
   }
}
