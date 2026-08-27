import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzu extends byx {
   public static final int a = 120;
   protected final bsi b;
   protected double c;
   protected double d;
   protected double e;
   protected final double f;
   protected int g;
   protected boolean h;
   private final boolean i;

   public bzu(bsi $$0, double $$1) {
      this($$0, $$1, 120);
   }

   public bzu(bsi $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, true);
   }

   public bzu(bsi $$0, double $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(byx.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cP()) {
         return false;
      } else {
         if (!this.h) {
            if (this.i && this.b.eo() >= 100) {
               return false;
            }

            if (this.b.ej().a(b(this.g)) != 0) {
               return false;
            }
         }

         etp $$0 = this.h();
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
   protected etp h() {
      return ccu.a(this.b, 10, 7);
   }

   @Override
   public boolean b() {
      return !this.b.K().l() && !this.b.cP();
   }

   @Override
   public void c() {
      this.b.K().a(this.c, this.d, this.e, this.f);
   }

   @Override
   public void d() {
      this.b.K().n();
      super.d();
   }

   public void i() {
      this.h = true;
   }

   public void c(int $$0) {
      this.g = $$0;
   }
}
