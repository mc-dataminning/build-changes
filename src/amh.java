import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wi.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dw.a("targets", ei.d())
                     .executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), wi.c("multiplayer.disconnect.kicked"))))
                  .then(dw.a("reason", em.a()).executes($$0x -> a((dv)$$0x.getSource(), ei.f($$0x, "targets"), em.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dv $$0, Collection<apv> $$1, wi $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (apv $$4 : $$1) {
            if (!$$0.l().a($$4.fY())) {
               $$4.d.b($$2);
               $$0.a(() -> wi.a("commands.kick.success", $$4.O_(), $$2), true);
               $$3++;
            }
         }

         if ($$3 == 0) {
            throw a.create();
         } else {
            return $$3;
         }
      }
   }
}
