import java.util.EnumSet;

public class cab extends cam {
   private final btq a;
   private final dbx b;

   public cab(btq $$0, dbx $$1) {
      this.a = $$0;
      this.b = $$1;
      this.a(EnumSet.of(cam.a.c));
   }

   @Override
   public boolean a() {
      boolean $$0 = this.a.aC || this.a.aB;
      if ($$0 && this.a.ak().a(aws.h)) {
         iz $$1 = this.a.dp().c();
         dsb $$2 = this.b.a_($$1);
         return $$2.a(dfa.qP) || $$2.k(this.b, $$1) == ewg.a();
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
