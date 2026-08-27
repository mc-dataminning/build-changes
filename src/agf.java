import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class agf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tl.c("commands.banip.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)du.a("target", StringArgumentType.word())
                     .executes($$0x -> a((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(du.a("reason", ei.a()).executes($$0x -> a((dt)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dt $$0, String $$1, @Nullable tl $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         aku $$3 = $$0.l().ac().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.y(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(dt $$0, String $$1, @Nullable tl $$2) throws CommandSyntaxException {
      aog $$3 = $$0.l().ac().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<aku> $$4 = $$0.l().ac().b($$1);
         aoh $$5 = new aoh($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> tl.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> tl.a("commands.banip.info", $$4.size(), gc.a($$4)), true);
         }

         for (aku $$6 : $$4) {
            $$6.c.b(tl.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
