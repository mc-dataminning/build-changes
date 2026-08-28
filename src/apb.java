import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class apb {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(eu.a("clear").executes($$0x -> a((et)$$0x.getSource(), ImmutableList.of(((et)$$0x.getSource()).h())))))
            .then(
               eu.a("set")
                  .then(
                     eu.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((et)$$0x.getSource(), ImmutableList.of(((et)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(et $$0, Collection<? extends cmx> $$1, int $$2) {
      for (cmx $$3 : $$1) {
         $$3.ab().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> wz.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(et $$0, Collection<? extends cmx> $$1) {
      for (cmx $$2 : $$1) {
         $$2.ab().ifPresent(cmd::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wz.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> wz.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
