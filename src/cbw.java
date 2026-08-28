import java.util.EnumSet;

public class cbw extends ccc {
   private final bvg a;

   public cbw(bvg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ccc.a.c));
      $$0.P().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bl() && this.a.b(axj.a) > this.a.ds() || this.a.bz();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.eb().i() < 0.8F) {
         this.a.O().a();
      }
   }
}
