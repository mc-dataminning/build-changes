import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ang {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ei.a("targets", eu.d())
                     .executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), xe.c("multiplayer.disconnect.kicked"))))
                  .then(ei.a("reason", ey.a()).executes($$0x -> a((eh)$$0x.getSource(), eu.f($$0x, "targets"), ey.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eh $$0, Collection<aqu> $$1, xe $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (aqu $$4 : $$1) {
            if (!$$0.l().a($$4.gk())) {
               $$4.d.b($$2);
               $$0.a(() -> xe.a("commands.kick.success", $$4.P_(), $$2), true);
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
