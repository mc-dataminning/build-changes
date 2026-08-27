import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aly {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.deop.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               ee.a("targets", es.a())
                  .suggests(($$0x, $$1) -> ei.a(((ed)$$0x.getSource()).l().ah().l(), $$1))
                  .executes($$0x -> a((ed)$$0x.getSource(), es.a($$0x, "targets")))
            )
      );
   }

   private static int a(ed $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aue $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> wu.a("commands.deop.success", $$1.iterator().next().getName()), true);
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
