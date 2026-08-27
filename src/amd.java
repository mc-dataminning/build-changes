import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amd {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.deop.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("deop").requires($$0x -> $$0x.c(3)))
            .then(
               ef.a("targets", et.a())
                  .suggests(($$0x, $$1) -> ej.a(((ee)$$0x.getSource()).l().ah().l(), $$1))
                  .executes($$0x -> a((ee)$$0x.getSource(), et.a($$0x, "targets")))
            )
      );
   }

   private static int a(ee $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auj $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if ($$2.f($$4)) {
            $$2.b($$4);
            $$3++;
            $$0.a(() -> wx.a("commands.deop.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         $$0.l().a($$0);
         return $$3;
      }
   }
}
