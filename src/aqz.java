import net.minecraft.server.MinecraftServer;

public class aqz implements aia {
   private final MinecraftServer a;
   private final vq b;

   public aqz(MinecraftServer $$0, vq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ahx $$0) {
      if ($$0.g() != ahw.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(aij.a, new arg(this.a, this.b, false));
         this.b.a(aij.b);
      }
   }

   @Override
   public void a(ws $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
