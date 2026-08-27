import net.minecraft.server.MinecraftServer;

public class aqp implements ahq {
   private final MinecraftServer a;
   private final vg b;

   public aqp(MinecraftServer $$0, vg $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ahn $$0) {
      if ($$0.g() != ahm.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ahz.a, new aqw(this.a, this.b, false));
         this.b.a(ahz.b);
      }
   }

   @Override
   public void a(wi $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
