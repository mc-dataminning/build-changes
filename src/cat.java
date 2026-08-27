import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cat extends bzl {
   private static final cde c = cde.b().a(10.0).d();
   private final cde d;
   protected final bsw a;
   private final double e;
   private double f;
   private double g;
   private double h;
   private double i;
   private double j;
   @Nullable
   protected cly b;
   private int k;
   private boolean l;
   private final Predicate<cuh> m;
   private final boolean n;

   public cat(bsw $$0, double $$1, Predicate<cuh> $$2, boolean $$3) {
      this.a = $$0;
      this.e = $$1;
      this.m = $$2;
      this.n = $$3;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      this.d = c.c().a(this::a);
   }

   @Override
   public boolean a() {
      if (this.k > 0) {
         this.k--;
         return false;
      } else {
         this.b = this.a.dU().a(this.d, this.a);
         return this.b != null;
      }
   }

   private boolean a(bso $$0) {
      return this.m.test($$0.fg()) || this.m.test($$0.fh());
   }

   @Override
   public boolean b() {
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

      return this.a();
   }

   protected boolean h() {
      return this.n;
   }

   @Override
   public void c() {
      this.f = this.b.dz();
      this.g = this.b.dB();
      this.h = this.b.dF();
      this.l = true;
   }

   @Override
   public void d() {
      this.b = null;
      this.a.J().n();
      this.k = b(100);
      this.l = false;
   }

   @Override
   public void e() {
      this.a.F().a(this.b, (float)(this.a.aa() + 20), (float)this.a.Z());
      if (this.a.g(this.b) < 6.25) {
         this.a.J().n();
      } else {
         this.a.J().a(this.b, this.e);
      }
   }

   public boolean i() {
      return this.l;
   }
}
