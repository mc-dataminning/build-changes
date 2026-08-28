import java.util.EnumSet;

public class cdc extends ccw {
   private final bwa a;
   private bvy b;
   private final float c;

   public cdc(bwa $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(ccw.a.c, ccw.a.a));
   }

   @Override
   public boolean b() {
      if (this.a.cW()) {
         return false;
      } else {
         this.b = this.a.f();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.g(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aJ() ? false : this.a.dX().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean c() {
      return !this.a.aJ();
   }

   @Override
   public void d() {
      fbx $$0 = this.a.dx();
      fbx $$1 = new fbx(this.b.dz() - this.a.dz(), 0.0, this.b.dF() - this.a.dF());
      if ($$1.h() > 1.0E-7) {
         $$1 = $$1.d().c(0.4).e($$0.c(0.2));
      }

      this.a.n($$1.d, (double)this.c, $$1.f);
   }
}
