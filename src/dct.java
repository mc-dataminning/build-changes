import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dct(ali d) implements dcj {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dct> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("function").forGetter(dct::b)).apply($$0, dct::new));

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      MinecraftServer $$5 = $$0.o();
      alx $$6 = $$5.aE();
      Optional<ik<ew>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         ew $$8 = $$5.aH().a(2).a().a($$3).a($$0).a($$4).a($$3.bV());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   public ali b() {
      return this.d;
   }
}
