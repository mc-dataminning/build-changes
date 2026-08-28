import net.minecraft.server.MinecraftServer;

public class asd implements aiw {
   private final MinecraftServer b;
   private final vx c;

   public asd(MinecraftServer $$0, vx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ait $$0) {
      if ($$0.g() != ais.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajf.b, new asl(this.b, this.c, false));
         this.c.a(ajf.d);
      }
   }

   @Override
   public void a(vz $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
