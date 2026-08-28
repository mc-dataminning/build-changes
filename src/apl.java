import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class apl {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(eq.a("clear").executes($$0x -> a((ep)$$0x.getSource(), ImmutableList.of(((ep)$$0x.getSource()).h())))))
            .then(
               eq.a("set")
                  .then(
                     eq.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ep)$$0x.getSource(), ImmutableList.of(((ep)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ep $$0, Collection<? extends cms> $$1, int $$2) {
      for (cms $$3 : $$1) {
         $$3.aa().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xl.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ep $$0, Collection<? extends cms> $$1) {
      for (cms $$2 : $$1) {
         $$2.aa().ifPresent(cly::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xl.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> xl.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
