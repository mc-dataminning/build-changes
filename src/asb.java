import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asb implements arj {
   public static final arj.a a = new arj.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asb(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zl<?>> $$0) {
      $$0.accept(new zx(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arj.a a() {
      return a;
   }
}
