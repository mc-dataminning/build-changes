import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class akf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.banip.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("target", StringArgumentType.word())
                     .executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(dv.a("reason", el.a()).executes($$0x -> a((du)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), el.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, String $$1, @Nullable vq $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         aow $$3 = $$0.l().ae().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.A(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(du $$0, String $$1, @Nullable vq $$2) throws CommandSyntaxException {
      ask $$3 = $$0.l().ae().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<aow> $$4 = $$0.l().ae().b($$1);
         asl $$5 = new asl($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> vq.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> vq.a("commands.banip.info", $$4.size(), gg.a($$4)), true);
         }

         for (aow $$6 : $$4) {
            $$6.d.b(vq.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
