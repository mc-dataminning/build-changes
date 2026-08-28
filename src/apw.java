import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class apw {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ek.a("clear").executes($$0x -> a((ej)$$0x.getSource(), ImmutableList.of(((ej)$$0x.getSource()).h())))))
            .then(
               ek.a("set")
                  .then(
                     ek.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ej)$$0x.getSource(), ImmutableList.of(((ej)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ej $$0, Collection<? extends crx> $$1, int $$2) {
      for (crx $$3 : $$1) {
         $$3.Z().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xa.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xa.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ej $$0, Collection<? extends crx> $$1) {
      for (crx $$2 : $$1) {
         $$2.Z().ifPresent(crc::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> xa.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().m_()), true);
      } else {
         $$0.a(() -> xa.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
