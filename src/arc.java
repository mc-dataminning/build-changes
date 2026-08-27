import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class arc implements aqk {
   public static final aqk.a a = new aqk.a("server_resource_pack");
   private final MinecraftServer.b b;

   public arc(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<yp<?>> $$0) {
      $$0.accept(new zb(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aqk.a a() {
      return a;
   }
}
