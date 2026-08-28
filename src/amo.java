import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class amo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.banip.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ev.a("target", StringArgumentType.word())
                     .executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ev.a("reason", fl.a()).executes($$0x -> a((eu)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fl.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eu $$0, String $$1, @Nullable xe $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         ark $$3 = $$0.l().ag().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.C(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(eu $$0, String $$1, @Nullable xe $$2) throws CommandSyntaxException {
      avg $$3 = $$0.l().ag().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<ark> $$4 = $$0.l().ag().b($$1);
         avh $$5 = new avh($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> xe.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> xe.a("commands.banip.info", $$4.size(), hj.a($$4)), true);
         }

         for (ark $$6 : $$4) {
            $$6.c.a(xe.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
