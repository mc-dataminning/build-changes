import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class aox {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("warden_spawn_tracker").requires($$0x -> $$0x.c(2)))
               .then(ef.a("clear").executes($$0x -> a((ee)$$0x.getSource(), ImmutableList.of(((ee)$$0x.getSource()).h())))))
            .then(
               ef.a("set")
                  .then(
                     ef.a("warning_level", IntegerArgumentType.integer(0, 4))
                        .executes(
                           $$0x -> a((ee)$$0x.getSource(), ImmutableList.of(((ee)$$0x.getSource()).h()), IntegerArgumentType.getInteger($$0x, "warning_level"))
                        )
                  )
            )
      );
   }

   private static int a(ee $$0, Collection<? extends cly> $$1, int $$2) {
      for (cly $$3 : $$1) {
         $$3.aa().ifPresent($$1x -> $$1x.a($$2));
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.warden_spawn_tracker.set.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.warden_spawn_tracker.set.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }

   private static int a(ee $$0, Collection<? extends cly> $$1) {
      for (cly $$2 : $$1) {
         $$2.aa().ifPresent(cle::b);
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.warden_spawn_tracker.clear.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.warden_spawn_tracker.clear.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
