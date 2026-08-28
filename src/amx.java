import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)er.a("targets", fd.d())
                     .executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), wu.c("multiplayer.disconnect.kicked"))))
                  .then(er.a("reason", fh.a()).executes($$0x -> a((eq)$$0x.getSource(), fd.f($$0x, "targets"), fh.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eq $$0, Collection<aql> $$1, wu $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (aql $$4 : $$1) {
            if (!$$0.l().a($$4.fX())) {
               $$4.c.b($$2);
               $$0.a(() -> wu.a("commands.kick.success", $$4.O_(), $$2), true);
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
