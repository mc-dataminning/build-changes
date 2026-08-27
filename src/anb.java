import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class anb {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("kill").requires($$0x -> $$0x.c(2)))
               .executes($$0x -> a((ee)$$0x.getSource(), ImmutableList.of(((ee)$$0x.getSource()).g()))))
            .then(ef.a("targets", er.b()).executes($$0x -> a((ee)$$0x.getSource(), er.b($$0x, "targets"))))
      );
   }

   private static int a(ee $$0, Collection<? extends brw> $$1) {
      for (brw $$2 : $$1) {
         $$2.an();
      }

      if ($$1.size() == 1) {
         $$0.a(() -> wx.a("commands.kill.success.single", $$1.iterator().next().O_()), true);
      } else {
         $$0.a(() -> wx.a("commands.kill.success.multiple", $$1.size()), true);
      }

      return $$1.size();
   }
}
