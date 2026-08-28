import java.util.EnumSet;

public class cca extends ccg {
   private final bvk a;

   public cca(bvk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccg.a.c));
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
