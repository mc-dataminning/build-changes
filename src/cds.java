import java.util.EnumSet;

public class cds extends cdy {
   private final bxe a;

   public cds(bxe $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdy.a.c));
      $$0.O().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(axh.a) > this.a.dp() || this.a.bw();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.N().a();
      }
   }
}
