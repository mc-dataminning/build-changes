import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)eu.a("targets", fg.d())
                     .executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), xd.c("multiplayer.disconnect.kicked"))))
                  .then(eu.a("reason", fk.a()).executes($$0x -> a((et)$$0x.getSource(), fg.f($$0x, "targets"), fk.a($$0x, "reason"))))
            )
      );
   }

   private static int a(et $$0, Collection<ari> $$1, xd $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (ari $$4 : $$1) {
            if (!$$0.l().a($$4.gb())) {
               $$4.c.a($$2);
               $$0.a(() -> xd.a("commands.kick.success", $$4.Q_(), $$2), true);
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
