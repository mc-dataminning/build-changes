import net.minecraft.server.MinecraftServer;

public class apz implements ahc {
   private final MinecraftServer a;
   private final us b;

   public apz(MinecraftServer $$0, us $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(agz $$0) {
      if ($$0.g() != agy.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ahl.a, new aqg(this.a, this.b, false));
         this.b.a(ahl.b);
      }
   }

   @Override
   public void a(vu $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
