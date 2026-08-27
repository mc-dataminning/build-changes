import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbe<T extends bso> extends cbl {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bso c;
   protected cde d;

   public cbe(bsq $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cbe(bsq $$0, Class<T> $$1, boolean $$2, Predicate<bso> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cbe(bsq $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cbe(bsq $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bso> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bzl.a.d));
      this.d = cde.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.et().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ewp a(double $$0) {
      return this.e.cP().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cly.class && this.a != aqu.class) {
         this.c = this.e.dU().a(this.e.dU().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dz(), this.e.dD(), this.e.dF());
      } else {
         this.c = this.e.dU().a(this.d, this.e, this.e.dz(), this.e.dD(), this.e.dF());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bso $$0) {
      this.c = $$0;
   }
}
