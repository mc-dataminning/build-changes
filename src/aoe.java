import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoe {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               ek.a("targets", ey.a())
                  .suggests(($$0x, $$1) -> eo.a(((ej)$$0x.getSource()).l().ag().f().a(), $$1))
                  .executes($$0x -> a((ej)$$0x.getSource(), ey.a($$0x, "targets")))
            )
      );
   }

   private static int a(ej $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avw $$2 = $$0.l().ag().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> wy.a("commands.pardon.success", wy.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
