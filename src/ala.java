import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class ala {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(dt.a("clear").executes($$0x -> a((ds)$$0x.getSource(), ImmutableList.of(((ds)$$0x.getSource()).h())))))
            .then(
               dt.a("set")
                  .then(
                     dt.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ds)$$0x.getSource(), ImmutableList.of(((ds)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ds $$0, Collection<? extends cer> $$1, int $$2) {
      for (cer $$3 : $$1) {
         $$3.aa().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ds $$0, Collection<? extends cer> $$1) {
      for (cer $$2 : $$1) {
         $$2.aa().ifPresent(cdx::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> vb.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().Q_()), true);
      } else {
         $$0.a(() -> vb.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
