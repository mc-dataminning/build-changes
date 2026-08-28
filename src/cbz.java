import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbz extends cbc {
   public static final int a = 120;
   protected final bun b;
   protected double c;
   protected double d;
   protected double e;
   protected final double f;
   protected int g;
   protected boolean h;
   private final boolean i;

   public cbz(bun $$0, double $$1) {
      this($$0, $$1, 120);
   }

   public cbz(bun $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, true);
   }

   public cbz(bun $$0, double $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cbc.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cV()) {
         return false;
      } else {
         if (!this.h) {
            if (this.i && this.b.eq() >= 100) {
               return false;
            }

            if (this.b.dV().a(b(this.g)) != 0) {
               return false;
            }
         }

         eye $$0 = this.h();
         if ($$0 == null) {
            return false;
         } else {
            this.c = $$0.d;
            this.d = $$0.e;
            this.e = $$0.f;
            this.h = false;
            return true;
         }
      }
   }

   @Nullable
   protected eye h() {
      return cez.a(this.b, 10, 7);
   }

   @Override
   public boolean c() {
      return !this.b.P().m() && !this.b.cV();
   }

   @Override
   public void d() {
      this.b.P().a(this.c, this.d, this.e, this.f);
   }

   @Override
   public void e() {
      this.b.P().o();
      super.e();
   }

   public void i() {
      this.h = true;
   }

   public void c(int $$0) {
      this.g = $$0;
   }
}
