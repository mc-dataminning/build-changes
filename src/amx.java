import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.deop.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               ev.a("targets", fj.a())
                  .suggests(($$0x, $$1) -> ez.a(((eu)$$0x.getSource()).l().ag().l(), $$1))
                  .executes($$0x -> a((eu)$$0x.getSource(), fj.a($$0x, "targets")))
            )
      );
   }

   private static int a(eu $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avj $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> xe.a("commands.deop.success", $$1.iterator().next().getName()), true);
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
