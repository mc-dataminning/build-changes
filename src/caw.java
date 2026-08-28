import java.util.EnumSet;

public class caw extends cbc {
   private final buh a;

   public caw(buh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.c));
      $$0.P().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bi() && this.a.b(awy.a) > this.a.dm() || this.a.bw();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dV().i() < 0.8F) {
         this.a.O().a();
      }
   }
}
