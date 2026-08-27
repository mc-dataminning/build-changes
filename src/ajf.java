import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.kick.owner.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dt.a("targets", ee.d())
                     .executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), vb.c("multiplayer.disconnect.kicked"))))
                  .then(dt.a("reason", ei.a()).executes($$0x -> a((ds)$$0x.getSource(), ee.f($$0x, "targets"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ds $$0, Collection<amq> $$1, vb $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (amq $$4 : $$1) {
         if (!$$0.l().a($$4.fR())) {
            $$4.c.b($$2);
            $$0.a(() -> vb.a("commands.kick.success", $$4.Q_(), $$2), true);
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
