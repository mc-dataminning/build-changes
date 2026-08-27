import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class ahc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ui.c("commands.banip.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("target", StringArgumentType.word())
                     .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(dv.a("reason", ek.a()).executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), ek.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, String $$1, @Nullable ui $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         alr $$3 = $$0.m().ac().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.y(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(du $$0, String $$1, @Nullable ui $$2) throws CommandSyntaxException {
      apd $$3 = $$0.m().ac().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<alr> $$4 = $$0.m().ac().b($$1);
         ape $$5 = new ape($$1, null, $$0.d(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> ui.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> ui.a("commands.banip.info", $$4.size(), ge.a($$4)), true);
         }

         for (alr $$6 : $$4) {
            $$6.c.b(ui.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
