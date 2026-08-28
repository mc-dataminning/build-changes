import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoa {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xl.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xl.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ex.a("targets", fj.d())
                     .executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), xl.c("multiplayer.disconnect.kicked"))))
                  .then(ex.a("reason", fn.a()).executes($$0x -> a((ew)$$0x.getSource(), fj.f($$0x, "targets"), fn.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ew $$0, Collection<arr> $$1, xl $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (arr $$4 : $$1) {
            if (!$$0.l().a($$4.gk())) {
               $$4.g.a($$2);
               $$0.a(() -> xl.a("commands.kick.success", $$4.S_(), $$2), true);
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
