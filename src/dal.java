import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dal(akk d) implements dab {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dal> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("function").forGetter(dal::b)).apply($$0, dal::new));

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      MinecraftServer $$5 = $$0.o();
      akz $$6 = $$5.aG();
      Optional<ic<eq>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         eq $$8 = $$5.aJ().a(2).a().a($$3).a($$0).a($$4).a($$3.bN());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   public akk b() {
      return this.d;
   }
}
