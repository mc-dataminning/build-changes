import java.util.EnumSet;

public class cag extends cam {
   private final btp a;

   public cag(btp $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cam.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bf() && this.a.b(awk.a) > this.a.di() || this.a.bt();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dR().i() < 0.8F) {
         this.a.L().a();
      }
   }
}
