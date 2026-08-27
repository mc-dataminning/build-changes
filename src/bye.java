import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bye<T extends bpo> extends byl {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bpo c;
   protected cae d;

   public bye(bpq $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public bye(bpq $$0, Class<T> $$1, boolean $$2, Predicate<bpo> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public bye(bpq $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public bye(bpq $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bpo> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bwl.a.d));
      this.d = cae.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.ei().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected epm a(double $$0) {
      return this.e.cH().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cis.class && this.a != apg.class) {
         this.c = this.e.dM().a(this.e.dM().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dr(), this.e.dv(), this.e.dx());
      } else {
         this.c = this.e.dM().a(this.d, this.e, this.e.dr(), this.e.dv(), this.e.dx());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bpo $$0) {
      this.c = $$0;
   }
}
