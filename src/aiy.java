import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aiy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.pardon.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("pardon").requires($$0x -> $$0x.c(3)))
            .then(
               dv.a("targets", ei.a())
                  .suggests(($$0x, $$1) -> dy.a(((du)$$0x.getSource()).m().ac().f().a(), $$1))
                  .executes($$0x -> a((du)$$0x.getSource(), ei.a($$0x, "targets")))
            )
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      apw $$2 = $$0.m().ac().f();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.a($$4)) {
            $$2.c($$4);
            $$3++;
            $$0.a(() -> ur.a("commands.pardon.success", ur.b($$4.getName())), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
