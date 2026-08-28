import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class ffc<C> {
   public static final ffc<MinecraftServer> a = new ffc<MinecraftServer>().a(ali.b("function"), fez.a).a(ali.b("function_tag"), ffa.a);
   private final ayw.b<ali, MapCodec<? extends ffb<C>>> b = new ayw.b<>();
   private final Codec<ffb<C>> c = this.b.a(ali.a).dispatch("Type", ffb::a, Function.identity());

   public ffc<C> a(ali $$0, MapCodec<? extends ffb<C>> $$1) {
      this.b.a($$0, $$1);
      return this;
   }

   public Codec<ffb<C>> a() {
      return this.c;
   }
}
