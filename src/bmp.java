import java.util.EnumSet;

public class bmp extends bmv {
   private final bgb a;

   public bmp(bgb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.c));
      $$0.J().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aV() && this.a.b(anb.a) > this.a.dc() || this.a.bi();
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ec().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
