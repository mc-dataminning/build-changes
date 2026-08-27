import java.util.EnumSet;

public class bpq extends bpw {
   private final bjd a;

   public bpq(bjd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpw.a.c));
      $$0.H().a(true);
   }

   @Override
   public boolean a() {
      return this.a.aX() && this.a.b(apt.a) > this.a.de() || this.a.bl();
   }

   @Override
   public boolean K_() {
      return true;
   }

   @Override
   public void e() {
      if (this.a.ee().i() < 0.8F) {
         this.a.F().a();
      }
   }
}
