import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class arm implements aqu {
   public static final aqu.a a = new aqu.a("server_resource_pack");
   private final MinecraftServer.b b;

   public arm(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<yz<?>> $$0) {
      $$0.accept(new zl(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public aqu.a a() {
      return a;
   }
}
