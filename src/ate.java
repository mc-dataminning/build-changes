import net.minecraft.server.MinecraftServer;

public class ate implements ajs {
   private final MinecraftServer b;
   private final wp c;

   public ate(MinecraftServer $$0, wp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ajp $$0) {
      if ($$0.g() != ajo.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(akb.b, new atm(this.b, this.c, false));
         this.c.a(akb.d);
      }
   }

   @Override
   public void a(wr $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
