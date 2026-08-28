import java.util.EnumSet;

public class bzl extends bzw {
   private final bta a;
   private final dcd b;

   public bzl(bta $$0, dcd $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(bzw.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(avy.h)) {
         ja $$1 = this.a.dp().c();
         dsh $$2 = this.b.a_($$1);
         return $$2.a(dfh.qP) || $$2.k(this.b, $$1) == ewp.a();
      } else {
         return false;
      }
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      this.a.I().a();
   }
}
