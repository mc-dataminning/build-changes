import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brw<T extends bji> extends bsd {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bji c;
   protected btu d;

   public brw(bjk $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public brw(bjk $$0, Class<T> $$1, boolean $$2, Predicate<bji> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public brw(bjk $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public brw(bjk $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bji> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bqd.a.d));
      this.d = btu.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.ef().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ehk a(double $$0) {
      return this.e.cG().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cbw.class && this.a != akt.class) {
         this.c = this.e.dL().a(this.e.dL().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dq(), this.e.du(), this.e.dw());
      } else {
         this.c = this.e.dL().a(this.d, this.e, this.e.dq(), this.e.du(), this.e.dw());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bji $$0) {
      this.c = $$0;
   }
}
