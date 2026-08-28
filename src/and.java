import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ez.a()).executes($$0x -> a((ek)$$0x.getSource(), ez.a($$0x, "targets"), null)))
                  .then(el.a("reason", fb.a()).executes($$0x -> a((ek)$$0x.getSource(), ez.a($$0x, "targets"), fb.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ek $$0, Collection<GameProfile> $$1, @Nullable xg $$2) throws CommandSyntaxException {
      awh $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            awi $$6 = new awi($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xg.a("commands.ban.success", xg.b($$5.getName()), $$6.d()), true);
            asc $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.f.a(xg.c("multiplayer.disconnect.banned"));
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
