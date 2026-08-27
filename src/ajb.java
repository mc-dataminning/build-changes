import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ajb {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(du.a("clear").executes($$0x -> a((dt)$$0x.getSource(), ImmutableList.of(((dt)$$0x.getSource()).h())))))
            .then(
               du.a("set")
                  .then(
                     du.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((dt)$$0x.getSource(), ImmutableList.of(((dt)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(dt $$0, Collection<? extends cbu> $$1, int $$2) {
      for (cbu $$3 : $$1) {
         $$3.Y().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dt $$0, Collection<? extends cbu> $$1) {
      for (cbu $$2 : $$1) {
         $$2.Y().ifPresent(cba::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tl.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().N_()), true);
      } else {
         $$0.a(() -> tl.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
