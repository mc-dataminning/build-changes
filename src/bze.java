import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bze<T extends bqo> extends bzl {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bqo c;
   protected cbe d;

   public bze(bqq $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public bze(bqq $$0, Class<T> $$1, boolean $$2, Predicate<bqo> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public bze(bqq $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public bze(bqq $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bqo> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bxl.a.d));
      this.d = cbe.a().a(this.l()).a($$5);
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

   protected erv a(double $$0) {
      return this.e.cH().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cjt.class && this.a != apt.class) {
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

   public void a(@Nullable bqo $$0) {
      this.c = $$0;
   }
}
