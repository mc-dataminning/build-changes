import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ed.a("targets", er.a())
                  .suggests(($$0x, $$1) -> eh.a(((ec)$$0x.getSource()).l().ah().f().a(), $$1))
                  .executes($$0x -> a((ec)$$0x.getSource(), er.a($$0x, "targets")))
            )
      );
   }

   private static int a(ec $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auh $$2 = $$0.l().ah().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> ws.a("commands.pardon.success", ws.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
