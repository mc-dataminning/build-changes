import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ey.a("targets", fm.a())
                  .suggests(($$0x, $$1) -> fc.a(((ex)$$0x.getSource()).l().ag().f().a(), $$1))
                  .executes($$0x -> a((ex)$$0x.getSource(), fm.a($$0x, "targets")))
            )
      );
   }

   private static int a(ex $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avj $$2 = $$0.l().ag().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> wo.a("commands.pardon.success", wo.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
