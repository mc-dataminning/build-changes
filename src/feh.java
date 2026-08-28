import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record feh(alg b) implements fei<MinecraftServer> {
   public static final MapCodec<feh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("Name").forGetter(feh::b)).apply($$0, feh::new));

   public void a(MinecraftServer $$0, fek<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();

      for (hx<ej> $$5 : $$3.b(this.b)) {
         $$3.a($$5, $$3.c());
      }
   }

   @Override
   public MapCodec<feh> a() {
      return a;
   }
}
