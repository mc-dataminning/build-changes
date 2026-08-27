import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bsa<T extends bjm> extends bsh {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bjm c;
   protected bty d;

   public bsa(bjo $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public bsa(bjo $$0, Class<T> $$1, boolean $$2, Predicate<bjm> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public bsa(bjo $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public bsa(bjo $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bjm> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(bqh.a.d));
      this.d = bty.a().a(this.l()).a($$5);
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

   protected ehc a(double $$0) {
      return this.e.cG().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cca.class && this.a != aku.class) {
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

   public void a(@Nullable bjm $$0) {
      this.c = $$0;
   }
}
