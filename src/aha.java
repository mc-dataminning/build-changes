import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class aha {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ed.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), te.c("multiplayer.disconnect.kicked"))))
                  .then(dt.a("reason", eh.a()).executes($$0x -> a((ds)$$0x.getSource(), ed.f($$0x, "targets"), eh.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, Collection<akj> $$1, te $$2) {
      for (akj $$3 : $$1) {
         $$3.c.b($$2);
         $$0.a(() -> te.a("commands.kick.success", $$3.H_(), $$2), true);
      }

      return $$1.size();
   }
}
