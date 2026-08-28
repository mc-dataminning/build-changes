import java.util.EnumSet;

public class cdu extends cea {
   private final bxg a;

   public cdu(bxg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cea.a.c));
      $$0.O().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(axh.a) > this.a.dp() || this.a.bw();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.N().a();
      }
   }
}
