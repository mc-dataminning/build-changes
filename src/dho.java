import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dho(alk d) implements dhe {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dho> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("function").forGetter(dho::b)).apply($$0, dho::new));

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      MinecraftServer $$5 = $$0.p();
      alz $$6 = $$5.aE();
      Optional<hy<ek>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ek $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bT());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dho> a() {
      return a;
   }

   public alk b() {
      return this.d;
   }
}
