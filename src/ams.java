import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class ams {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.ban.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ek.a("targets", ey.a()).executes($$0x -> a((ej)$$0x.getSource(), ey.a($$0x, "targets"), null)))
                  .then(ek.a("reason", fa.a()).executes($$0x -> a((ej)$$0x.getSource(), ey.a($$0x, "targets"), fa.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ej $$0, Collection<GameProfile> $$1, @Nullable wy $$2) throws CommandSyntaxException {
      avw $$3 = $$0.l().ag().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            avx $$6 = new avx($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> wy.a("commands.ban.success", wy.b($$5.getName()), $$6.d()), true);
            arr $$7 = $$0.l().ag().a($$5.getId());
            if ($$7 != null) {
               $$7.f.a(wy.c("multiplayer.disconnect.banned"));
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
