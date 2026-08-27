import net.minecraft.server.MinecraftServer;

public class amy implements aem {
   private final MinecraftServer a;
   private final ts b;

   public amy(MinecraftServer $$0, ts $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ael $$0) {
      if ($$0.f() != aek.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(aek.b);
         this.b.a(new anf(this.a, this.b));
      }
   }

   @Override
   public void a(ur $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
