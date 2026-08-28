import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class fej<C> {
   public static final fej<MinecraftServer> a = new fej<MinecraftServer>().a(alg.b("function"), feg.a).a(alg.b("function_tag"), feh.a);
   private final ayu.b<alg, MapCodec<? extends fei<C>>> b = new ayu.b<>();
   private final Codec<fei<C>> c = this.b.a(alg.a).dispatch("Type", fei::a, Function.identity());

   public fej<C> a(alg $$0, MapCodec<? extends fei<C>> $$1) {
      this.b.a($$0, $$1);
      return this;
   }

   public Codec<fei<C>> a() {
      return this.c;
   }
}
