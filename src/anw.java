import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anw {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(xh.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ew.a("targets", fi.d())
                     .executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), xh.c("multiplayer.disconnect.kicked"))))
                  .then(ew.a("reason", fm.a()).executes($$0x -> a((ev)$$0x.getSource(), fi.f($$0x, "targets"), fm.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ev $$0, Collection<arn> $$1, xh $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (arn $$4 : $$1) {
            if (!$$0.l().a($$4.gj())) {
               $$4.d.a($$2);
               $$0.a(() -> xh.a("commands.kick.success", $$4.S_(), $$2), true);
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
