import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class alw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ef.a("targets", et.a()).executes($$0x -> a((ee)$$0x.getSource(), et.a($$0x, "targets"), null)))
                  .then(ef.a("reason", ev.a()).executes($$0x -> a((ee)$$0x.getSource(), et.a($$0x, "targets"), ev.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ee $$0, Collection<GameProfile> $$1, @Nullable wx $$2) throws CommandSyntaxException {
      aup $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            auq $$6 = new auq($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> wx.a("commands.ban.success", wx.b($$5.getName()), $$6.d()), true);
            aqn $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(wx.c("multiplayer.disconnect.banned"));
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
