import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cci extends ccw {
   private static final cgp d = cgp.b().a(8.0).d();
   protected final chp a;
   private final Class<? extends chp> e;
   protected final ard b;
   @Nullable
   protected chp c;
   private int f;
   private final double g;

   public cci(chp $$0, double $$1) {
      this($$0, $$1, (Class<? extends chp>)$$0.getClass());
   }

   public cci(chp $$0, double $$1, Class<? extends chp> $$2) {
      this.a = $$0;
      this.b = a($$0);
      this.e = $$2;
      this.g = $$1;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
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
      return this.c.bJ() && this.c.gC() && this.f < 60 && !this.c.gp();
   }

   @Override
   public void e() {
      this.c = null;
      this.f = 0;
   }

   @Override
   public void a() {
      this.a.J().a(this.c, 10.0F, (float)this.a.ac());
      this.a.O().a(this.c, this.g);
      this.f++;
      if (this.f >= this.a(60) && this.a.g(this.c) < 9.0) {
         this.g();
      }
   }

   @Nullable
   private chp h() {
      List<? extends chp> $$0 = this.b.a(this.e, d, this.a, this.a.cQ().g(8.0));
      double $$1 = Double.MAX_VALUE;
      chp $$2 = null;

      for (chp $$3 : $$0) {
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
