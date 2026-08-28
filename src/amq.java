import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class amq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.ban.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ev.a("targets", fj.a()).executes($$0x -> a((eu)$$0x.getSource(), fj.a($$0x, "targets"), null)))
                  .then(ev.a("reason", fl.a()).executes($$0x -> a((eu)$$0x.getSource(), fj.a($$0x, "targets"), fl.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eu $$0, Collection<GameProfile> $$1, @Nullable xe $$2) throws CommandSyntaxException {
      avp $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avq $$6 = new avq($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xe.a("commands.ban.success", xe.b($$5.getName()), $$6.d()), true);
            ark $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.c.a(xe.c("multiplayer.disconnect.banned"));
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
