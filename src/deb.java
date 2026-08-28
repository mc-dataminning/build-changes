import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record deb(akv d) implements ddr {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<deb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akv.a.fieldOf("function").forGetter(deb::b)).apply($$0, deb::new));

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      MinecraftServer $$5 = $$0.p();
      alk $$6 = $$5.aE();
      Optional<il<ex>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ex $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bU());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<deb> a() {
      return a;
   }

   public akv b() {
      return this.d;
   }
}
