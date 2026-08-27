import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ann {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ei.a("targets", ew.a())
                  .suggests(($$0x, $$1) -> em.a(((eh)$$0x.getSource()).l().ah().f().a(), $$1))
                  .executes($$0x -> a((eh)$$0x.getSource(), ew.a($$0x, "targets")))
            )
      );
   }

   private static int a(eh $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auw $$2 = $$0.l().ah().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> xe.a("commands.pardon.success", xe.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
