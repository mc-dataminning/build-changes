import net.minecraft.server.MinecraftServer;

public class arc implements aic {
   private final MinecraftServer a;
   private final vs b;

   public arc(MinecraftServer $$0, vs $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ahz $$0) {
      if ($$0.g() != ahy.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ail.a, new arj(this.a, this.b, false));
         this.b.a(ail.b);
      }
   }

   @Override
   public void a(wu $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
