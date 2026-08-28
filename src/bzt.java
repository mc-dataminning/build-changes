import java.util.EnumSet;

public class bzt extends bzz {
   private final btd a;

   public bzt(btd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.c));
      $$0.K().a(true);
   }

   @Override
   public boolean a() {
      return this.a.bf() && this.a.b(awc.a) > this.a.dj() || this.a.bt();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.dT().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
