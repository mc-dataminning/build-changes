import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class btz<T extends bll> extends bug {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bll c;
   protected bvx d;

   public btz(bln $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public btz(bln $$0, Class<T> $$1, boolean $$2, Predicate<bll> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public btz(bln $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public btz(bln $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bll> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bsg.a.d));
      this.d = bvx.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.eh().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected eju a(double $$0) {
      return this.e.cH().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cdz.class && this.a != amj.class) {
         this.c = this.e.dN().a(this.e.dN().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.ds(), this.e.dw(), this.e.dy());
      } else {
         this.c = this.e.dN().a(this.d, this.e, this.e.ds(), this.e.dw(), this.e.dy());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bll $$0) {
      this.c = $$0;
   }
}
