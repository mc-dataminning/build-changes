import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class alo implements akx {
   public static final akx.a a = new akx.a("server_resource_pack");
   private final MinecraftServer.b b;

   public alo(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<uw<?>> $$0) {
      $$0.accept(new ve(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public akx.a a() {
      return a;
   }
}
