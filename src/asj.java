import net.minecraft.server.MinecraftServer;

public class asj implements aja {
   private final MinecraftServer b;
   private final wb c;

   public asj(MinecraftServer $$0, wb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aix $$0) {
      if ($$0.g() != aiw.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajj.b, new asr(this.b, this.c, false));
         this.c.a(ajj.d);
      }
   }

   @Override
   public void a(wd $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
