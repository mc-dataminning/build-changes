import java.util.EnumSet;

public class bqb extends bqh {
   private final bjo a;

   public bqb(bjo $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqh.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aX() && this.a.b(aqa.a) > this.a.de() || this.a.bl();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ef().i() < 0.8F) {
         this.a.K().a();
      }
   }
}
