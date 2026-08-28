import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class aml {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)eq.a("targets", fe.a()).executes($$0x -> a((ep)$$0x.getSource(), fe.a($$0x, "targets"), null)))
                  .then(eq.a("reason", fg.a()).executes($$0x -> a((ep)$$0x.getSource(), fe.a($$0x, "targets"), fg.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ep $$0, Collection<GameProfile> $$1, @Nullable xl $$2) throws CommandSyntaxException {
      avf $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avg $$6 = new avg($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xl.a("commands.ban.success", xl.b($$5.getName()), $$6.d()), true);
            arc $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.c.b(xl.c("multiplayer.disconnect.banned"));
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
