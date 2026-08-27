import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class akq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vu.c("commands.ban.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", ej.a()).executes($$0x -> a((du)$$0x.getSource(), ej.a($$0x, "targets"), null)))
                  .then(dv.a("reason", el.a()).executes($$0x -> a((du)$$0x.getSource(), ej.a($$0x, "targets"), el.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1, @Nullable vu $$2) throws CommandSyntaxException {
      ath $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            ati $$6 = new ati($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> vu.a("commands.ban.success", vu.b($$5.getName()), $$6.d()), true);
            apg $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(vu.c("multiplayer.disconnect.banned"));
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
