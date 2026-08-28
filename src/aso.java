import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aso implements aru {
   public static final aru.a a = new aru.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aso(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<yw<?>> $$0) {
      $$0.accept(new zj(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aru.a a() {
      return a;
   }
}
