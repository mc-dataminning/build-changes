import net.minecraft.server.MinecraftServer;

public class alk implements adc {
   private final MinecraftServer a;
   private final sm b;

   public alk(MinecraftServer $$0, sm $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(adb $$0) {
      if ($$0.f() != ada.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(ada.b);
         this.b.a(new alr(this.a, this.b));
      }
   }

   @Override
   public void a(tl $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
