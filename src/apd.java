import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class apd {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ei.a("clear").executes($$0x -> a((eh)$$0x.getSource(), ImmutableList.of(((eh)$$0x.getSource()).h())))))
            .then(
               ei.a("set")
                  .then(
                     ei.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((eh)$$0x.getSource(), ImmutableList.of(((eh)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(eh $$0, Collection<? extends cly> $$1, int $$2) {
      for (cly $$3 : $$1) {
         $$3.ac().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(eh $$0, Collection<? extends cly> $$1) {
      for (cly $$2 : $$1) {
         $$2.ac().ifPresent(cle::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> xe.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
