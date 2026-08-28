import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdv<T extends bve> extends cec {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bve c;
   protected cfv d;

   public cdv(bvg $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cdv(bvg $$0, Class<T> $$1, boolean $$2, Predicate<bve> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cdv(bvg $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cdv(bvg $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bve> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(ccc.a.d));
      this.d = cfv.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.eb().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ezm a(double $$0) {
      return this.e.cT().c($$0, $$0, $$0);
   }

   protected void h() {
      if (this.a != cor.class && this.a != arr.class) {
         this.c = this.e.dY().a(this.e.dY().a(this.a, this.a(this.l()), $$0 -> true), this.i(), this.e, this.e.dD(), this.e.dH(), this.e.dJ());
      } else {
         this.c = this.e.dY().a(this.i(), this.e, this.e.dD(), this.e.dH(), this.e.dJ());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable bve $$0) {
      this.c = $$0;
   }

   private cfv i() {
      return this.d.a(this.l());
   }
}
