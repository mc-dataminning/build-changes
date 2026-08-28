import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asc implements ark {
   public static final ark.a a = new ark.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asc(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zg<?>> $$0) {
      $$0.accept(new zt(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public ark.a a() {
      return a;
   }
}
