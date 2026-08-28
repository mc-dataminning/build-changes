import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aou {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(er.a("clear").executes($$0x -> a((eq)$$0x.getSource(), ImmutableList.of(((eq)$$0x.getSource()).h())))))
            .then(
               er.a("set")
                  .then(
                     er.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((eq)$$0x.getSource(), ImmutableList.of(((eq)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(eq $$0, Collection<? extends cmh> $$1, int $$2) {
      for (cmh $$3 : $$1) {
         $$3.aa().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eq $$0, Collection<? extends cmh> $$1) {
      for (cmh $$2 : $$1) {
         $$2.aa().ifPresent(cln::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wu.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
