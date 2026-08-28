import java.util.EnumSet;

public class cct extends ccz {
   private final bwd a;

   public cct(bwd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccz.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(aya.a) > this.a.dp() || this.a.bx();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.J().a();
      }
   }
}
