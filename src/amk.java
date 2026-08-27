import net.minecraft.server.MinecraftServer;

public class amk implements aea {
   private final MinecraftServer a;
   private final tj b;

   public amk(MinecraftServer $$0, tj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(adz $$0) {
      if ($$0.f() != ady.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(ady.b);
         this.b.a(new amr(this.a, this.b));
      }
   }

   @Override
   public void a(ui $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
