import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aqc implements apl {
   public static final apl.a a = new apl.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aqc(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<xx<?>> $$0) {
      $$0.accept(new yj(this.b.a(), this.b.b(), this.b.c(), this.b.d(), this.b.e()));
   }

   @Override
   public apl.a a() {
      return a;
   }
}
