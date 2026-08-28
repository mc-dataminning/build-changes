import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class api {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ey.a("clear").executes($$0x -> a((ex)$$0x.getSource(), ImmutableList.of(((ex)$$0x.getSource()).h())))))
            .then(
               ey.a("set")
                  .then(
                     ey.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ex)$$0x.getSource(), ImmutableList.of(((ex)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ex $$0, Collection<? extends cow> $$1, int $$2) {
      for (cow $$3 : $$1) {
         $$3.ac().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> wp.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ex $$0, Collection<? extends cow> $$1) {
      for (cow $$2 : $$1) {
         $$2.ac().ifPresent(coa::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wp.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().p_()), true);
      } else {
         $$0.a(() -> wp.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
