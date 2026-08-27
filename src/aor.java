import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aor {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ee.a("clear").executes($$0x -> a((ed)$$0x.getSource(), ImmutableList.of(((ed)$$0x.getSource()).h())))))
            .then(
               ee.a("set")
                  .then(
                     ee.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ed)$$0x.getSource(), ImmutableList.of(((ed)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ed $$0, Collection<? extends clh> $$1, int $$2) {
      for (clh $$3 : $$1) {
         $$3.aa().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ed $$0, Collection<? extends clh> $$1) {
      for (clh $$2 : $$1) {
         $$2.aa().ifPresent(ckn::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
