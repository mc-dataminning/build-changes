import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class als {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.pardonip.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("pardon-ip").requires($$0x -> $$0x.c(3)))
            .then(
               dv.a("target", StringArgumentType.word())
                  .suggests(($$0x, $$1) -> dz.a(((du)$$0x.getSource()).l().ae().g().a(), $$1))
                  .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "target")))
            )
      );
   }

   private static int a(du $$0, String $$1) throws CommandSyntaxException {
      if (!InetAddresses.isInetAddress($$1)) {
         throw a.create();
      } else {
         ask $$2 = $$0.l().ae().g();
         if (!$$2.a($$1)) {
            throw b.create();
         } else {
            $$2.c($$1);
            $$0.a(() -> vq.a("commands.pardonip.success", $$1), true);
            return 1;
         }
      }
   }
}
