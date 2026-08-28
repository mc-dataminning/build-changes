import java.util.EnumSet;

public class cby extends cce {
   private final bvi a;

   public cby(bvi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cce.a.c));
      $$0.P().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(awv.a) > this.a.dp() || this.a.bx();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.O().a();
      }
   }
}
