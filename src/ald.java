import net.minecraft.server.MinecraftServer;

public class ald implements acx {
   private final MinecraftServer a;
   private final sg b;

   public ald(MinecraftServer $$0, sg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(acw $$0) {
      if ($$0.f() != acv.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(acv.b);
         this.b.a(new alk(this.a, this.b));
      }
   }

   @Override
   public void a(tf $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
