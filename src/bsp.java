import java.util.EnumSet;
import javax.annotation.Nullable;

public class bsp extends bth {
   private final bzb a;
   @Nullable
   private cfi b;
   private final ctp c;
   private final float d;
   private int e;
   private final bwz f;

   public bsp(bzb $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dM();
      this.d = $$1;
      this.f = bwz.b().a((double)$$1);
      this.a(EnumSet.of(bth.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bx()) {
         return false;
      } else {
         return this.a.f((blv)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.A(true);
      this.e = this.a(40 + this.a.eg().a(40));
   }

   @Override
   public void d() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.I().a(this.b.dr(), this.b.dv(), this.b.dx(), 10.0F, (float)this.a.aa());
      this.e--;
   }

   private boolean a(cfi $$0) {
      for (bka $$1 : bka.values()) {
         cmy $$2 = $$0.b($$1);
         if (this.a.u() && $$2.a(cnb.rw)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
