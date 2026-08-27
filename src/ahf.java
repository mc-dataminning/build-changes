import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class ahf {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", ee.d())
                     .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ti.c("multiplayer.disconnect.kicked"))))
                  .then(du.a("reason", ei.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dt $$0, Collection<ako> $$1, ti $$2) {
      for (ako $$3 : $$1) {
         $$3.c.b($$2);
         $$0.a(() -> ti.a("commands.kick.success", $$3.H_(), $$2), true);
      }

      return $$1.size();
   }
}
