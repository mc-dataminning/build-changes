import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.pardonip.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("pardon-ip").requires($$0x -> $$0x.c(3)))
            .then(
               el.a("target", StringArgumentType.word())
                  .suggests(($$0x, $$1) -> ep.a(((ek)$$0x.getSource()).l().ag().g().a(), $$1))
                  .executes($$0x -> a((ek)$$0x.getSource(), StringArgumentType.getString($$0x, "target")))
            )
      );
   }

   private static int a(ek $$0, String $$1) throws CommandSyntaxException {
      if (!InetAddresses.isInetAddress($$1)) {
         throw a.create();
      } else {
         avy $$2 = $$0.l().ag().g();
         if (!$$2.a($$1)) {
            throw b.create();
         } else {
            $$2.c($$1);
            $$0.a(() -> xg.a("commands.pardonip.success", $$1), true);
            return 1;
         }
      }
   }
}
