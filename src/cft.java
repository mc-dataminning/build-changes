import java.util.EnumSet;
import javax.annotation.Nullable;

public class cft<T extends bxe> extends cga {
   private static final int i = 10;
   protected final Class<T> a;
   protected final int b;
   @Nullable
   protected bxe c;
   protected cht d;

   public cft(bxg $$0, Class<T> $$1, boolean $$2) {
      this($$0, $$1, 10, $$2, false, null);
   }

   public cft(bxg $$0, Class<T> $$1, boolean $$2, cht.a $$3) {
      this($$0, $$1, 10, $$2, false, $$3);
   }

   public cft(bxg $$0, Class<T> $$1, boolean $$2, boolean $$3) {
      this($$0, $$1, 10, $$2, $$3, null);
   }

   public cft(bxg $$0, Class<T> $$1, int $$2, boolean $$3, boolean $$4, @Nullable cht.a $$5) {
      super($$0, $$3, $$4);
      this.a = $$1;
      this.b = b($$2);
      this.a(EnumSet.of(cea.a.d));
      this.d = cht.a().a(this.l()).a($$5);
   }

   @Override
   public boolean b() {
      if (this.b > 0 && this.e.dY().a(this.b) != 0) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   protected fel a(double $$0) {
      return this.e.cR().c($$0, $$0, $$0);
   }

   protected void h() {
      arq $$0 = a(this.e);
      if (this.a != crc.class && this.a != arr.class) {
         this.c = $$0.a(this.e.dV().a(this.a, this.a(this.l()), $$0x -> true), this.i(), this.e, this.e.dA(), this.e.dE(), this.e.dG());
      } else {
         this.c = $$0.a(this.i(), this.e, this.e.dA(), this.e.dE(), this.e.dG());
      }
   }

   @Override
   public void d() {
      this.e.g(this.c);
      super.d();
   }

   public void a(@Nullable bxe $$0) {
      this.c = $$0;
   }

   private cht i() {
      return this.d.a(this.l());
   }
}
