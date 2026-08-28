import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dgr(alg d) implements dgh {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dgr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("function").forGetter(dgr::b)).apply($$0, dgr::new));

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      MinecraftServer $$5 = $$0.p();
      alv $$6 = $$5.aE();
      Optional<hw<ei>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ei $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   public alg b() {
      return this.d;
   }
}
