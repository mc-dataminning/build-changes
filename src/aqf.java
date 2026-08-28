import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aqf {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(el.a("clear").executes($$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).h())))))
            .then(
               el.a("set")
                  .then(
                     el.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ek)$$0x.getSource(), ImmutableList.of(((ek)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ek $$0, Collection<? extends csi> $$1, int $$2) {
      for (csi $$3 : $$1) {
         $$3.Z().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xg.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ek $$0, Collection<? extends csi> $$1) {
      for (csi $$2 : $$1) {
         $$2.Z().ifPresent(crn::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xg.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xg.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
