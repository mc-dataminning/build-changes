import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class anh implements amq {
   public static final amq.a a = new amq.a("server_resource_pack");
   private final MinecraftServer.b b;

   public anh(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<wk<?>> $$0) {
      $$0.accept(new ws(this.b.a(), this.b.b(), this.b.c(), this.b.d()));
   }

   @Override
   public amq.a a() {
      return a;
   }
}
