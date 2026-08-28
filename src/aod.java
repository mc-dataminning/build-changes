import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aod {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wy.c("commands.op.failed"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("op").requires($$0x -> $$0x.c(3))).then(ej.a("targets", ex.a()).suggests(($$0x, $$1) -> {
            avq $$2 = ((ei)$$0x.getSource()).l().ag();
            return en.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gh())).map($$0xx -> $$0xx.gh().getName()), $$1);
         }).executes($$0x -> a((ei)$$0x.getSource(), ex.a($$0x, "targets"))))
      );
   }

   private static int a(ei $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
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
