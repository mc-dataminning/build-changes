import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class amu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xi.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ex.a("targets", fl.a()).executes($$0x -> a((ew)$$0x.getSource(), fl.a($$0x, "targets"), null)))
                  .then(ex.a("reason", fn.a()).executes($$0x -> a((ew)$$0x.getSource(), fl.a($$0x, "targets"), fn.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ew $$0, Collection<GameProfile> $$1, @Nullable xi $$2) throws CommandSyntaxException {
      avu $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avv $$6 = new avv($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xi.a("commands.ban.success", xi.b($$5.getName()), $$6.d()), true);
            aro $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.g.a(xi.c("multiplayer.disconnect.banned"));
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
