import java.util.EnumSet;

public class bth extends btb {
   private final bmh a;
   private bmf b;
   private final float c;

   public bth(bmh $$0, float $$1) {
      this.a = $$0;
      this.c = $$1;
      this.a(EnumSet.of(btb.a.c, btb.a.a));
   }

   @Override
   public boolean a() {
      if (this.a.cO()) {
         return false;
      } else {
         this.b = this.a.q();
         if (this.b == null) {
            return false;
         } else {
            double $$0 = this.a.f(this.b);
            if ($$0 < 4.0 || $$0 > 16.0) {
               return false;
            } else {
               return !this.a.aC() ? false : this.a.eg().a(b(5)) == 0;
            }
         }
      }
   }

   @Override
   public boolean b() {
      return !this.a.aC();
   }

   @Override
   public void c() {
      elm $$0 = this.a.dp();
      elm $$1 = new elm(this.b.dr() - this.a.dr(), 0.0, this.b.dx() - this.a.dx());
      if ($$1.g() > 1.0E-7) {
         $$1 = $$1.d().a(0.4).e($$0.a(0.2));
      }

      this.a.o($$1.c, (double)this.c, $$1.e);
   }
}
