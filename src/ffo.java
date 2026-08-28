import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class ffo<C> {
   public static final ffo<MinecraftServer> a = new ffo<MinecraftServer>().a(alr.b("function"), ffl.a).a(alr.b("function_tag"), ffm.a);
   private final azg.b<alr, MapCodec<? extends ffn<C>>> b = new azg.b<>();
   private final Codec<ffn<C>> c = this.b.a(alr.a).dispatch("Type", ffn::a, Function.identity());

   public ffo<C> a(alr $$0, MapCodec<? extends ffn<C>> $$1) {
      this.b.a($$0, $$1);
      return this;
   }

   public Codec<ffn<C>> a() {
      return this.c;
   }
}
