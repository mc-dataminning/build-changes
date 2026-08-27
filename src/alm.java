import net.minecraft.server.MinecraftServer;

public class alm implements ade {
   private final MinecraftServer a;
   private final so b;

   public alm(MinecraftServer $$0, so $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(add $$0) {
      if ($$0.f() != adc.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(adc.b);
         this.b.a(new alt(this.a, this.b));
      }
   }

   @Override
   public void a(tn $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
