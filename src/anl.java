import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class anl implements amu {
   public static final amu.a a = new amu.a("server_resource_pack");
   private final MinecraftServer.b b;

   public anl(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<wk<?>> $$0) {
      $$0.accept(new ws(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public amu.a a() {
      return a;
   }
}
