import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ast implements arz {
   public static final arz.a a = new arz.a("server_resource_pack");
   private final MinecraftServer.b b;

   public ast(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zl<?>> $$0) {
      $$0.accept(new zy(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arz.a a() {
      return a;
   }
}
