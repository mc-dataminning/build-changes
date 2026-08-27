import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aly implements alh {
   public static final alh.a a = new alh.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aly(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<vd<?>> $$0) {
      $$0.accept(new vl(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public alh.a a() {
      return a;
   }
}
