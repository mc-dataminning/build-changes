import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import javax.annotation.Nullable;

public class afz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.ban.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("ban").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ds.a("targets", ee.a()).executes($$0x -> a((dr)$$0x.getSource(), ee.a($$0x, "targets"), null)))
                  .then(ds.a("reason", eg.a()).executes($$0x -> a((dr)$$0x.getSource(), ee.a($$0x, "targets"), eg.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dr $$0, Collection<GameProfile> $$1, @Nullable tf $$2) throws CommandSyntaxException {
      aof $$3 = $$0.l().ac().f();
      int $$4 = 0;

      for (GameProfile $$5 : $$1) {
         if (!$$3.a($$5)) {
            aog $$6 = new aog($$5, null, $$0.c(), null, $$2 == null ? null : $$2.getString());
            $$3.a($$6);
            $$4++;
            $$0.a(() -> tf.a("commands.ban.success", tf.b($$5.getName()), $$6.d()), true);
            akl $$7 = $$0.l().ac().a($$5.getId());
            if ($$7 != null) {
               $$7.c.b(tf.c("multiplayer.disconnect.banned"));
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
