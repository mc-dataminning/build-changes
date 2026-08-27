import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class agm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tm.c("commands.deop.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               du.a("targets", eg.a())
                  .suggests(($$0x, $$1) -> dw.a(((dt)$$0x.getSource()).l().ac().l(), $$1))
                  .executes($$0x -> a((dt)$$0x.getSource(), eg.a($$0x, "targets")))
            )
      );
   }

   private static int a(dt $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoh $$2 = $$0.l().ac();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> tm.a("commands.deop.success", $$1.iterator().next().getName()), true);
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
