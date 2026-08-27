import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class amd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.ban.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ei.a("targets", ew.a()).executes($$0x -> a((eh)$$0x.getSource(), ew.a($$0x, "targets"), null)))
                  .then(ei.a("reason", ey.a()).executes($$0x -> a((eh)$$0x.getSource(), ew.a($$0x, "targets"), ey.a($$0x, "reason"))))
            )
      );
   }

   private static int a(eh $$0, Collection<GameProfile> $$1, @Nullable xe $$2) throws CommandSyntaxException {
      auw $$3 = $$0.l().ah().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            auy $$6 = new auy($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> xe.a("commands.ban.success", xe.b($$5.getName()), $$6.d()), true);
            aqu $$7 = $$0.l().ah().a($$5.getId());
            if ($$7 != null) {
               $$7.d.b(xe.c("multiplayer.disconnect.banned"));
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
