import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class alp {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ee.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ed)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ee.a("reason", eu.a()).executes($$0x -> a((ed)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), eu.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ed $$0, String $$1, @Nullable wu $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         aqi $$3 = $$0.l().ah().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.A(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ed $$0, String $$1, @Nullable wu $$2) throws CommandSyntaxException {
      aub $$3 = $$0.l().ah().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<aqi> $$4 = $$0.l().ah().b($$1);
         auc $$5 = new auc($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> wu.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> wu.a("commands.banip.info", $$4.size(), gs.a($$4)), true);
         }

         for (aqi $$6 : $$4) {
            $$6.d.b(wu.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
