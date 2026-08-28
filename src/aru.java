import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aru implements arc {
   public static final arc.a a = new arc.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aru(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zb<?>> $$0) {
      $$0.accept(new zn(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arc.a a() {
      return a;
   }
}
