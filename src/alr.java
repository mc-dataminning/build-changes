import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class alr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               dv.a("targets", ej.a())
                  .suggests(($$0x, $$1) -> dz.a(((du)$$0x.getSource()).l().ae().f().a(), $$1))
                  .executes($$0x -> a((du)$$0x.getSource(), ej.a($$0x, "targets")))
            )
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      ast $$2 = $$0.l().ae().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> vq.a("commands.pardon.success", vq.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
