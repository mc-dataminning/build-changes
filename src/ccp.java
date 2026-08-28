import java.util.EnumSet;

public class ccp extends ccv {
   private final bvz a;

   public ccp(bvz $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccv.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(axq.a) > this.a.dq() || this.a.bx();
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
