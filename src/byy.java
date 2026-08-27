import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class byy extends bzm {
   private static final cdf d = cdf.b().a(8.0).d();
   protected final cee a;
   private final Class<? extends cee> e;
   protected final dax b;
   @Nullable
   protected cee c;
   private int f;
   private final double g;

   public byy(cee $$0, double $$1) {
      this($$0, $$1, (Class<? extends cee>)$$0.getClass());
   }

   public byy(cee $$0, double $$1, Class<? extends cee> $$2) {
      this.a = $$0;
      this.b = $$0.dP();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bzm.a.a, bzm.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gt()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bD() && this.c.gt() && this.f < 60 && !this.c.gm();
   }

   @Override
   public void d() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void e() {
      this.a.G().a(this.c, 10.0F, (float)this.a.Z());
      this.a.K().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cee h() {
      List<? extends cee> $$0 = this.b.a(this.e, d, this.a, this.a.cK().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cee $$2 = null;

      for (cee $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gm() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aqm)this.b, this.c);
   }
}
