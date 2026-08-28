import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class atm implements ass {
   public static final ass.a a = new ass.a("server_resource_pack");
   private final MinecraftServer.b b;

   public atm(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zo<?>> $$0) {
      $$0.accept(new aad(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public ass.a a() {
      return a;
   }
}
