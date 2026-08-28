import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdr<T extends bva> extends cdy {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bva c;
   protected cfr d;

   public cdr(bvc $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cdr(bvc $$0, Class<T> $$1, boolean $$2, Predicate<bva> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cdr(bvc $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cdr(bvc $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bva> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cby.a.d));
      this.d = cfr.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.ea().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ezi a(double $$0) {
      return this.e.cS().c($$0, $$0, $$0);
   }

   protected void h() {
      if (this.a != com.class && this.a != aro.class) {
         this.c = this.e.dX().a(this.e.dX().a(this.a, this.a(this.l()), $$0 -> true), this.i(), this.e, this.e.dC(), this.e.dG(), this.e.dI());
      } else {
         this.c = this.e.dX().a(this.i(), this.e, this.e.dC(), this.e.dG(), this.e.dI());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable bva $$0) {
      this.c = $$0;
   }

   private cfr i() {
      return this.d.a(this.l());
   }
}
