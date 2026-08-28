import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdx<T extends bvg> extends cee {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bvg c;
   protected cfx d;

   public cdx(bvi $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cdx(bvi $$0, Class<T> $$1, boolean $$2, cfx.a $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cdx(bvi $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cdx(bvi $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable cfx.a $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cce.a.d));
      this.d = cfx.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.dZ().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected fav a(double $$0) {
      return this.e.cR().c($$0, $$0, $$0);
   }

   protected void h() {
      arc $$0 = a(this.e);
      if (this.a != cox.class && this.a != ard.class) {
         this.c = $$0.a(this.e.dW().a(this.a, this.a(this.l()), $$0x -> true), this.i(), this.e, this.e.dB(), this.e.dF(), this.e.dH());
      } else {
         this.c = $$0.a(this.i(), this.e, this.e.dB(), this.e.dF(), this.e.dH());
      }
   }

   @Override
   public void d() {
      this.e.h(this.c);
      super.d();
   }

   public void a(@Nullable bvg $$0) {
      this.c = $$0;
   }

   private cfx i() {
      return this.d.a(this.l());
   }
}
