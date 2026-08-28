import java.util.EnumSet;

public class cbx extends ccd {
   private final bvh a;

   public cbx(bvh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccd.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(awu.a) > this.a.dq() || this.a.bx();
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
