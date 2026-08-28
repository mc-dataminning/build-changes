import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cer extends cdy {
   public static final int b = 1;
   protected final bxk c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bxk, axr<buu>> a;

   public cer(bxk $$0, double $$1) {
      this($$0, $$1, axd.F);
   }

   public cer(bxk $$0, double $$1, axr<buu> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cer(bxk $$0, double $$1, Function<bxk, axr<buu>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cdy.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.bY()) {
            iu $$0 = this.a(this.c.dV(), this.c, 5);
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
      fei $$0 = chv.a(this.c, 5, 4);
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
   protected iu a(dib $$0, bwd $$1, int $$2) {
      iu $$3 = $$1.dv();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : iu.a($$1.dv(), $$2, 1, $$1x -> $$0.b_($$1x).a(axh.a)).orElse(null);
   }
}
