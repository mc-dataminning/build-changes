import java.util.EnumSet;

public class bpv extends bqb {
   private final bji a;

   public bpv(bji $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqb.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aX() && this.a.b(apy.a) > this.a.de() || this.a.bl();
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
