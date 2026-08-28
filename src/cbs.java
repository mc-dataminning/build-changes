import java.util.EnumSet;

public class cbs extends cby {
   private final bvc a;

   public cbs(bvc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cby.a.c));
      $$0.P().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bk() && this.a.b(axg.a) > this.a.dr() || this.a.by();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.ea().i() < 0.8F) {
         this.a.O().a();
      }
   }
}
