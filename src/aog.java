import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aog implements anp {
   public static final anp.a a = new anp.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aog(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<xd<?>> $$0) {
      $$0.accept(new xl(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public anp.a a() {
      return a;
   }
}
