import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import net.minecraft.server.MinecraftServer;

public class ffe<C> {
   public static final ffe<MinecraftServer> a = new ffe<MinecraftServer>().a(alk.b("function"), ffb.a).a(alk.b("function_tag"), ffc.a);
   private final ayy.b<alk, MapCodec<? extends ffd<C>>> b = new ayy.b<>();
   private final Codec<ffd<C>> c = this.b.a(alk.a).dispatch("Type", ffd::a, Function.identity());

   public ffe<C> a(alk $$0, MapCodec<? extends ffd<C>> $$1) {
      this.b.a($$0, $$1);
      return this;
   }

   public Codec<ffd<C>> a() {
      return this.c;
   }
}
