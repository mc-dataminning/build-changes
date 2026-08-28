import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccg<T extends btp> extends ccn {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected btp c;
   protected ceg d;

   public ccg(btr $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public ccg(btr $$0, Class<T> $$1, boolean $$2, Predicate<btp> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public ccg(btr $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public ccg(btr $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<btp> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(can.a.d));
      this.d = ceg.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.el().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected evm a(double $$0) {
      return this.e.cK().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cmx.class && this.a != arg.class) {
         this.c = this.e.dP().a(this.e.dP().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.du(), this.e.dy(), this.e.dA());
      } else {
         this.c = this.e.dP().a(this.d, this.e, this.e.du(), this.e.dy(), this.e.dA());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable btp $$0) {
      this.c = $$0;
   }
}
