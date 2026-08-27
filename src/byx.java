import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class byx extends bzl {
   private static final cde d = cde.b().a(8.0).d();
   protected final cee a;
   private final Class<? extends cee> e;
   protected final dca b;
   @Nullable
   protected cee c;
   private int f;
   private final double g;

   public byx(cee $$0, double $$1) {
      this($$0, $$1, (Class<? extends cee>)$$0.getClass());
   }

   public byx(cee $$0, double $$1, Class<? extends cee> $$2) {
      this.a = $$0;
      this.b = $$0.dU();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gC()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bI() && this.c.gC() && this.f < 60 && !this.c.gv();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.F().a(this.c, 10.0F, (float)this.a.Z());
      this.a.J().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cee h() {
      List<? extends cee> $$0 = this.b.a(this.e, d, this.a, this.a.cP().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cee $$2 = null;

      for (cee $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gv() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqt)this.b, this.c);
   }
}
