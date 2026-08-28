import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dbx(alb d) implements dbn {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dbx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("function").forGetter(dbx::b)).apply($$0, dbx::new));

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      MinecraftServer $$5 = $$0.o();
      alq $$6 = $$5.aE();
      Optional<ih<et>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         et $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bR());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public alb b() {
      return this.d;
   }
}
