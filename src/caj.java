import java.util.EnumSet;

public class caj extends cap {
   private final btt a;

   public caj(btt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cap.a.c));
      $$0.K().a(true);
   }

   @Override
   public boolean a() {
      return this.a.be() && this.a.b(awv.a) > this.a.di() || this.a.bs();
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
