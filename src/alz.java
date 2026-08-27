import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class alz implements ali {
   public static final ali.a a = new ali.a("server_resource_pack");
   private final MinecraftServer.b b;

   public alz(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<vf<?>> $$0) {
      $$0.accept(new vn(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public ali.a a() {
      return a;
   }
}
