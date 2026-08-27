import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwn extends bvu {
   public static final int a = 1;
   protected final bpf b;
   protected final double c;
   protected double d;
   protected double e;
   protected double f;
   protected boolean g;

   public bwn(bpf $$0, double $$1) {
      this.b = $$0;
      this.c = $$1;
      this.a(EnumSet.of(bvu.a.a));
   }

   @Override
   public boolean a() {
      if (!this.h()) {
         return false;
      } else {
         if (this.b.bK()) {
            ib $$0 = this.a(this.b.dJ(), this.b, 5);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            }
         }

         return this.i();
      }
   }

   protected boolean h() {
      return this.b.eg() != null || this.b.dy() || this.b.bK();
   }

   protected boolean i() {
      eov $$0 = bzr.a(this.b, 5, 4);
      if ($$0 == null) {
         return false;
      } else {
         this.d = $$0.c;
         this.e = $$0.d;
         this.f = $$0.e;
         return true;
      }
   }

   public boolean k() {
      return this.g;
   }

   @Override
   public void c() {
      this.b.N().a(this.d, this.e, this.f, this.c);
      this.g = true;
   }

   @Override
   public void d() {
      this.g = false;
   }

   @Override
   public boolean b() {
      return !this.b.N().l();
   }

   @Nullable
   protected ib a(cvk $$0, bof $$1, int $$2) {
      ib $$3 = $$1.dj();
      return !$$0.a_($$3).k($$0, $$3).c() ? null : ib.a($$1.dj(), $$2, 1, $$1x -> $$0.b_($$1x).a(auj.a)).orElse(null);
   }
}
