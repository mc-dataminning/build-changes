import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class amn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.ban.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)eu.a("targets", fi.a()).executes($$0x -> a((et)$$0x.getSource(), fi.a($$0x, "targets"), null)))
                  .then(eu.a("reason", fk.a()).executes($$0x -> a((et)$$0x.getSource(), fi.a($$0x, "targets"), fk.a($$0x, "reason"))))
            )
      );
   }

   private static int a(et $$0, Collection<GameProfile> $$1, @Nullable xd $$2) throws CommandSyntaxException {
      avm $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avn $$6 = new avn($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xd.a("commands.ban.success", xd.b($$5.getName()), $$6.d()), true);
            arh $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.c.a(xd.c("multiplayer.disconnect.banned"));
            }
         }
      }

      if ($$4 == 0) {
         throw a.create();
      } else {
         return $$4;
      }
   }
}
