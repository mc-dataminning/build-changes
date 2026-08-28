import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record ffc(alk b) implements ffd<MinecraftServer> {
   public static final MapCodec<ffc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("Name").forGetter(ffc::b)).apply($$0, ffc::new));

   public void a(MinecraftServer $$0, fff<MinecraftServer> $$1, long $$2) {
      alz $$3 = $$0.aE();

      for (hy<ek> $$5 : $$3.b(this.b)) {
         $$3.a($$5, $$3.c());
      }
   }

   @Override
   public MapCodec<ffc> a() {
      return a;
   }
}
