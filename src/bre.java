import java.util.EnumSet;
import javax.annotation.Nullable;

public class bre extends bpw {
   private static final btn c = btn.b().a(10.0).d();
   private final btn d;
   protected final bjk a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cbp b;
   private int k;
   private boolean l;
   private final cmb m;
   private final boolean n;

   public bre(bjk $$0, double $$1, cmb $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dK().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(bjb $$0) {
      return this.m.a($$0.eR()) || this.m.a($$0.eS());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.f(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dC() - this.i) > 5.0 || Math.abs((double)this.b.dA() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dp();
            this.g = this.b.dr();
            this.h = this.b.dv();
         }

         this.i = (double)this.b.dC();
         this.j = (double)this.b.dA();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.dp();
      this.g = this.b.dr();
      this.h = this.b.dv();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.H().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.D().a(this.b, (float)(this.a.X() + 20), (float)this.a.W());
      if (this.a.f(this.b) < 6.25) {
         this.a.H().n();
      } else {
         this.a.H().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
