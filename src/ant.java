import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ant {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ev.a("targets", fh.d())
                     .executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), xe.c("multiplayer.disconnect.kicked"))))
                  .then(ev.a("reason", fl.a()).executes($$0x -> a((eu)$$0x.getSource(), fh.f($$0x, "targets"), fl.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eu $$0, Collection<ark> $$1, xe $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (ark $$4 : $$1) {
            if (!$$0.l().a($$4.gc())) {
               $$4.c.a($$2);
               $$0.a(() -> xe.a("commands.kick.success", $$4.R_(), $$2), true);
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
