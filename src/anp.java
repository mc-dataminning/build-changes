import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class anp implements amy {
   public static final amy.a a = new amy.a("server_resource_pack");
   private final MinecraftServer.b b;

   public anp(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<wo<?>> $$0) {
      $$0.accept(new ww(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public amy.a a() {
      return a;
   }
}
