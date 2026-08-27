import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class arp implements aqx {
   public static final aqx.a a = new aqx.a("server_resource_pack");
   private final MinecraftServer.b b;

   public arp(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zb<?>> $$0) {
      $$0.accept(new zn(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aqx.a a() {
      return a;
   }
}
