import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class afv {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(te.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(dt.a("reason", eh.a()).executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), eh.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, String $$1, @Nullable te $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         akj $$3 = $$0.l().ac().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.y(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ds $$0, String $$1, @Nullable te $$2) throws CommandSyntaxException {
      anu $$3 = $$0.l().ac().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<akj> $$4 = $$0.l().ac().b($$1);
         anv $$5 = new anv($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> te.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> te.a("commands.banip.info", $$4.size(), gb.a($$4)), true);
         }

         for (akj $$6 : $$4) {
            $$6.c.b(te.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
