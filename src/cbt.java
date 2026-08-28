import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbt<T extends btc> extends cca {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected btc c;
   protected cdt d;

   public cbt(bte $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cbt(bte $$0, Class<T> $$1, boolean $$2, Predicate<btc> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cbt(bte $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cbt(bte $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<btc> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(caa.a.d));
      this.d = cdt.a().a(this.l()).a($$5);
   }

   @Override
   public boolean a() {
      if (this.b > 0 && this.e.dU().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected ewc a(double $$0) {
      return this.e.cM().c($$0, 4.0, $$0);
   }

   protected void h() {
      if (this.a != cml.class && this.a != aqn.class) {
         this.c = this.e.dR().a(this.e.dR().a(this.a, this.a(this.l()), $$0 -> true), this.d, this.e, this.e.dw(), this.e.dA(), this.e.dC());
      } else {
         this.c = this.e.dR().a(this.d, this.e, this.e.dw(), this.e.dA(), this.e.dC());
      }
   }

   @Override
   public void c() {
      this.e.h(this.c);
      super.c();
   }

   public void a(@Nullable btc $$0) {
      this.c = $$0;
   }
}
