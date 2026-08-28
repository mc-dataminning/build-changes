import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record ffb(alk b) implements ffd<MinecraftServer> {
   public static final MapCodec<ffb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("Name").forGetter(ffb::b)).apply($$0, ffb::new));

   public void a(MinecraftServer $$0, fff<MinecraftServer> $$1, long $$2) {
      alz $$3 = $$0.aE();
      $$3.a(this.b).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   @Override
   public MapCodec<ffb> a() {
      return a;
   }
}
