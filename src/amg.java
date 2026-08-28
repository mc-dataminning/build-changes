import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class amg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ey.a("targets", fm.a()).executes($$0x -> a((ex)$$0x.getSource(), fm.a($$0x, "targets"), null)))
                  .then(ey.a("reason", fo.a()).executes($$0x -> a((ex)$$0x.getSource(), fm.a($$0x, "targets"), fo.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ex $$0, Collection<GameProfile> $$1, @Nullable wp $$2) throws CommandSyntaxException {
      avj $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avk $$6 = new avk($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> wp.a("commands.ban.success", wp.b($$5.getName()), $$6.d()), true);
            are $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.f.a(wp.c("multiplayer.disconnect.banned"));
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
