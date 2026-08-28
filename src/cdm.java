import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdm<T extends buv> extends cdt {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected buv c;
   protected cfm d;

   public cdm(bux $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cdm(bux $$0, Class<T> $$1, boolean $$2, Predicate<buv> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cdm(bux $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cdm(bux $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<buv> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cbt.a.d));
      this.d = cfm.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.ea().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ezc a(double $$0) {
      return this.e.cS().c($$0, $$0, $$0);
   }

   protected void h() {
      if (this.a != coh.class && this.a != arn.class) {
         this.c = this.e.dX().a(this.e.dX().a(this.a, this.a(this.l()), $$0 -> true), this.i(), this.e, this.e.dC(), this.e.dG(), this.e.dI());
      } else {
         this.c = this.e.dX().a(this.i(), this.e, this.e.dC(), this.e.dG(), this.e.dI());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable buv $$0) {
      this.c = $$0;
   }

   private cfm i() {
      return this.d.a(this.l());
   }
}
