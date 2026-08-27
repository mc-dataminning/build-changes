import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amu {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wu.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ee.a("targets", eq.d())
                     .executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), wu.c("multiplayer.disconnect.kicked"))))
                  .then(ee.a("reason", eu.a()).executes($$0x -> a((ed)$$0x.getSource(), eq.f($$0x, "targets"), eu.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ed $$0, Collection<aqi> $$1, wu $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (aqi $$4 : $$1) {
            if (!$$0.l().a($$4.fZ())) {
               $$4.d.b($$2);
               $$0.a(() -> wu.a("commands.kick.success", $$4.O_(), $$2), true);
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
