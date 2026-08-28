import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asq implements arw {
   public static final arw.a a = new arw.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asq(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zk<?>> $$0) {
      $$0.accept(new zx(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arw.a a() {
      return a;
   }
}
