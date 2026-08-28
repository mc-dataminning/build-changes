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

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ej.a("targets", ex.a()).executes($$0x -> a((ei)$$0x.getSource(), ex.a($$0x, "targets"), null)))
                  .then(ej.a("reason", ez.a()).executes($$0x -> a((ei)$$0x.getSource(), ex.a($$0x, "targets"), ez.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ei $$0, Collection<GameProfile> $$1, @Nullable wy $$2) throws CommandSyntaxException {
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
