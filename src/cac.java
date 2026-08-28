import java.util.EnumSet;

public class cac extends cai {
   private final btm a;

   public cac(btm $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cai.a.c));
      $$0.K().a(true);
   }

   @Override
   public boolean a() {
      return this.a.be() && this.a.b(awr.a) > this.a.di() || this.a.bs();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.el().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
