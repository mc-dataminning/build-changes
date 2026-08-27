import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bsd extends bsr {
   private static final bwj d = bwj.b().a(8.0).d();
   protected final bxi a;
   private final Class<? extends bxi> e;
   protected final csy b;
   @Nullable
   protected bxi c;
   private int f;
   private final double g;

   public bsd(bxi $$0, double $$1) {
      this($$0, $$1, (Class<? extends bxi>)$$0.getClass());
   }

   public bsd(bxi $$0, double $$1, Class<? extends bxi> $$2) {
      this.a = $$0;
      this.b = $$0.dM();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bsr.a.a, bsr.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gi()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bx() && this.c.gi() && this.f < 60 && !this.c.gb();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.I().a(this.c, 10.0F, (float)this.a.aa());
      this.a.N().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.f(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private bxi h() {
      List<? extends bxi> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      bxi $$2 = null;

      for (bxi $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gb() && this.a.f($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.f($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((amp)this.b, this.c);
   }
}
