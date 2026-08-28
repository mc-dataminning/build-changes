import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.server.MinecraftServer;

public record ffa(ali b) implements ffb<MinecraftServer> {
   public static final MapCodec<ffa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("Name").forGetter(ffa::b)).apply($$0, ffa::new));

   public void a(MinecraftServer $$0, ffd<MinecraftServer> $$1, long $$2) {
      alx $$3 = $$0.aE();

      for (hx<ej> $$5 : $$3.b(this.b)) {
         $$3.a($$5, $$3.c());
      }
   }

   @Override
   public MapCodec<ffa> a() {
      return a;
   }
}
