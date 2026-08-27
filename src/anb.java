import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ee.a("targets", es.a())
                  .suggests(($$0x, $$1) -> ei.a(((ed)$$0x.getSource()).l().ah().f().a(), $$1))
                  .executes($$0x -> a((ed)$$0x.getSource(), es.a($$0x, "targets")))
            )
      );
   }

   private static int a(ed $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auk $$2 = $$0.l().ah().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> wu.a("commands.pardon.success", wu.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
