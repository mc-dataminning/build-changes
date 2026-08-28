import java.util.EnumSet;

public class bzu extends caa {
   private final bte a;

   public bzu(bte $$0) {
      this.a = $$0;
      this.a(EnumSet.of(caa.a.c));
      $$0.J().a(true);
   }

   @Override
   public boolean a() {
      return this.a.bg() && this.a.b(awc.a) > this.a.dk() || this.a.bu();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.dU().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
