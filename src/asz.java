import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asz implements asf {
   public static final asf.a a = new asf.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asz(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zd<?>> $$0) {
      $$0.accept(new zq(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public asf.a a() {
      return a;
   }
}
