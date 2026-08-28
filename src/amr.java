import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class amr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ew.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ew.a("reason", fm.a()).executes($$0x -> a((ev)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fm.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ev $$0, String $$1, @Nullable xh $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         arn $$3 = $$0.l().ag().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.C(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ev $$0, String $$1, @Nullable xh $$2) throws CommandSyntaxException {
      avk $$3 = $$0.l().ag().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<arn> $$4 = $$0.l().ag().b($$1);
         avl $$5 = new avl($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> xh.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> xh.a("commands.banip.info", $$4.size(), hk.a($$4)), true);
         }

         for (arn $$6 : $$4) {
            $$6.d.a(xh.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
