import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.op.failed"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("op").requires($$0x -> $$0x.c(3))).then(ex.a("targets", fl.a()).suggests(($$0x, $$1) -> {
            awi $$2 = ((ew)$$0x.getSource()).l().ag();
            return fb.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gf())).map($$0xx -> $$0xx.gf().getName()), $$1);
         }).executes($$0x -> a((ew)$$0x.getSource(), fl.a($$0x, "targets"))))
      );
   }

   private static int a(ew $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      awi $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> xv.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
