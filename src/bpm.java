import java.util.EnumSet;

public class bpm extends bps {
   private final biy a;

   public bpm(biy $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bps.a.c));
      $$0.H().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aX() && this.a.b(apo.a) > this.a.de() || this.a.bl();
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ee().i() < 0.8F) {
         this.a.F().a();
      }
   }
}
