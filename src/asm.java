import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asm implements aru {
   public static final aru.a a = new aru.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asm(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zv<?>> $$0) {
      $$0.accept(new aah(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aru.a a() {
      return a;
   }
}
