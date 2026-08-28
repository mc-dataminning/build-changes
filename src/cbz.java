import java.util.EnumSet;

public class cbz extends ccf {
   private final bvj a;

   public cbz(bvj $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccf.a.c));
      $$0.L().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(axi.a) > this.a.dp() || this.a.bx();
   }

   @Override
   public boolean T_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.J().a();
      }
   }
}
