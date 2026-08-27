import java.util.EnumSet;

public class bwf extends bwl {
   private final bpq a;

   public bwf(bpq $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bwl.a.c));
      $$0.K().a(true);
   }

   @Override
   public boolean a() {
      return this.a.bc() && this.a.b(aus.a) > this.a.df() || this.a.bq();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ei().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
