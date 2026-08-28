import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record des(alz d) implements dei {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<des> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alz.a.fieldOf("function").forGetter(des::b)).apply($$0, des::new));

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      MinecraftServer $$5 = $$0.p();
      amo $$6 = $$5.aE();
      Optional<ik<ew>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ew $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public alz b() {
      return this.d;
   }
}
