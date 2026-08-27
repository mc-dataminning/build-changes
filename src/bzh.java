import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzh extends bzo {
   protected final bsz a;
   private double b;
   private double c;
   private double d;
   private final double e;
   private final daz f;

   public bzh(bsz $$0, double $$1) {
      this.a = $$0;
      this.e = $$1;
      this.f = $$0.dP();
      this.a(EnumSet.of(bzo.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.p() != null) {
         return false;
      } else if (!this.f.Q()) {
         return false;
      } else if (!this.a.bQ()) {
         return false;
      } else if (!this.f.h(this.a.dp())) {
         return false;
      } else {
         return !this.a.a(bsd.f).e() ? false : this.h();
      }
   }

   protected boolean h() {
      eum $$0 = this.i();
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
   protected eum i() {
      aym $$0 = this.a.el();
      io $$1 = this.a.dp();

      for (int $$2 = 0; $$2 < 10; $$2++) {
         io $$3 = $$1.b($$0.a(20) - 10, $$0.a(6) - 3, $$0.a(20) - 10);
         if (!this.f.h($$3) && this.a.d($$3) < 0.0F) {
            return eum.c($$3);
         }
      }

      return null;
   }
}
