import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aol implements anu {
   public static final anu.a a = new anu.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aol(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<xg<?>> $$0) {
      $$0.accept(new xp(this.b.a(), this.b.b(), this.b.c(), this.b.d(), this.b.e()));
   }

   @Override
   public anu.a a() {
      return a;
   }
}
