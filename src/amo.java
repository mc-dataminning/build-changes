import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               dw.a("targets", ek.a())
                  .suggests(($$0x, $$1) -> ea.a(((dv)$$0x.getSource()).l().ah().f().a(), $$1))
                  .executes($$0x -> a((dv)$$0x.getSource(), ek.a($$0x, "targets")))
            )
      );
   }

   private static int a(dv $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      atx $$2 = $$0.l().ah().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> wi.a("commands.pardon.success", wi.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
