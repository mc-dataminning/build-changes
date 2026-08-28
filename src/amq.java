import com.google.common.net.InetAddresses;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.List;
import javax.annotation.Nullable;

public class amq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.banip.invalid"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wy.c("commands.banip.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("ban-ip").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ek.a("target", StringArgumentType.word())
                     .executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), null)))
                  .then(ek.a("reason", fa.a()).executes($$0x -> a((ej)$$0x.getSource(), StringArgumentType.getString($$0x, "target"), fa.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ej $$0, String $$1, @Nullable wy $$2) throws CommandSyntaxException {
      if (InetAddresses.isInetAddress($$1)) {
         return b($$0, $$1, $$2);
      } else {
         arr $$3 = $$0.l().ag().a($$1);
         if ($$3 != null) {
            return b($$0, $$3.B(), $$2);
         } else {
            throw a.create();
         }
      }
   }

   private static int b(ej $$0, String $$1, @Nullable wy $$2) throws CommandSyntaxException {
      avn $$3 = $$0.l().ag().g();
      if ($$3.a($$1)) {
         throw b.create();
      } else {
         List<arr> $$4 = $$0.l().ag().b($$1);
         avo $$5 = new avo($$1, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
         $$3.a($$5);
         $$0.a(() -> wy.a("commands.banip.success", $$1, $$5.d()), true);
         if (!$$4.isEmpty()) {
            $$0.a(() -> wy.a("commands.banip.info", $$4.size(), gz.a($$4)), true);
         }

         for (arr $$6 : $$4) {
            $$6.f.a(wy.c("multiplayer.disconnect.ip_banned"));
         }

         return $$4.size();
      }
   }
}
