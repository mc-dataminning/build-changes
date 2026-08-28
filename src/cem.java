import java.util.EnumSet;

public class cem extends ces {
   private final bxy a;

   public cem(bxy $$0) {
      this.a = $$0;
      this.a(EnumSet.of(ces.a.c));
      $$0.O().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bi() && this.a.b(axl.a) > this.a.dp() || this.a.bv();
   }

   @Override
   public boolean V_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.N().a();
      }
   }
}
