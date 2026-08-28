import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dco(ale d) implements dce {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("function").forGetter(dco::b)).apply($$0, dco::new));

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      MinecraftServer $$5 = $$0.o();
      alt $$6 = $$5.aE();
      Optional<ii<eu>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         eu $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bR());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   public ale b() {
      return this.d;
   }
}
