import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aka {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vf.c("commands.pardonip.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("pardon-ip").requires($$0x -> $$0x.c(3)))
            .then(
               dt.a("target", StringArgumentType.word())
                  .suggests(($$0x, $$1) -> dx.a(((ds)$$0x.getSource()).l().ae().g().a(), $$1))
                  .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "target")))
            )
      );
   }

   private static int a(ds $$0, String $$1) throws CommandSyntaxException {
      if (!InetAddresses.isInetAddress($$1)) {
         throw a.create();
      } else {
         aqs $$2 = $$0.l().ae().g();
         if (!$$2.a($$1)) {
            throw b.create();
         } else {
            $$2.c($$1);
            $$0.a(() -> vf.a("commands.pardonip.success", $$1), true);
            return 1;
         }
      }
   }
}
