import net.minecraft.server.MinecraftServer;

public class arh implements aih {
   private final MinecraftServer a;
   private final vv b;

   public arh(MinecraftServer $$0, vv $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(aie $$0) {
      if ($$0.g() != aid.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(aiq.a, new aro(this.a, this.b, false));
         this.b.a(aiq.b);
      }
   }

   @Override
   public void a(wx $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
