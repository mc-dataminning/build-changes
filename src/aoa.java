import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ev.a("targets", fj.a())
                  .suggests(($$0x, $$1) -> ez.a(((eu)$$0x.getSource()).l().ag().f().a(), $$1))
                  .executes($$0x -> a((eu)$$0x.getSource(), fj.a($$0x, "targets")))
            )
      );
   }

   private static int a(eu $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avp $$2 = $$0.l().ag().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> xe.a("commands.pardon.success", xe.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
