import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class aqh implements apq {
   public static final apq.a a = new apq.a("server_resource_pack");
   private final MinecraftServer.b b;

   public aqh(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<xz<?>> $$0) {
      $$0.accept(new yl(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public apq.a a() {
      return a;
   }
}
