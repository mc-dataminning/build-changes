import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfy<T extends bxj> extends cgf {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bxj c;
   protected chy d;

   public cfy(bxl $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cfy(bxl $$0, Class<T> $$1, boolean $$2, chy.a $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cfy(bxl $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cfy(bxl $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable chy.a $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cef.a.d));
      this.d = chy.a().a(this.l()).a($$5);
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

   protected fes a(double $$0) {
      return this.e.cQ().c($$0, $$0, $$0);
   }

   protected void h() {
      arq $$0 = a(this.e);
      if (this.a != crj.class && this.a != arr.class) {
         this.c = $$0.a(this.e.dU().a(this.a, this.a(this.l()), $$0x -> true), this.i(), this.e, this.e.dz(), this.e.dD(), this.e.dF());
      } else {
         this.c = $$0.a(this.i(), this.e, this.e.dz(), this.e.dD(), this.e.dF());
      }
   }

   @Override
   public void d() {
      this.e.g(this.c);
      super.d();
   }

   public void a(@Nullable bxj $$0) {
      this.c = $$0;
   }

   private chy i() {
      return this.d.a(this.l());
   }
}
