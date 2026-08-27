import net.minecraft.server.MinecraftServer;

public class apq implements agu {
   private final MinecraftServer a;
   private final uo b;

   public apq(MinecraftServer $$0, uo $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(agr $$0) {
      if ($$0.g() != agq.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ahd.a, new apx(this.a, this.b, false));
         this.b.a(ahd.b);
      }
   }

   @Override
   public void a(vq $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
