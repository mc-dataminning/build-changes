import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dgg(ale d) implements dfw {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dgg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("function").forGetter(dgg::b)).apply($$0, dgg::new));

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      MinecraftServer $$5 = $$0.p();
      alt $$6 = $$5.aE();
      Optional<hw<ei>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ei $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   public ale b() {
      return this.d;
   }
}
