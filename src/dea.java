import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dea(aku d) implements ddq {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dea> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aku.a.fieldOf("function").forGetter(dea::b)).apply($$0, dea::new));

   @Override
   public void a(arc $$0, int $$1, dcy $$2, buk $$3, fba $$4) {
      MinecraftServer $$5 = $$0.p();
      alj $$6 = $$5.aE();
      Optional<il<ex>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ex $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dea> a() {
      return a;
   }

   public aku b() {
      return this.d;
   }
}
