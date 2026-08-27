import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brl<T extends biw> extends brs {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected biw c;
   protected btj d;

   public brl(biy $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public brl(biy $$0, Class<T> $$1, boolean $$2, Predicate<biw> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public brl(biy $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public brl(biy $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<biw> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bps.a.d));
      this.d = btj.a().a(this.l()).a($$5);
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

   protected eha a(double $$0) {
      return this.e.cG().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cbl.class && this.a != akj.class) {
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

   public void a(@Nullable biw $$0) {
      this.c = $$0;
   }
}
