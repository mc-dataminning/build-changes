import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class ahr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.ban.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", ei.a()).executes($$0x -> a((du)$$0x.getSource(), ei.a($$0x, "targets"), null)))
                  .then(dv.a("reason", ek.a()).executes($$0x -> a((du)$$0x.getSource(), ei.a($$0x, "targets"), ek.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1, @Nullable ur $$2) throws CommandSyntaxException {
      aqa $$3 = $$0.m().ae().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            aqb $$6 = new aqb($$5, null, $$0.d(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> ur.a("commands.ban.success", ur.b($$5.getName()), $$6.d()), true);
            amf $$7 = $$0.m().ae().a($$5.getId());
            if ($$7 != null) {
               $$7.c.b(ur.c("multiplayer.disconnect.banned"));
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
