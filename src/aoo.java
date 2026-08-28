import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aoo {
   private static final Logger a = LogUtils.getLogger();

   public static void a(Collection<String> $$0, ew $$1) {
      $$1.l().a($$0).exceptionally($$1x -> {
         a.warn("Failed to execute reload", $$1x);
         $$1.b(xi.c("commands.reload.failure"));
         return null;
      });
   }

   private static Collection<String> a(aul $$0, etw $$1, Collection<String> $$2) {
      $$0.a();
      Collection<String> $$3 = Lists.newArrayList($$2);
      Collection<String> $$4 = $$1.D().a().b();

      for (String $$5 : $$0.c()) {
         if (!$$4.contains($$5) && !$$3.contains($$5)) {
            $$3.add($$5);
         }
      }

      return $$3;
   }

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("reload").requires($$0x -> $$0x.c(2))).executes($$0x -> {
         ew $$1 = (ew)$$0x.getSource();
         MinecraftServer $$2 = $$1.l();
         aul $$3 = $$2.aF();
         etw $$4 = $$2.aZ();
         Collection<String> $$5 = $$3.e();
         Collection<String> $$6 = a($$3, $$4, $$5);
         $$1.a(() -> xi.c("commands.reload.success"), true);
         a($$6, $$1);
         return 0;
      }));
   }
}
