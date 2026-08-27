import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brn<T extends biy> extends bru {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected biy c;
   protected btl d;

   public brn(bja $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public brn(bja $$0, Class<T> $$1, boolean $$2, Predicate<biy> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public brn(bja $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public brn(bja $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<biy> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bpu.a.d));
      this.d = btl.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.ee().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected egz a(double $$0) {
      return this.e.cG().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cbn.class && this.a != akl.class) {
         this.c = this.e.dK().a(this.e.dK().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dp(), this.e.dt(), this.e.dv());
      } else {
         this.c = this.e.dK().a(this.d, this.e, this.e.dp(), this.e.dt(), this.e.dv());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable biy $$0) {
      this.c = $$0;
   }
}
