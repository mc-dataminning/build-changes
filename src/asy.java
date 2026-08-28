import net.minecraft.server.MinecraftServer;

public class asy implements ajk {
   private final MinecraftServer b;
   private final vv c;

   public asy(MinecraftServer $$0, vv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ajh $$0) {
      if ($$0.g() != ajg.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajt.b, new atg(this.b, this.c, false));
         this.c.a(ajt.d);
      }
   }

   @Override
   public void a(vx $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
