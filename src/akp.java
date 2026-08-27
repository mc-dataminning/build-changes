import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class akp {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(dv.a("clear").executes($$0x -> a((du)$$0x.getSource(), ImmutableList.of(((du)$$0x.getSource()).i())))))
            .then(
               dv.a("set")
                  .then(
                     dv.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((du)$$0x.getSource(), ImmutableList.of(((du)$$0x.getSource()).i()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(du $$0, Collection<? extends cdu> $$1, int $$2) {
      for (cdu $$3 : $$1) {
         $$3.aa().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> ur.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(du $$0, Collection<? extends cdu> $$1) {
      for (cdu $$2 : $$1) {
         $$2.aa().ifPresent(cda::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> ur.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().P_()), true);
      } else {
         $$0.a(() -> ur.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
