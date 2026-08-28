import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dam(akk d) implements dac {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dam> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("function").forGetter(dam::b)).apply($$0, dam::new));

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      MinecraftServer $$5 = $$0.o();
      akz $$6 = $$5.aG();
      Optional<ic<eq>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         eq $$8 = $$5.aJ().a(2).a().a($$3).a($$0).a($$4).a($$3.bO());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public akk b() {
      return this.d;
   }
}
