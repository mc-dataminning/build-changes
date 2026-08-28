import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public record dbc(akr d) implements das {
   private static final Logger e = LogUtils.getLogger();
   public static final MapCodec<dbc> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akr.a.fieldOf("function").forGetter(dbc::b)).apply($$0, dbc::new));

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      MinecraftServer $$5 = $$0.o();
      alg $$6 = $$5.aF();
      Optional<ig<et>> $$7 = $$6.a(this.d);
      if ($$7.isPresent()) {
         et $$8 = $$5.aI().a(2).a().a($$3).a($$0).a($$4).a($$3.bN());
         $$6.a($$7.get(), $$8);
      } else {
         e.error("Enchantment run_function effect failed for non-existent function {}", this.d);
      }
   }

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public akr b() {
      return this.d;
   }
}
