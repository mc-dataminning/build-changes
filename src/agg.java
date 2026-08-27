import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class agg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.ban.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", eg.a()).executes($$0x -> a((dt)$$0x.getSource(), eg.a($$0x, "targets"), null)))
                  .then(du.a("reason", ei.a()).executes($$0x -> a((dt)$$0x.getSource(), eg.a($$0x, "targets"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dt $$0, Collection<GameProfile> $$1, @Nullable tn $$2) throws CommandSyntaxException {
      aoo $$3 = $$0.l().ac().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            aop $$6 = new aop($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> tn.a("commands.ban.success", tn.b($$5.getName()), $$6.d()), true);
            akt $$7 = $$0.l().ac().a($$5.getId());
            if ($$7 != null) {
               $$7.c.b(tn.c("multiplayer.disconnect.banned"));
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
