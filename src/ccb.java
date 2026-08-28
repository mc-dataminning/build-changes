import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccb<T extends btk> extends cci {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected btk c;
   protected ceb d;

   public ccb(btm $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public ccb(btm $$0, Class<T> $$1, boolean $$2, Predicate<btk> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public ccb(btm $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public ccb(btm $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<btk> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cai.a.d));
      this.d = ceb.a().a(this.l()).a($$5);
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

   protected evh a(double $$0) {
      return this.e.cK().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cms.class && this.a != arc.class) {
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

   public void a(@Nullable btk $$0) {
      this.c = $$0;
   }
}
