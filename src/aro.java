import net.minecraft.server.MinecraftServer;

public class aro implements ail {
   private final MinecraftServer b;
   private final vs c;

   public aro(MinecraftServer $$0, vs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(aii $$0) {
      if ($$0.g() != aih.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.c.a(aiu.a, new arv(this.b, this.c, false));
         this.c.a(aiu.b);
      }
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }
}
