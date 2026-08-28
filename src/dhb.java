import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dhb(alg d) implements dgr {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("function").forGetter(dhb::b)).apply($$0, dhb::new));

   @Override
   public void a(arq $$0, int $$1, dfz $$2, bwi $$3, ffc $$4) {
      MinecraftServer $$5 = $$0.p();
      alv $$6 = $$5.aE();
      Optional<hx<ej>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ej $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bS());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public alg b() {
      return this.d;
   }
}
