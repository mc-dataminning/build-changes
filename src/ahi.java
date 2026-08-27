import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahi {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.op.failed"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("op").requires($$0x -> $$0x.c(3))).then(ds.a("targets", ee.a()).suggests(($$0x, $$1) -> {
            anz $$2 = ((dr)$$0x.getSource()).l().ac();
            return du.b($$2.t().stream().filter($$1x -> !$$2.g($$1x.fP())).map($$0xx -> $$0xx.fP().getName()), $$1);
         }).executes($$0x -> a((dr)$$0x.getSource(), ee.a($$0x, "targets"))))
      );
   }

   private static int a(dr $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      anz $$2 = $$0.l().ac();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.g($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> tf.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
