import net.minecraft.server.MinecraftServer;

public class arw implements aiw {
   private final MinecraftServer a;
   private final wj b;

   public arw(MinecraftServer $$0, wj $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(ait $$0) {
      if ($$0.g() != ais.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.g());
      } else {
         this.b.a(ajf.a, new asd(this.a, this.b, false));
         this.b.a(ajf.b);
      }
   }

   @Override
   public void a(xl $$0) {
   }

   @Override
   public boolean c() {
      return this.b.i();
   }
}
