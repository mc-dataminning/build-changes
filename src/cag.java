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
      return this.a.bf() && this.a.b(awk.a) > this.a.dj() || this.a.bt();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dS().i() < 0.8F) {
         this.a.L().a();
      }
   }
}
