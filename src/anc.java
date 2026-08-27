import net.minecraft.server.MinecraftServer;

public class anc implements aeq {
   private final MinecraftServer a;
   private final tw b;

   public anc(MinecraftServer $$0, tw $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(aep $$0) {
      if ($$0.f() != aeo.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(aeo.b);
         this.b.a(new anj(this.a, this.b));
      }
   }

   @Override
   public void a(uv $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
