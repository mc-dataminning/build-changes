import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ama implements alj {
   public static final alj.a a = new alj.a("server_resource_pack");
   private final MinecraftServer.b b;

   public ama(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<ve<?>> $$0) {
      $$0.accept(new vm(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public alj.a a() {
      return a;
   }
}
