import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class akh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.ban.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", ej.a()).executes($$0x -> a((du)$$0x.getSource(), ej.a($$0x, "targets"), null)))
                  .then(dv.a("reason", el.a()).executes($$0x -> a((du)$$0x.getSource(), ej.a($$0x, "targets"), el.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1, @Nullable vq $$2) throws CommandSyntaxException {
      asu $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            asv $$6 = new asv($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> vq.a("commands.ban.success", vq.b($$5.getName()), $$6.d()), true);
            aox $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(vq.c("multiplayer.disconnect.banned"));
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
