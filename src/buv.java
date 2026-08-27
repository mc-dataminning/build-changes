import java.util.EnumSet;

public class buv extends bvb {
   private final boi a;

   public buv(boi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvb.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aZ() && this.a.b(aue.a) > this.a.df() || this.a.bn();
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
