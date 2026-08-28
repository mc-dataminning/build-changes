import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class ata implements asg {
   public static final asg.a a = new asg.a("server_resource_pack");
   private final MinecraftServer.b b;

   public ata(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zq<?>> $$0) {
      $$0.accept(new aad(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public asg.a a() {
      return a;
   }
}
