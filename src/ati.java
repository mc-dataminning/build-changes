import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ati implements aso {
   public static final aso.a a = new aso.a("server_resource_pack");
   private final MinecraftServer.b b;

   public ati(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zr<?>> $$0) {
      $$0.accept(new aae(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aso.a a() {
      return a;
   }
}
