import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anz {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.op.failed"));

   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("op").requires($$0x -> $$0x.c(3))).then(ev.a("targets", fj.a()).suggests(($$0x, $$1) -> {
            avj $$2 = ((eu)$$0x.getSource()).l().ag();
            return ez.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gc())).map($$0xx -> $$0xx.gc().getName()), $$1);
         }).executes($$0x -> a((eu)$$0x.getSource(), fj.a($$0x, "targets"))))
      );
   }

   private static int a(eu $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      avj $$2 = $$0.l().ag();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> xe.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
