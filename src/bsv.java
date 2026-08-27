import java.util.EnumSet;

public class bsv extends btb {
   private final bmh a;

   public bsv(bmh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(btb.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aZ() && this.a.b(asg.a) > this.a.df() || this.a.bn();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.eg().i() < 0.8F) {
         this.a.M().a();
      }
   }
}
