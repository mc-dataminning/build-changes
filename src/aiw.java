import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aiw {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ds.a("clear").executes($$0x -> a((dr)$$0x.getSource(), ImmutableList.of(((dr)$$0x.getSource()).h())))))
            .then(
               ds.a("set")
                  .then(
                     ds.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((dr)$$0x.getSource(), ImmutableList.of(((dr)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(dr $$0, Collection<? extends cbm> $$1, int $$2) {
      for (cbm $$3 : $$1) {
         $$3.Y().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(dr $$0, Collection<? extends cbm> $$1) {
      for (cbm $$2 : $$1) {
         $$2.Y().ifPresent(cas::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> tf.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().H_()), true);
      } else {
         $$0.a(() -> tf.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
