import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class app {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ev.a("clear").executes($$0x -> a((eu)$$0x.getSource(), ImmutableList.of(((eu)$$0x.getSource()).h())))))
            .then(
               ev.a("set")
                  .then(
                     ev.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((eu)$$0x.getSource(), ImmutableList.of(((eu)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(eu $$0, Collection<? extends cnx> $$1, int $$2) {
      for (cnx $$3 : $$1) {
         $$3.ad().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eu $$0, Collection<? extends cnx> $$1) {
      for (cnx $$2 : $$1) {
         $$2.ad().ifPresent(cnd::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().R_()), true);
      } else {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
