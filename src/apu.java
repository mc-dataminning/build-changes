import net.minecraft.server.MinecraftServer;

public class apu implements agy {
   private final MinecraftServer a;
   private final uq b;

   public apu(MinecraftServer $$0, uq $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(agv $$0) {
      if ($$0.g() != agu.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ahh.a, new aqb(this.a, this.b, false));
         this.b.a(ahh.b);
      }
   }

   @Override
   public void a(vs $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
