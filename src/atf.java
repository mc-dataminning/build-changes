import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class atf implements asl {
   public static final asl.a a = new asl.a("server_resource_pack");
   private final MinecraftServer.b b;

   public atf(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zj<?>> $$0) {
      $$0.accept(new zw(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public asl.a a() {
      return a;
   }
}
