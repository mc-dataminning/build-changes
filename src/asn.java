import java.util.Optional;
import java.util.function.Consumer;
import net.minecraft.server.MinecraftServer;

public class asn implements arv {
   public static final arv.a a = new arv.a("server_resource_pack");
   private final MinecraftServer.b b;

   public asn(MinecraftServer.b $$0) {
      this.b = $$0;
   }

   @Override
   public void a(Consumer<zw<?>> $$0) {
      $$0.accept(new aai(this.b.a(), this.b.b(), this.b.c(), this.b.d(), Optional.ofNullable(this.b.e())));
   }

   @Override
   public arv.a a() {
      return a;
   }
}
