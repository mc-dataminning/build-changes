import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class ale {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.ban.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dw.a("targets", ek.a()).executes($$0x -> a((dv)$$0x.getSource(), ek.a($$0x, "targets"), null)))
                  .then(dw.a("reason", em.a()).executes($$0x -> a((dv)$$0x.getSource(), ek.a($$0x, "targets"), em.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dv $$0, Collection<GameProfile> $$1, @Nullable wi $$2) throws CommandSyntaxException {
      atx $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            aty $$6 = new aty($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> wi.a("commands.ban.success", wi.b($$5.getName()), $$6.d()), true);
            apv $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(wi.c("multiplayer.disconnect.banned"));
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
