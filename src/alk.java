import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class alk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vq.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vq.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eh.d())
                     .executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), vq.c("multiplayer.disconnect.kicked"))))
                  .then(dv.a("reason", el.a()).executes($$0x -> a((du)$$0x.getSource(), eh.f($$0x, "targets"), el.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, Collection<aow> $$1, vq $$2) throws CommandSyntaxException {
      if (!$$0.l().p()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (aow $$4 : $$1) {
            if (!$$0.l().a($$4.fS())) {
               $$4.d.b($$2);
               $$0.a(() -> vq.a("commands.kick.success", $$4.Q_(), $$2), true);
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
