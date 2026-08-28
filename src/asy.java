import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asy implements ase {
   public static final ase.a a = new ase.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asy(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zp<?>> $$0) {
      $$0.accept(new aac(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public ase.a a() {
      return a;
   }
}
