import java.util.EnumSet;

public class bvo extends bvu {
   private final boz a;

   public bvo(boz $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvu.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aZ() && this.a.b(auj.a) > this.a.dc() || this.a.bn();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ef().i() < 0.8F) {
         this.a.M().a();
      }
   }
}
