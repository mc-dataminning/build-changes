import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dcx(all d) implements dcn {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dcx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(all.a.fieldOf("function").forGetter(dcx::b)).apply($$0, dcx::new));

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      MinecraftServer $$5 = $$0.o();
      ama $$6 = $$5.aE();
      Optional<ik<ew>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ew $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bW());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public all b() {
      return this.d;
   }
}
