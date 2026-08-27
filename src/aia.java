import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class aia {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vb.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(dt.a("reason", ei.a()).executes($$0x -> a((ds)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, String $$1, @Nullable vb $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         amq $$3 = $$0.l().ae().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.A(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ds $$0, String $$1, @Nullable vb $$2) throws CommandSyntaxException {
      aqc $$3 = $$0.l().ae().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<amq> $$4 = $$0.l().ae().b($$1);
         aqd $$5 = new aqd($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> vb.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> vb.a("commands.banip.info", $$4.size(), gc.a($$4)), true);
         }

         for (amq $$6 : $$4) {
            $$6.c.b(vb.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
