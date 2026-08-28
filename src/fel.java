import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record fel(alg b) implements fen<MinecraftServer> {
   public static final MapCodec<fel> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("Name").forGetter(fel::b)).apply($$0, fel::new));

   public void a(MinecraftServer $$0, fep<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();
      $$3.a(this.b).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   @Override
   public MapCodec<fel> a() {
      return a;
   }
}
