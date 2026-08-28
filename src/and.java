import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class and {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.op.failed"));

   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("op").requires($$0x -> $$0x.c(3))).then(er.a("targets", ff.a()).suggests(($$0x, $$1) -> {
            auh $$2 = ((eq)$$0x.getSource()).l().ah();
            return ev.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fX())).map($$0xx -> $$0xx.fX().getName()), $$1);
         }).executes($$0x -> a((eq)$$0x.getSource(), ff.a($$0x, "targets"))))
      );
   }

   private static int a(eq $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auh $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> wu.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
