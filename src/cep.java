import java.util.EnumSet;
import javax.annotation.Nullable;

public class cep<T extends bvy> extends cew {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bvy c;
   protected cgp d;

   public cep(bwa $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cep(bwa $$0, Class<T> $$1, boolean $$2, cgp.a $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cep(bwa $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cep(bwa $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable cgp.a $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(ccw.a.d));
      this.d = cgp.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.dX().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected fbs a(double $$0) {
      return this.e.cQ().c($$0, $$0, $$0);
   }

   protected void h() {
      ard $$0 = a(this.e);
      if (this.a != cpr.class && this.a != are.class) {
         this.c = $$0.a(this.e.dU().a(this.a, this.a(this.l()), $$0x -> true), this.i(), this.e, this.e.dz(), this.e.dD(), this.e.dF());
      } else {
         this.c = $$0.a(this.i(), this.e, this.e.dz(), this.e.dD(), this.e.dF());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable bvy $$0) {
      this.c = $$0;
   }

   private cgp i() {
      return this.d.a(this.l());
   }
}
