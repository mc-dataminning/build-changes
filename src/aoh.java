import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoh {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xg.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xg.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)el.a("targets", ex.d())
                     .executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), xg.c("multiplayer.disconnect.kicked"))))
                  .then(el.a("reason", fb.a()).executes($$0x -> a((ek)$$0x.getSource(), ex.f($$0x, "targets"), fb.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ek $$0, Collection<asc> $$1, xg $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (asc $$4 : $$1) {
            if (!$$0.l().a($$4.gi())) {
               $$4.f.a($$2);
               $$0.a(() -> xg.a("commands.kick.success", $$4.m_(), $$2), true);
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
