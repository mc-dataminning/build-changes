import java.util.EnumSet;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ccv extends ccc {
   public static final int b = 1;
   protected final bvm c;
   protected final double d;
   protected double e;
   protected double f;
   protected double g;
   protected boolean h;
   private final Function<bvm, axt<bta>> a;

   public ccv(bvm $$0, double $$1) {
      this($$0, $$1, axf.F);
   }

   public ccv(bvm $$0, double $$1, axt<bta> $$2) {
      this($$0, $$1, $$1x -> $$2);
   }

   public ccv(bvm $$0, double $$1, Function<bvm, axt<bta>> $$2) {
      this.c = $$0;
      this.d = $$1;
      this.a = $$2;
      this.a(EnumSet.of(ccc.a.a));
   }

   @Override
   public boolean b() {
      if (!this.h()) {
         return false;
      } else {
         if (this.c.ca()) {
            jh $$0 = this.a(this.c.dY(), this.c, 5);
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
      return this.c.eJ() != null && this.c.eJ().a(this.a.apply(this.c));
   }

   protected boolean i() {
      ezr $$0 = cfz.a(this.c, 5, 4);
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
      this.c.P().a(this.e, this.f, this.g, this.d);
      this.h = true;
   }

   @Override
   public void e() {
      this.h = false;
   }

   @Override
   public boolean c() {
      return !this.c.P().m();
   }

   @Nullable
   protected jh a(dek $$0, bui $$1, int $$2) {
      jh $$3 = $$1.dy();
      return !$$0.a_($$3).g($$0, $$3).c() ? null : jh.a($$1.dy(), $$2, 1, $$1x -> $$0.b_($$1x).a(axj.a)).orElse(null);
   }
}
