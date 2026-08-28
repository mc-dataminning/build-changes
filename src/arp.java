import net.minecraft.server.MinecraftServer;

public class arp implements aim {
   private final MinecraftServer b;
   private final vt c;

   public arp(MinecraftServer $$0, vt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aij $$0) {
      if ($$0.g() != aii.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aiv.b, new arw(this.b, this.c, false));
         this.c.a(aiv.d);
      }
   }

   @Override
   public void a(vv $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
