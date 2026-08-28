import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class atb implements ash {
   public static final ash.a a = new ash.a("server_resource_pack");
   private final MinecraftServer.b b;

   public atb(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zf<?>> $$0) {
      $$0.accept(new zs(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public ash.a a() {
      return a;
   }
}
