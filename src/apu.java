import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class apu {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ej.a("clear").executes($$0x -> a((ei)$$0x.getSource(), ImmutableList.of(((ei)$$0x.getSource()).h())))))
            .then(
               ej.a("set")
                  .then(
                     ej.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ei)$$0x.getSource(), ImmutableList.of(((ei)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ei $$0, Collection<? extends crc> $$1, int $$2) {
      for (crc $$3 : $$1) {
         $$3.ac().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wy.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ei $$0, Collection<? extends crc> $$1) {
      for (crc $$2 : $$1) {
         $$2.ac().ifPresent(cqh::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wy.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> wy.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
