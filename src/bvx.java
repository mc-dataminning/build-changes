import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class bvx extends bwl {
   private static final cae d = cae.b().a(8.0).d();
   protected final cbd a;
   private final Class<? extends cbd> e;
   protected final cwz b;
   @Nullable
   protected cbd c;
   private int f;
   private final double g;

   public bvx(cbd $$0, double $$1) {
      this($$0, $$1, (Class<? extends cbd>)$$0.getClass());
   }

   public bvx(cbd $$0, double $$1, Class<? extends cbd> $$2) {
      this.a = $$0;
      this.b = $$0.dM();
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(bwl.a.a, bwl.a.b));
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
   private cbd h() {
      List<? extends cbd> $$0 = this.b.a(this.e, d, this.a, this.a.cH().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cbd $$2 = null;

      for (cbd $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gk() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a((apf)this.b, this.c);
   }
}
