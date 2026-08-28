import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record ffl(alr b) implements ffn<MinecraftServer> {
   public static final MapCodec<ffl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alr.a.fieldOf("Name").forGetter(ffl::b)).apply($$0, ffl::new));

   public void a(MinecraftServer $$0, ffp<MinecraftServer> $$1, long $$2) {
      amg $$3 = $$0.aE();
      $$3.a(this.b).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   @Override
   public MapCodec<ffl> a() {
      return a;
   }
}
