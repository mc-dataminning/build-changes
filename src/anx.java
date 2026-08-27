import net.minecraft.server.MinecraftServer;

public class anx implements afk {
   private final MinecraftServer a;
   private final ug b;

   public anx(MinecraftServer $$0, ug $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(afj $$0) {
      if ($$0.f() != afi.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(afi.b);
         this.b.a(new aoe(this.a, this.b));
      }
   }

   @Override
   public void a(vf $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
