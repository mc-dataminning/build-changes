import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ats implements asy {
   public static final asy.a a = new asy.a("server_resource_pack");
   private final MinecraftServer.b b;

   public ats(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<aac<?>> $$0) {
      $$0.accept(new aap(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public asy.a a() {
      return a;
   }
}
