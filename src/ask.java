import net.minecraft.server.MinecraftServer;

public class ask implements aiw {
   private final MinecraftServer b;
   private final vo c;

   public ask(MinecraftServer $$0, vo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ait $$0) {
      if ($$0.g() != ais.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajf.b, new ass(this.b, this.c, false));
         this.c.a(ajf.d);
      }
   }

   @Override
   public void a(vq $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
