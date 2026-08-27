import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ara implements aqi {
   public static final aqi.a a = new aqi.a("server_resource_pack");
   private final MinecraftServer.b b;

   public ara(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<yn<?>> $$0) {
      $$0.accept(new yz(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aqi.a a() {
      return a;
   }
}
