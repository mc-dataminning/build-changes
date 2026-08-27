import net.minecraft.server.MinecraftServer;

public class any implements afl {
   private final MinecraftServer a;
   private final uh b;

   public any(MinecraftServer $$0, uh $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(afk $$0) {
      if ($$0.f() != afj.b) {
         throw new UnsupportedOperationException("Invalid intention " + $$0.f());
      } else {
         this.b.a(afj.b);
         this.b.a(new aof(this.a, this.b));
      }
   }

   @Override
   public void a(vg $$0) {
   }

   @Override
   public boolean c() {
      return this.b.k();
   }
}
