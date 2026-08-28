import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aps {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ew.a("clear").executes($$0x -> a((ev)$$0x.getSource(), ImmutableList.of(((ev)$$0x.getSource()).h())))))
            .then(
               ew.a("set")
                  .then(
                     ew.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ev)$$0x.getSource(), ImmutableList.of(((ev)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ev $$0, Collection<? extends coh> $$1, int $$2) {
      for (coh $$3 : $$1) {
         $$3.ad().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ev $$0, Collection<? extends coh> $$1) {
      for (coh $$2 : $$1) {
         $$2.ad().ifPresent(cnm::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xh.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xh.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
