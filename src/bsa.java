import java.util.EnumSet;

public class bsa extends bsg {
   private final bln a;

   public bsa(bln $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bsg.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aZ() && this.a.b(arp.a) > this.a.dg() || this.a.bn();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.eh().i() < 0.8F) {
         this.a.M().a();
      }
   }
}
