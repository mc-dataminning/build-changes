import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class arv implements ard {
   public static final ard.a a = new ard.a("server_resource_pack");
   private final MinecraftServer.b b;

   public arv(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<ze<?>> $$0) {
      $$0.accept(new zq(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public ard.a a() {
      return a;
   }
}
