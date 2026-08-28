import java.util.EnumSet;

public class cdp extends cdv {
   private final bxb a;

   public cdp(bxb $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cdv.a.c));
      $$0.O().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bj() && this.a.b(axf.a) > this.a.dp() || this.a.bw();
   }

   @Override
   public boolean Q_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.N().a();
      }
   }
}
