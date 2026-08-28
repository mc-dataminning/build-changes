import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class aml {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xd.c("commands.banip.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)eu.a("target", StringArgumentType.word())
                     .executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(eu.a("reason", fk.a()).executes($$0x -> a((et)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fk.a($$0x, "reason"))))
            )
      );
   }

   private static int a(et $$0, String $$1, @Nullable xd $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         arh $$3 = $$0.l().ag().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.C(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(et $$0, String $$1, @Nullable xd $$2) throws CommandSyntaxException {
      avd $$3 = $$0.l().ag().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<arh> $$4 = $$0.l().ag().b($$1);
         ave $$5 = new ave($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> xd.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> xd.a("commands.banip.info", $$4.size(), hi.a($$4)), true);
         }

         for (arh $$6 : $$4) {
            $$6.c.a(xd.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
