import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class amx implements amg {
   public static final amg.a a = new amg.a("server_resource_pack");
   private final MinecraftServer.b b;

   public amx(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<wb<?>> $$0) {
      $$0.accept(new wj(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public amg.a a() {
      return a;
   }
}
