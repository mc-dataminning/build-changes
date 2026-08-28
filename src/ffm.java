import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record ffm(alr b) implements ffn<MinecraftServer> {
   public static final MapCodec<ffm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alr.a.fieldOf("Name").forGetter(ffm::b)).apply($$0, ffm::new));

   public void a(MinecraftServer $$0, ffp<MinecraftServer> $$1, long $$2) {
      amg $$3 = $$0.aE();

      for (hy<ek> $$5 : $$3.b(this.b)) {
         $$3.a($$5, $$3.c());
      }
   }

   @Override
   public MapCodec<ffm> a() {
      return a;
   }
}
