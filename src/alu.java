import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class alu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ef.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ef.a("reason", ev.a()).executes($$0x -> a((ee)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), ev.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ee $$0, String $$1, @Nullable wx $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         aqn $$3 = $$0.l().ah().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.A(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ee $$0, String $$1, @Nullable wx $$2) throws CommandSyntaxException {
      aug $$3 = $$0.l().ah().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<aqn> $$4 = $$0.l().ah().b($$1);
         auh $$5 = new auh($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> wx.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> wx.a("commands.banip.info", $$4.size(), gt.a($$4)), true);
         }

         for (aqn $$6 : $$4) {
            $$6.d.b(wx.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
