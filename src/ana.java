import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ana {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.kick.owner.failed"));
   private static final SimpleCommandExceptionType b = new SimpleCommandExceptionType(wx.c("commands.kick.singleplayer.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("kick").requires($$0x -> $$0x.c(3)))
            .then(
               ((RequiredArgumentBuilder)ef.a("targets", er.d())
                     .executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), wx.c("multiplayer.disconnect.kicked"))))
                  .then(ef.a("reason", ev.a()).executes($$0x -> a((ee)$$0x.getSource(), er.f($$0x, "targets"), ev.a($$0x, "reason"))))
            )
      );
   }

   private static int a(ee $$0, Collection<aqo> $$1, wx $$2) throws CommandSyntaxException {
      if (!$$0.l().r()) {
         throw b.create();
      } else {
         int $$3 = 0;

         for (aqo $$4 : $$1) {
            if (!$$0.l().a($$4.gb())) {
               $$4.c.b($$2);
               $$0.a(() -> wx.a("commands.kick.success", $$4.O_(), $$2), true);
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
