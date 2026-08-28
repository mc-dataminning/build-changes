import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record der(alp d) implements deh {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alp.a.fieldOf("function").forGetter(der::b)).apply($$0, der::new));

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      MinecraftServer $$5 = $$0.p();
      ame $$6 = $$5.aE();
      Optional<ik<ew>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ew $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public alp b() {
      return this.d;
   }
}
