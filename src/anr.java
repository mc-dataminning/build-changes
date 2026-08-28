import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xo.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)eq.a("targets", fc.d())
                     .executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), xo.c("multiplayer.disconnect.kicked"))))
                  .then(eq.a("reason", fg.a()).executes($$0x -> a((ep)$$0x.getSource(), fc.f($$0x, "targets"), fg.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ep $$0, Collection<arf> $$1, xo $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (arf $$4 : $$1) {
            if (!$$0.l().a($$4.gb())) {
               $$4.c.b($$2);
               $$0.a(() -> xo.a("commands.kick.success", $$4.O_(), $$2), true);
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
