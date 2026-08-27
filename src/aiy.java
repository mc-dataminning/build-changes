import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aiy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(uv.c("commands.kick.owner.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eg.d())
                     .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), uv.c("multiplayer.disconnect.kicked"))))
                  .then(dv.a("reason", ek.a()).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ek.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, Collection<amj> $$1, uv $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (amj $$4 : $$1) {
         if (!$$0.l().a($$4.fS())) {
            $$4.c.b($$2);
            $$0.a(() -> uv.a("commands.kick.success", $$4.Q_(), $$2), true);
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
