import net.minecraft.server.MinecraftServer;

public class aqn implements aho {
   private final MinecraftServer a;
   private final ve b;

   public aqn(MinecraftServer $$0, ve $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ahl $$0) {
      if ($$0.g() != ahk.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ahx.a, new aqu(this.a, this.b, false));
         this.b.a(ahx.b);
      }
   }

   @Override
   public void a(wg $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
