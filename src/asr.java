import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asr implements arx {
   public static final arx.a a = new arx.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asr(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zk<?>> $$0) {
      $$0.accept(new zx(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arx.a a() {
      return a;
   }
}
