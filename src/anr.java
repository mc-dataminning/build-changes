import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.op.failed"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("op").requires($$0x -> $$0x.c(3))).then(ey.a("targets", fm.a()).suggests(($$0x, $$1) -> {
            avd $$2 = ((ex)$$0x.getSource()).l().ag();
            return fc.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gh())).map($$0xx -> $$0xx.gh().getName()), $$1);
         }).executes($$0x -> a((ex)$$0x.getSource(), fm.a($$0x, "targets"))))
      );
   }

   private static int a(ex $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avd $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> wp.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
