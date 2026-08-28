import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cet extends cea {
   public static final int b = 1;
   protected final bxm c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bxm, axr<buw>> a;

   public cet(bxm $$0, double $$1) {
      this($$0, $$1, axd.F);
   }

   public cet(bxm $$0, double $$1, axr<buw> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public cet(bxm $$0, double $$1, Function<bxm, axr<buw>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(cea.a.a));
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
      return this.c.eI() != null && this.c.eI().a(this.a.apply(this.c));
   }

   protected boolean i() {
      feq $$0 = chx.a(this.c, 5, 4);
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
   protected iu a(dig $$0, bwf $$1, int $$2) {
      iu $$3 = $$1.dv();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : iu.a($$1.dv(), $$2, 1, $$1x -> $$0.b_($$1x).a(axh.a)).orElse(null);
   }
}
