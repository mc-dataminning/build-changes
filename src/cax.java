import java.util.EnumSet;
import javax.annotation.Nullable;

public class cax extends caa {
   public static final int a = 120;
   protected final btl b;
   protected double c;
   protected double d;
   protected double e;
   protected final double f;
   protected int g;
   protected boolean h;
   private final boolean i;

   public cax(btl $$0, double $$1) {
      this($$0, $$1, 120);
   }

   public cax(btl $$0, double $$1, int $$2) {
      this($$0, $$1, $$2, true);
   }

   public cax(btl $$0, double $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.f = $$1;
      this.g = $$2;
      this.i = $$3;
      this.a(EnumSet.of(caa.a.a));
   }

   @Override
   public boolean a() {
      if (this.b.cT()) {
         return false;
      } else {
         if (!this.h) {
            if (this.i && this.b.eo() >= 100) {
               return false;
            }

            if (this.b.dU().a(b(this.g)) != 0) {
               return false;
            }
         }

         ewh $$0 = this.h();
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
   protected ewh h() {
      return cdx.a(this.b, 10, 7);
   }

   @Override
   public boolean b() {
      return !this.b.J().l() && !this.b.cT();
   }

   @Override
   public void c() {
      this.b.J().a(this.c, this.d, this.e, this.f);
   }

   @Override
   public void d() {
      this.b.J().n();
      super.d();
   }

   public void i() {
      this.h = true;
   }

   public void c(int $$0) {
      this.g = $$0;
   }
}
