import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record daj(akk d) implements czz {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<daj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("function").forGetter(daj::b)).apply($$0, daj::new));

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      MinecraftServer $$5 = $$0.o();
      akz $$6 = $$5.aF();
      Optional<ic<eq>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         eq $$8 = $$5.aI().a(2).a().a($$3).a($$4);
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<daj> a() {
      return a;
   }

   public akk b() {
      return this.d;
   }
}
