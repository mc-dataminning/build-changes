import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdl extends ccd {
   private static final cfw c = cfw.b().d();
   private final cfw d;
   protected final bvn a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cov b;
   private int k;
   private boolean l;
   private final Predicate<cwn> m;
   private final boolean n;

   public cdl(bvn $$0, double $$1, Predicate<cwn> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      this.d = c.c().a(($$0x, $$1x) -> this.a($$0x));
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = a(this.a).a(this.d.a(this.a.h(bwn.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(bvf $$0) {
      return this.m.test($$0.eZ()) || this.m.test($$0.fa());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dO() - this.i) > 5.0 || Math.abs((double)this.b.dM() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dB();
            this.g = this.b.dD();
            this.h = this.b.dH();
         }

         this.i = (double)this.b.dO();
         this.j = (double)this.b.dM();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dB();
      this.g = this.b.dD();
      this.h = this.b.dH();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.L().m();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.H().a(this.b, (float)(this.a.ab() + 20), (float)this.a.aa());
      if (this.a.g(this.b) < 6.25) {
         this.a.L().m();
      } else {
         this.a.L().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
