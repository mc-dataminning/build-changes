import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class amz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xk.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xk.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ex.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ex.a("reason", fn.a()).executes($$0x -> a((ew)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fn.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ew $$0, String $$1, @Nullable xk $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         ary $$3 = $$0.l().ag().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.B(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ew $$0, String $$1, @Nullable xk $$2) throws CommandSyntaxException {
      avv $$3 = $$0.l().ag().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<ary> $$4 = $$0.l().ag().b($$1);
         avw $$5 = new avw($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> xk.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> xk.a("commands.banip.info", $$4.size(), hl.a($$4)), true);
         }

         for (ary $$6 : $$4) {
            $$6.f.a(xk.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
