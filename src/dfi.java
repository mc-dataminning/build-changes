import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dfi(ald d) implements dey {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dfi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ald.a.fieldOf("function").forGetter(dfi::b)).apply($$0, dfi::new));

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      MinecraftServer $$5 = $$0.p();
      als $$6 = $$5.aE();
      Optional<im<ex>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ex $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dfi> a() {
      return a;
   }

   public ald b() {
      return this.d;
   }
}
