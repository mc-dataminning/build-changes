import net.minecraft.server.MinecraftServer;

public class asa implements aja {
   private final MinecraftServer b;
   private final wk c;

   public asa(MinecraftServer $$0, wk $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aix $$0) {
      if ($$0.g() != aiw.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajj.a, new ash(this.b, this.c, false));
         this.c.a(ajj.b);
      }
   }

   @Override
   public void a(xp $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
