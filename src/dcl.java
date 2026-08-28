import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dcl(alc d) implements dcb {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dcl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alc.a.fieldOf("function").forGetter(dcl::b)).apply($$0, dcl::new));

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      MinecraftServer $$5 = $$0.o();
      alr $$6 = $$5.aE();
      Optional<ih<et>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         et $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bR());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dcl> a() {
      return a;
   }

   public alc b() {
      return this.d;
   }
}
