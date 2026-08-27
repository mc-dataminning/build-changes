import net.minecraft.server.MinecraftServer;

public class aiw implements abc {
   private final MinecraftServer a;
   private final sd b;

   public aiw(MinecraftServer $$0, sd $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public void a(abb $$0) {
      this.b.a($$0.a());
      this.b.a(new aja(this.a, this.b));
   }

   @Override
   public void a(sw $$0) {
   }

   @Override
   public boolean a() {
      return this.b.h();
   }
}
