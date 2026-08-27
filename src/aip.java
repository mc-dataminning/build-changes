import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class aip {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vf.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", eh.a()).executes($$0x -> a((ds)$$0x.getSource(), eh.a($$0x, "targets"), null)))
                  .then(dt.a("reason", ej.a()).executes($$0x -> a((ds)$$0x.getSource(), eh.a($$0x, "targets"), ej.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, Collection<GameProfile> $$1, @Nullable vf $$2) throws CommandSyntaxException {
      ara $$3 = $$0.l().ae().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            arb $$6 = new arb($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> vf.a("commands.ban.success", vf.b($$5.getName()), $$6.d()), true);
            ane $$7 = $$0.l().ae().a($$5.getId());
            if ($$7 != null) {
               $$7.c.b(vf.c("multiplayer.disconnect.banned"));
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
