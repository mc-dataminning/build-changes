import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahk {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.kick.owner.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)du.a("targets", ee.d())
                     .executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), tl.c("multiplayer.disconnect.kicked"))))
                  .then(du.a("reason", ei.a()).executes($$0x -> a((dt)$$0x.getSource(), ee.f($$0x, "targets"), ei.a($$0x, "reason"))))
            )
      );
   }

   private static int a(dt $$0, Collection<aku> $$1, tl $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (aku $$4 : $$1) {
         if (!$$0.l().a($$4.fR())) {
            $$4.c.b($$2);
            $$0.a(() -> tl.a("commands.kick.success", $$4.N_(), $$2), true);
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
