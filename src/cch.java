import java.util.EnumSet;
import javax.annotation.Nullable;

public class cch extends cbk {
   public static final int a = 120;
   protected final buv b;
   protected double c;
   protected double d;
   protected double e;
   protected final double f;
   protected int g;
   protected boolean h;
   private final boolean i;

   public cch(buv $$0, double $$1) {
      this($$0, $$1, 120);
   }

   public cch(buv $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, true);
   }

   public cch(buv $$0, double $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(cbk.a.a));
   }

   @Override
   public boolean b() {
      if (this.b.cV()) {
         return false;
      } else {
         if (!this.h) {
            if (this.i && this.b.er() >= 100) {
               return false;
            }

            if (this.b.dV().a(b(this.g)) != 0) {
               return false;
            }
         }

         eyw $$0 = this.h();
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
   protected eyw h() {
      return cfh.a(this.b, 10, 7);
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
