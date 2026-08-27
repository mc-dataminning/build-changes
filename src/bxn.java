import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxn<T extends box> extends bxu {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected box c;
   protected bzn d;

   public bxn(boz $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public bxn(boz $$0, Class<T> $$1, boolean $$2, Predicate<box> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public bxn(boz $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public bxn(boz $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<box> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bvu.a.d));
      this.d = bzn.a().a(this.l()).a($$5);
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

   protected eoq a(double $$0) {
      return this.e.cE().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cia.class && this.a != apb.class) {
         this.c = this.e.dJ().a(this.e.dJ().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.do(), this.e.ds(), this.e.du());
      } else {
         this.c = this.e.dJ().a(this.d, this.e, this.e.do(), this.e.ds(), this.e.du());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable box $$0) {
      this.c = $$0;
   }
}
