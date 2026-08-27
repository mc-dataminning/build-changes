import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ano {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.pardonip.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("pardon-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ei.a("target", StringArgumentType.word())
                  .suggests(($$0x, $$1) -> em.a(((eh)$$0x.getSource()).l().ah().g().a(), $$1))
                  .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "target")))
            )
      );
   }

   private static int a(eh $$0, String $$1) throws CommandSyntaxException {
      if (!InetAddresses.isInetAddress($$1)) {
         throw a.create();
      } else {
         aun $$2 = $$0.l().ah().g();
         if (!$$2.a($$1)) {
            throw b.create();
         } else {
            $$2.c($$1);
            $$0.a(() -> xe.a("commands.pardonip.success", $$1), true);
            return 1;
         }
      }
   }
}
