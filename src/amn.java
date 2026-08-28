import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.deop.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               ey.a("targets", fm.a())
                  .suggests(($$0x, $$1) -> fc.a(((ex)$$0x.getSource()).l().ag().l(), $$1))
                  .executes($$0x -> a((ex)$$0x.getSource(), fm.a($$0x, "targets")))
            )
      );
   }

   private static int a(ex $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avc $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> wo.a("commands.deop.success", $$1.iterator().next().getName()), true);
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
