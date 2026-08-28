import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wo.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ey.a("targets", fk.d())
                     .executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), wo.c("multiplayer.disconnect.kicked"))))
                  .then(ey.a("reason", fo.a()).executes($$0x -> a((ex)$$0x.getSource(), fk.f($$0x, "targets"), fo.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ex $$0, Collection<ard> $$1, wo $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (ard $$4 : $$1) {
            if (!$$0.l().a($$4.gh())) {
               $$4.f.a($$2);
               $$0.a(() -> wo.a("commands.kick.success", $$4.p_(), $$2), true);
               $$3++;
            }
         }

         if ($$3 == 0) {
            throw a.create();
         } else {
            return $$3;
         }
      }
   }
}
