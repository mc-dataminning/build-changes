import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class boo<T extends bfz> extends bov {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bfz c;
   protected bqm d;

   public boo(bgb $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public boo(bgb $$0, Class<T> $$1, boolean $$2, Predicate<bfz> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public boo(bgb $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public boo(bgb $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bfz> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bmv.a.d));
      this.d = bqm.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.ec().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected eed a(double $$0) {
      return this.e.cE().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != byo.class && this.a != aig.class) {
         this.c = this.e.dI().a(this.e.dI().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dn(), this.e.dr(), this.e.dt());
      } else {
         this.c = this.e.dI().a(this.d, this.e, this.e.dn(), this.e.dr(), this.e.dt());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bfz $$0) {
      this.c = $$0;
   }
}
