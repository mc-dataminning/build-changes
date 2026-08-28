import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class feo<C> {
   public static final feo<MinecraftServer> a = new feo<MinecraftServer>().a(alg.b("function"), fel.a).a(alg.b("function_tag"), fem.a);
   private final ayu.b<alg, MapCodec<? extends fen<C>>> b = new ayu.b<>();
   private final Codec<fen<C>> c = this.b.a(alg.a).dispatch("Type", fen::a, Function.identity());

   public feo<C> a(alg $$0, MapCodec<? extends fen<C>> $$1) {
      this.b.a($$0, $$1);
      return this;
   }

   public Codec<fen<C>> a() {
      return this.c;
   }
}
