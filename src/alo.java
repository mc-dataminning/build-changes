import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class alo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ed.a("targets", er.a()).executes($$0x -> a((ec)$$0x.getSource(), er.a($$0x, "targets"), null)))
                  .then(ed.a("reason", et.a()).executes($$0x -> a((ec)$$0x.getSource(), er.a($$0x, "targets"), et.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ec $$0, Collection<GameProfile> $$1, @Nullable ws $$2) throws CommandSyntaxException {
      auh $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            aui $$6 = new aui($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> ws.a("commands.ban.success", ws.b($$5.getName()), $$6.d()), true);
            aqf $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(ws.c("multiplayer.disconnect.banned"));
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
