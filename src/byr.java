import java.util.EnumSet;

public class byr extends byx {
   private final bsc a;

   public byr(bsc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byx.a.c));
      $$0.K().a(true);
   }

   @Override
   public boolean a() {
      return this.a.bc() && this.a.b(avw.a) > this.a.dg() || this.a.bq();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ej().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
