import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               eu.a("targets", fi.a())
                  .suggests(($$0x, $$1) -> ey.a(((et)$$0x.getSource()).l().ag().f().a(), $$1))
                  .executes($$0x -> a((et)$$0x.getSource(), fi.a($$0x, "targets")))
            )
      );
   }

   private static int a(et $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avm $$2 = $$0.l().ag().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> xd.a("commands.pardon.success", xd.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
