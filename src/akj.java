import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class akj {
   private static final Logger a = LogUtils.getLogger();

   public static void a(Collection<String> $$0, ds $$1) {
      $$1.l().a($$0).exceptionally($$1x -> {
         a.warn("Failed to execute reload", $$1x);
         $$1.b(vf.c("commands.reload.failure"));
         return null;
      });
   }

   private static Collection<String> a(apt $$0, egs $$1, Collection<String> $$2) {
      $$0.a();
      Collection<String> $$3 = Lists.newArrayList($$2);
      Collection<String> $$4 = $$1.F().a().b();

      for (String $$5 : $$0.b()) {
         if (!$$4.contains($$5) && !$$3.contains($$5)) {
            $$3.add($$5);
         }
      }

      return $$3;
   }

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("reload").requires($$0x -> $$0x.c(2))).executes($$0x -> {
         ds $$1 = (ds)$$0x.getSource();
         MinecraftServer $$2 = $$1.l();
         apt $$3 = $$2.aD();
         egs $$4 = $$2.aY();
         Collection<String> $$5 = $$3.d();
         Collection<String> $$6 = a($$3, $$4, $$5);
         $$1.a(() -> vf.c("commands.reload.success"), true);
         a($$6, $$1);
         return 0;
      }));
   }
}
