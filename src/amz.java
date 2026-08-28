import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.deop.failed"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               ej.a("targets", ex.a())
                  .suggests(($$0x, $$1) -> en.a(((ei)$$0x.getSource()).l().ag().l(), $$1))
                  .executes($$0x -> a((ei)$$0x.getSource(), ex.a($$0x, "targets")))
            )
      );
   }

   private static int a(ei $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avq $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> wy.a("commands.deop.success", $$1.iterator().next().getName()), true);
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
