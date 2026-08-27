import java.util.EnumSet;

public class brn extends brt {
   private final bla a;

   public brn(bla $$0) {
      this.a = $$0;
      this.a(EnumSet.of(brt.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aX() && this.a.b(arh.a) > this.a.de() || this.a.bl();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ef().i() < 0.8F) {
         this.a.K().a();
      }
   }
}
