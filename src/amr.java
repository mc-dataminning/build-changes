import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(ws.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ed.a("targets", ep.d())
                     .executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), ws.c("multiplayer.disconnect.kicked"))))
                  .then(ed.a("reason", et.a()).executes($$0x -> a((ec)$$0x.getSource(), ep.f($$0x, "targets"), et.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ec $$0, Collection<aqf> $$1, ws $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (aqf $$4 : $$1) {
            if (!$$0.l().a($$4.fZ())) {
               $$4.d.b($$2);
               $$0.a(() -> ws.a("commands.kick.success", $$4.O_(), $$2), true);
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
