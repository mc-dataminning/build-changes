import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bwx extends bxl {
   private static final cbe d = cbe.b().a(8.0).d();
   protected final ccd a;
   private final Class<? extends ccd> e;
   protected final cyx b;
   @Nullable
   protected ccd c;
   private int f;
   private final double g;

   public bwx(ccd $$0, double $$1) {
      this($$0, $$1, (Class<? extends ccd>)$$0.getClass());
   }

   public bwx(ccd $$0, double $$1, Class<? extends ccd> $$2) {
      this.a = $$0;
      this.b = $$0.dM();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bxl.a.a, bxl.a.b));
   }

   @Override
   public boolean a() {
      if (!this.a.gr()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean b() {
      return this.c.bA() && this.c.gr() && this.f < 60 && !this.c.gk();
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
   private ccd h() {
      List<? extends ccd> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      ccd $$2 = null;

      for (ccd $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gk() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((aps)this.b, this.c);
   }
}
