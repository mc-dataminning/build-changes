import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccv<T extends buf> extends cdc {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected buf c;
   protected cev d;

   public ccv(buh $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public ccv(buh $$0, Class<T> $$1, boolean $$2, Predicate<buf> $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public ccv(buh $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public ccv(buh $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable Predicate<buf> $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cbc.a.d));
      this.d = cev.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.dV().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected exz a(double $$0) {
      return this.e.cO().c($$0, $$0, $$0);
   }

   protected void h() {
      if (this.a != cnp.class && this.a != arh.class) {
         this.c = this.e.dS().a(this.e.dS().a(this.a, this.a(this.l()), $$0 -> true), this.i(), this.e, this.e.dx(), this.e.dB(), this.e.dD());
      } else {
         this.c = this.e.dS().a(this.i(), this.e, this.e.dx(), this.e.dB(), this.e.dD());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable buf $$0) {
      this.c = $$0;
   }

   private cev i() {
      return this.d.a(this.l());
   }
}
