import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class alq implements akz {
   public static final akz.a a = new akz.a("server_resource_pack");
   private final MinecraftServer.b b;

   public alq(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<ux<?>> $$0) {
      $$0.accept(new vf(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public akz.a a() {
      return a;
   }
}
