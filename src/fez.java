import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record fez(ali b) implements ffb<MinecraftServer> {
   public static final MapCodec<fez> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("Name").forGetter(fez::b)).apply($$0, fez::new));

   public void a(MinecraftServer $$0, ffd<MinecraftServer> $$1, long $$2) {
      alx $$3 = $$0.aE();
      $$3.a(this.b).ifPresent($$1x -> $$3.a($$1x, $$3.c()));
   }

   @Override
   public MapCodec<fez> a() {
      return a;
   }
}
