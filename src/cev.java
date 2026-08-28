import java.util.EnumSet;

public class cev extends cfb {
   private final byh a;

   public cev(byh $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cfb.a.c));
      $$0.N().a(true);
   }

   @Override
   public boolean b() {
      return this.a.bi() && this.a.b(axs.a) > this.a.dp() || this.a.bv();
   }

   @Override
   public boolean W_() {
      return true;
   }

   @Override
   public void a() {
      if (this.a.dY().i() < 0.8F) {
         this.a.M().a();
      }
   }
}
