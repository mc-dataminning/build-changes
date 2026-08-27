import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.deop.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               dv.a("targets", ei.a())
                  .suggests(($$0x, $$1) -> dy.a(((du)$$0x.getSource()).m().ae().l(), $$1))
                  .executes($$0x -> a((du)$$0x.getSource(), ei.a($$0x, "targets")))
            )
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      apu $$2 = $$0.m().ae();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> ur.a("commands.deop.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         $$0.m().a($$0);
         return $$3;
      }
   }
}
