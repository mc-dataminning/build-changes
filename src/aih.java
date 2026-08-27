import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aih {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.kick.owner.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)dv.a("targets", eg.d())
                     .executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ui.c("multiplayer.disconnect.kicked"))))
                  .then(dv.a("reason", ek.a()).executes($$0x -> a((du)$$0x.getSource(), eg.f($$0x, "targets"), ek.a($$0x, "reason"))))
            )
      );
   }

   private static int a(du $$0, Collection<alr> $$1, ui $$2) throws CommandSyntaxException {
      int $$3 = 0;

      for (alr $$4 : $$1) {
         if (!$$0.m().a($$4.fR())) {
            $$4.c.b($$2);
            $$0.a(() -> ui.a("commands.kick.success", $$4.O_(), $$2), true);
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
