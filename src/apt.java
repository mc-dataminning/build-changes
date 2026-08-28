import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class apt {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ex.a("clear").executes($$0x -> a((ew)$$0x.getSource(), ImmutableList.of(((ew)$$0x.getSource()).h())))))
            .then(
               ex.a("set")
                  .then(
                     ex.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ew)$$0x.getSource(), ImmutableList.of(((ew)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ew $$0, Collection<? extends com> $$1, int $$2) {
      for (com $$3 : $$1) {
         $$3.ad().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ew $$0, Collection<? extends com> $$1) {
      for (com $$2 : $$1) {
         $$2.ad().ifPresent(cnr::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xi.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().S_()), true);
      } else {
         $$0.a(() -> xi.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
