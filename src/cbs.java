import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cbs extends ccg {
   private static final cfz d = cfz.b().a(8.0).d();
   protected final cgz a;
   private final Class<? extends cgz> e;
   protected final ard b;
   @Nullable
   protected cgz c;
   private int f;
   private final double g;

   public cbs(cgz $$0, double $$1) {
      this($$0, $$1, (Class<? extends cgz>)$$0.getClass());
   }

   public cbs(cgz $$0, double $$1, Class<? extends cgz> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(ccg.a.a, ccg.a.b));
   }

   @Override
   public boolean b() {
      if (!this.a.gC()) {
         return false;
      } else {
         this.c = this.h();
         return this.c != null;
      }
   }

   @Override
   public boolean c() {
      return this.c.bL() && this.c.gC() && this.f < 60 && !this.c.gp();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.L().a(this.c, 10.0F, (float)this.a.ad());
      this.a.P().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private cgz h() {
      List<? extends cgz> $$0 = this.b.a(this.e, d, this.a, this.a.cR().g(8.0));
      double $$1 = Double.MAX_VALUE;
      cgz $$2 = null;

      for (cgz $$3 : $$0) {
         if (this.a.a($$3) && !$$3.gp() && this.a.g($$3) < $$1) {
            $$2 = $$3;
            $$1 = this.a.g($$3);
         }
      }

      return $$2;
   }

   protected void g() {
      this.a.a(this.b, this.c);
   }
}
