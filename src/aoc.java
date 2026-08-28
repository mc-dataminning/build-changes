import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class aoc {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xh.c("commands.op.failed"));

   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("op").requires($$0x -> $$0x.c(3))).then(ew.a("targets", fk.a()).suggests(($$0x, $$1) -> {
            avn $$2 = ((ev)$$0x.getSource()).l().ag();
            return fa.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gj())).map($$0xx -> $$0xx.gj().getName()), $$1);
         }).executes($$0x -> a((ev)$$0x.getSource(), fk.a($$0x, "targets"))))
      );
   }

   private static int a(ev $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avn $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> xh.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
