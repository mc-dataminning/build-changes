import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class agg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.deop.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               ds.a("targets", ee.a())
                  .suggests(($$0x, $$1) -> du.a(((dr)$$0x.getSource()).l().ac().l(), $$1))
                  .executes($$0x -> a((dr)$$0x.getSource(), ee.a($$0x, "targets")))
            )
      );
   }

   private static int a(dr $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      anz $$2 = $$0.l().ac();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.g($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> tf.a("commands.deop.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         $$0.l().a($$0);
         return $$3;
      }
   }
}
