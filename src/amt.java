import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class amt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ew.a("targets", fk.a()).executes($$0x -> a((ev)$$0x.getSource(), fk.a($$0x, "targets"), null)))
                  .then(ew.a("reason", fm.a()).executes($$0x -> a((ev)$$0x.getSource(), fk.a($$0x, "targets"), fm.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ev $$0, Collection<GameProfile> $$1, @Nullable xh $$2) throws CommandSyntaxException {
      avt $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avu $$6 = new avu($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xh.a("commands.ban.success", xh.b($$5.getName()), $$6.d()), true);
            arn $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.d.a(xh.c("multiplayer.disconnect.banned"));
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
