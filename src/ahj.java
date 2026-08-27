import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahj {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ds.a("targets", ee.a())
                  .suggests(($$0x, $$1) -> du.a(((dr)$$0x.getSource()).l().ac().f().a(), $$1))
                  .executes($$0x -> a((dr)$$0x.getSource(), ee.a($$0x, "targets")))
            )
      );
   }

   private static int a(dr $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aof $$2 = $$0.l().ac().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> tf.a("commands.pardon.success", tf.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
