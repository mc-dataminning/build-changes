import java.util.EnumSet;

public class cby extends cce {
   private final bvi a;

   public cby(bvi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cce.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(awv.a) > this.a.dq() || this.a.bx();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dZ().i() < 0.8F) {
         this.a.J().a();
      }
   }
}
