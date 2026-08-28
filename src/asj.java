import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asj implements arr {
   public static final arr.a a = new arr.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asj(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zs<?>> $$0) {
      $$0.accept(new aae(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arr.a a() {
      return a;
   }
}
