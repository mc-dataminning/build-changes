import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class alr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ee.a("targets", es.a()).executes($$0x -> a((ed)$$0x.getSource(), es.a($$0x, "targets"), null)))
                  .then(ee.a("reason", eu.a()).executes($$0x -> a((ed)$$0x.getSource(), es.a($$0x, "targets"), eu.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ed $$0, Collection<GameProfile> $$1, @Nullable wu $$2) throws CommandSyntaxException {
      auk $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            aul $$6 = new aul($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> wu.a("commands.ban.success", wu.b($$5.getName()), $$6.d()), true);
            aqi $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(wu.c("multiplayer.disconnect.banned"));
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
