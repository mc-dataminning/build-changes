import net.minecraft.server.MinecraftServer;

public class ant implements afh {
   private final MinecraftServer a;
   private final ue b;

   public ant(MinecraftServer $$0, ue $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(afg $$0) {
      if ($$0.f() != aff.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(aff.b);
         this.b.a(new aoa(this.a, this.b));
      }
   }

   @Override
   public void a(vd $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
