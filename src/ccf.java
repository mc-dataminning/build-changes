import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccf<T extends btn> extends ccm {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected btn c;
   protected cef d;

   public ccf(btp $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public ccf(btp $$0, Class<T> $$1, boolean $$2, Predicate<btn> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public ccf(btp $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public ccf(btp $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<btn> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cam.a.d));
      this.d = cef.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.dR().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ewx a(double $$0) {
      return this.e.cK().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cmx.class && this.a != aqv.class) {
         this.c = this.e.dO().a(this.e.dO().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dt(), this.e.dx(), this.e.dz());
      } else {
         this.c = this.e.dO().a(this.d, this.e, this.e.dt(), this.e.dx(), this.e.dz());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable btn $$0) {
      this.c = $$0;
   }
}
