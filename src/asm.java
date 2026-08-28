import net.minecraft.server.MinecraftServer;

public class asm implements ajc {
   private final MinecraftServer b;
   private final wd c;

   public asm(MinecraftServer $$0, wd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aiz $$0) {
      if ($$0.g() != aiy.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(ajl.b, new asu(this.b, this.c, false));
         this.c.a(ajl.d);
      }
   }

   @Override
   public void a(wf $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
