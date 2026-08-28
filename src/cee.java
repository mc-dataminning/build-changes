import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cee extends ccw {
   private static final cgp c = cgp.b().d();
   private final cgp d;
   protected final bwg a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cpr b;
   private int k;
   private boolean l;
   private final Predicate<cxh> m;
   private final boolean n;

   public cee(bwg $$0, double $$1, Predicate<cxh> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      this.d = c.c().a(($$0x, $$1x) -> this.a($$0x));
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = a(this.a).a(this.d.a(this.a.h(bxg.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(bvy $$0) {
      return this.m.test($$0.eZ()) || this.m.test($$0.fa());
   }

   @Override
   public boolean c() {
      if (this.h()) {
         if (this.a.g(this.b) < 36.0) {
            if (this.b.i(this.f, this.g, this.h) > 0.010000000000000002) {
               return false;
            }

            if (Math.abs((double)this.b.dM() - this.i) > 5.0 || Math.abs((double)this.b.dK() - this.j) > 5.0) {
               return false;
            }
         } else {
            this.f = this.b.dz();
            this.g = this.b.dB();
            this.h = this.b.dF();
         }

         this.i = (double)this.b.dM();
         this.j = (double)this.b.dK();
      }

      return this.b();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void d() {
      this.f = this.b.dz();
      this.g = this.b.dB();
      this.h = this.b.dF();
      this.l = true;
   }

   @Override
   public void e() {
      this.b = null;
      this.a.O().m();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.J().a(this.b, (float)(this.a.ad() + 20), (float)this.a.ac());
      if (this.a.g(this.b) < 6.25) {
         this.a.O().m();
      } else {
         this.a.O().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
