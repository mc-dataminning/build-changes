import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class alx implements alg {
   public static final alg.a a = new alg.a("server_resource_pack");
   private final MinecraftServer.b b;

   public alx(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<vd<?>> $$0) {
      $$0.accept(new vl(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public alg.a a() {
      return a;
   }
}
