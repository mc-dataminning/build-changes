import java.util.EnumSet;

public class brv extends bsb {
   private final bli a;

   public brv(bli $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsb.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aZ() && this.a.b(arl.a) > this.a.dg() || this.a.bn();
   }

   @Override
   public boolean S_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.eh().i() < 0.8F) {
         this.a.M().a();
      }
   }
}
