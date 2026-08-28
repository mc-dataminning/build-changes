import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record feg(alg b) implements fei<MinecraftServer> {
   public static final MapCodec<feg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("Name").forGetter(feg::b)).apply($$0, feg::new));

   public void a(MinecraftServer $$0, fek<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();
      $$3.a(this.b).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   @Override
   public MapCodec<feg> a() {
      return a;
   }
}
