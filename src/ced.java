import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ced extends ccv {
   private static final cgo c = cgo.b().d();
   private final cgo d;
   protected final bwf a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cpo b;
   private int k;
   private boolean l;
   private final Predicate<cxg> m;
   private final boolean n;

   public ced(bwf $$0, double $$1, Predicate<cxg> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      this.d = c.c().a(($$0x, $$1x) -> this.a($$0x));
   }

   @Override
   public boolean b() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = a(this.a).a(this.d.a(this.a.h(bxf.E)), this.a);
         return this.b != null;
      }
   }

   private boolean a(bvx $$0) {
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
      this.a.L().o();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void a() {
      this.a.H().a(this.b, (float)(this.a.aa() + 20), (float)this.a.Z());
      if (this.a.g(this.b) < 6.25) {
         this.a.L().o();
      } else {
         this.a.L().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
