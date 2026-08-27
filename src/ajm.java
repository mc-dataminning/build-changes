import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               dt.a("targets", eg.a())
                  .suggests(($$0x, $$1) -> dw.a(((ds)$$0x.getSource()).l().ae().f().a(), $$1))
                  .executes($$0x -> a((ds)$$0x.getSource(), eg.a($$0x, "targets")))
            )
      );
   }

   private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aql $$2 = $$0.l().ae().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> vb.a("commands.pardon.success", vb.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
