import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class amb {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xe.c("commands.banip.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ei.a("target", StringArgumentType.word())
                     .executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ei.a("reason", ey.a()).executes($$0x -> a((eh)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), ey.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eh $$0, String $$1, @Nullable xe $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         aqu $$3 = $$0.l().ah().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.C(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(eh $$0, String $$1, @Nullable xe $$2) throws CommandSyntaxException {
      aun $$3 = $$0.l().ah().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<aqu> $$4 = $$0.l().ah().b($$1);
         auo $$5 = new auo($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> xe.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> xe.a("commands.banip.info", $$4.size(), gw.a($$4)), true);
         }

         for (aqu $$6 : $$4) {
            $$6.d.b(xe.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
