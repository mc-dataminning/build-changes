import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amn {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wi.c("commands.op.failed"));

   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("op").requires($$0x -> $$0x.c(3))).then(dw.a("targets", ek.a()).suggests(($$0x, $$1) -> {
            atr $$2 = ((dv)$$0x.getSource()).l().ah();
            return ea.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fY())).map($$0xx -> $$0xx.fY().getName()), $$1);
         }).executes($$0x -> a((dv)$$0x.getSource(), ek.a($$0x, "targets"))))
      );
   }

   private static int a(dv $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      atr $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> wi.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
