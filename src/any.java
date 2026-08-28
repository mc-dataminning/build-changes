import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class any {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xo.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               eq.a("targets", fe.a())
                  .suggests(($$0x, $$1) -> eu.a(((ep)$$0x.getSource()).l().ah().f().a(), $$1))
                  .executes($$0x -> a((ep)$$0x.getSource(), fe.a($$0x, "targets")))
            )
      );
   }

   private static int a(ep $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avi $$2 = $$0.l().ah().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> xo.a("commands.pardon.success", xo.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
