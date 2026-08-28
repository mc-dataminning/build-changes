import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record fem(alg b) implements fen<MinecraftServer> {
   public static final MapCodec<fem> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("Name").forGetter(fem::b)).apply($$0, fem::new));

   public void a(MinecraftServer $$0, fep<MinecraftServer> $$1, long $$2) {
      alv $$3 = $$0.aE();

      for (hx<ej> $$5 : $$3.b(this.b)) {
         $$3.a($$5, $$3.c());
      }
   }

   @Override
   public MapCodec<fem> a() {
      return a;
   }
}
