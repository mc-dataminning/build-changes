import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class alt implements alc {
   public static final alc.a a = new alc.a("server_resource_pack");
   private final MinecraftServer.b b;

   public alt(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<va<?>> $$0) {
      $$0.accept(new vi(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public alc.a a() {
      return a;
   }
}
