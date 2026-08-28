import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dhm(ali d) implements dhc {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dhm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("function").forGetter(dhm::b)).apply($$0, dhm::new));

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      MinecraftServer $$5 = $$0.p();
      alx $$6 = $$5.aE();
      Optional<hx<ej>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ej $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bT());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public ali b() {
      return this.d;
   }
}
