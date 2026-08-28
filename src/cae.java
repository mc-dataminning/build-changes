import java.util.EnumSet;

public class cae extends cak {
   private final btn a;

   public cae(btn $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cak.a.c));
      $$0.J().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bf() && this.a.b(awj.a) > this.a.dj() || this.a.bt();
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dT().i() < 0.8F) {
         this.a.I().a();
      }
   }
}
