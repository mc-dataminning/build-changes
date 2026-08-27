import java.util.EnumSet;

public class bzg extends bzm {
   private final bsq a;

   public bzg(bsq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.c));
      $$0.K().a(true);
   }

   @Override
   public boolean a() {
      return this.a.be() && this.a.b(awb.a) > this.a.di() || this.a.bs();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.el().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
