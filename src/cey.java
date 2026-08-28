import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cey extends cef {
   public static final int b = 1;
   protected final bxr c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bxr, axr<buz>> a;

   public cey(bxr $$0, double $$1) {
      this($$0, $$1, axd.F);
   }

   public cey(bxr $$0, double $$1, axr<buz> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cey(bxr $$0, double $$1, Function<bxr, axr<buz>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cef.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bW()) {
            iv $$0 = this.a(this.c.dU(), this.c, 5);
            if ($$0 != null) {
               this.e = (double)$$0.u();
               this.f = (double)$$0.v();
               this.g = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.c.eH() != null && this.c.eH().a(this.a.apply(this.c));
   }

   protected boolean i() {
      fex $$0 = cic.a(this.c, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.e = $$0.d;
         this.f = $$0.e;
         this.g = $$0.f;
         return true;
      }
   }

   public boolean k() {
      return this.h;
   }

   @Override
   public void d() {
      this.c.O().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.O().k();
   }

   @Nullable
   protected iv a(din $$0, bwi $$1, int $$2) {
      iv $$3 = $$1.du();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : iv.a($$1.du(), $$2, 1, $$1x -> $$0.b_($$1x).a(axh.a)).orElse(null);
   }
}
