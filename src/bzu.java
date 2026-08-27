import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bzu<T extends bre> extends cab {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bre c;
   protected cbu d;

   public bzu(brg $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public bzu(brg $$0, Class<T> $$1, boolean $$2, Predicate<bre> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public bzu(brg $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public bzu(brg $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<bre> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(byb.a.d));
      this.d = cbu.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.ej().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected eta a(double $$0) {
      return this.e.cI().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != ckl.class && this.a != aqf.class) {
         this.c = this.e.dN().a(this.e.dN().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.ds(), this.e.dw(), this.e.dy());
      } else {
         this.c = this.e.dN().a(this.d, this.e, this.e.ds(), this.e.dw(), this.e.dy());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable bre $$0) {
      this.c = $$0;
   }
}
