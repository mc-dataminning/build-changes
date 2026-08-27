import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aok implements ant {
   public static final ant.a a = new ant.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aok(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<xf<?>> $$0) {
      $$0.accept(new xo(this.b.a(), this.b.b(), this.b.c(), this.b.d(), this.b.e()));
   }

   @Override
   public ant.a a() {
      return a;
   }
}
