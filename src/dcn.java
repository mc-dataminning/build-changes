import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dcn(alh d) implements dcd {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alh.a.fieldOf("function").forGetter(dcn::b)).apply($$0, dcn::new));

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      MinecraftServer $$5 = $$0.o();
      alw $$6 = $$5.aE();
      Optional<ij<ev>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ev $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bV());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dcn> a() {
      return a;
   }

   public alh b() {
      return this.d;
   }
}
