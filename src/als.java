import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class als {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.banip.failed"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)er.a("target", StringArgumentType.word())
                     .executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(er.a("reason", fh.a()).executes($$0x -> a((eq)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fh.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eq $$0, String $$1, @Nullable wu $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         aqn $$3 = $$0.l().ai().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.B(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(eq $$0, String $$1, @Nullable wu $$2) throws CommandSyntaxException {
      aug $$3 = $$0.l().ai().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<aqn> $$4 = $$0.l().ai().b($$1);
         auh $$5 = new auh($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> wu.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> wu.a("commands.banip.info", $$4.size(), hf.a($$4)), true);
         }

         for (aqn $$6 : $$4) {
            $$6.c.b(wu.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
