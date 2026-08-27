import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class afx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(tf.c("commands.banip.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ds.a("target", StringArgumentType.word())
                     .executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ds.a("reason", eg.a()).executes($$0x -> a((dr)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), eg.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dr $$0, String $$1, @Nullable tf $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         akl $$3 = $$0.l().ac().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.y(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(dr $$0, String $$1, @Nullable tf $$2) throws CommandSyntaxException {
      anw $$3 = $$0.l().ac().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<akl> $$4 = $$0.l().ac().b($$1);
         anx $$5 = new anx($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> tf.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> tf.a("commands.banip.info", $$4.size(), ga.a($$4)), true);
         }

         for (akl $$6 : $$4) {
            $$6.c.b(tf.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
