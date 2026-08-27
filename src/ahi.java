import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class ahi {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", ee.d())
                     .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), tl.c("multiplayer.disconnect.kicked"))))
                  .then(du.a("reason", ei.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dt $$0, Collection<aks> $$1, tl $$2) {
      for (aks $$3 : $$1) {
         $$3.c.b($$2);
         $$0.a(() -> tl.a("commands.kick.success", $$3.N_(), $$2), true);
      }

      return $$1.size();
   }
}
