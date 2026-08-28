import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.op.failed"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("op").requires($$0x -> $$0x.c(3))).then(ek.a("targets", ey.a()).suggests(($$0x, $$1) -> {
            avq $$2 = ((ej)$$0x.getSource()).l().ag();
            return eo.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gh())).map($$0xx -> $$0xx.gh().getName()), $$1);
         }).executes($$0x -> a((ej)$$0x.getSource(), ey.a($$0x, "targets"))))
      );
   }

   private static int a(ej $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avq $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> wy.a("commands.op.success", $$4.getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
