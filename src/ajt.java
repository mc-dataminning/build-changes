import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajt {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(vg.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ef.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), vg.c("multiplayer.disconnect.kicked"))))
                  .then(dt.a("reason", ej.a()).executes($$0x -> a((ds)$$0x.getSource(), ef.f($$0x, "targets"), ej.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, Collection<anf> $$1, vg $$2) throws CommandSyntaxException {
      if (!$$0.l().p()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (anf $$4 : $$1) {
            if (!$$0.l().a($$4.fR())) {
               $$4.c.b($$2);
               $$0.a(() -> vg.a("commands.kick.success", $$4.Q_(), $$2), true);
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
