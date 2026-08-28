import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbp<T extends bsy> extends cbw {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bsy c;
   protected cdp d;

   public cbp(bta $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cbp(bta $$0, Class<T> $$1, boolean $$2, Predicate<bsy> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cbp(bta $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cbp(bta $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bsy> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bzw.a.d));
      this.d = cdp.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.dS().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected evu a(double $$0) {
      return this.e.cK().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cmh.class && this.a != aql.class) {
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

   public void a(@Nullable bsy $$0) {
      this.c = $$0;
   }
}
