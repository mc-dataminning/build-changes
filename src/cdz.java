import java.util.EnumSet;

public class cdz extends cef {
   private final bxl a;

   public cdz(bxl $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cef.a.c));
      $$0.O().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bh() && this.a.b(axh.a) > this.a.do() || this.a.bu();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dX().i() < 0.8F) {
         this.a.N().a();
      }
   }
}
