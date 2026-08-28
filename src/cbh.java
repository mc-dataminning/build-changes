import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbh extends bzz {
   private static final cds c = cds.b().a(10.0).d();
   private final cds d;
   protected final btk a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cmk b;
   private int k;
   private boolean l;
   private final Predicate<cuc> m;
   private final boolean n;

   public cbh(btk $$0, double $$1, Predicate<cuc> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bzz.a.a, bzz.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dQ().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(btb $$0) {
      return this.m.test($$0.eU()) || this.m.test($$0.eV());
   }

   @Override
   public boolean b() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dI() - this.i) > 5.0 || Math.abs((double)this.b.dG() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dv();
            this.g = this.b.dx();
            this.h = this.b.dB();
         }

         this.i = (double)this.b.dI();
         this.j = (double)this.b.dG();
      }

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.dv();
      this.g = this.b.dx();
      this.h = this.b.dB();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.K().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.G().a(this.b, (float)(this.a.ab() + 20), (float)this.a.aa());
      if (this.a.g(this.b) < 6.25) {
         this.a.K().n();
      } else {
         this.a.K().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
