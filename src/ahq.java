import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tn.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               du.a("targets", eg.a())
                  .suggests(($$0x, $$1) -> dw.a(((dt)$$0x.getSource()).l().ac().f().a(), $$1))
                  .executes($$0x -> a((dt)$$0x.getSource(), eg.a($$0x, "targets")))
            )
      );
   }

   private static int a(dt $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoo $$2 = $$0.l().ac().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> tn.a("commands.pardon.success", tn.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
