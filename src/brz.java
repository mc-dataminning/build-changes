import java.util.EnumSet;
import javax.annotation.Nullable;

public class brz extends bsr {
   private final byl a;
   @Nullable
   private cer b;
   private final csy c;
   private final float d;
   private int e;
   private final bwj f;

   public brz(byl $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dM();
      this.d = $$1;
      this.f = bwj.b().a((double)$$1);
      this.a(EnumSet.of(bsr.a.b));
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
         return this.a.f((blf)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
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

   private boolean a(cer $$0) {
      for (bjk $$1 : bjk.values()) {
         cmh $$2 = $$0.b($$1);
         if (this.a.u() && $$2.a(cmk.rw)) {
            return true;
         }

         if (this.a.m($$2)) {
            return true;
         }
      }

      return false;
   }
}
