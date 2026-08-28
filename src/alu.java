import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class alu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.ban.failed"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)er.a("targets", ff.a()).executes($$0x -> a((eq)$$0x.getSource(), ff.a($$0x, "targets"), null)))
                  .then(er.a("reason", fh.a()).executes($$0x -> a((eq)$$0x.getSource(), ff.a($$0x, "targets"), fh.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eq $$0, Collection<GameProfile> $$1, @Nullable wu $$2) throws CommandSyntaxException {
      aup $$3 = $$0.l().ai().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            auq $$6 = new auq($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> wu.a("commands.ban.success", wu.b($$5.getName()), $$6.d()), true);
            aqn $$7 = $$0.l().ai().a($$5.getId());
            if ($$7 != null) {
               $$7.c.b(wu.c("multiplayer.disconnect.banned"));
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
