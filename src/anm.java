import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xe.c("commands.op.failed"));

   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("op").requires($$0x -> $$0x.c(3))).then(ei.a("targets", ew.a()).suggests(($$0x, $$1) -> {
            auq $$2 = ((eh)$$0x.getSource()).l().ah();
            return em.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gk())).map($$0xx -> $$0xx.gk().getName()), $$1);
         }).executes($$0x -> a((eh)$$0x.getSource(), ew.a($$0x, "targets"))))
      );
   }

   private static int a(eh $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auq $$2 = $$0.l().ah();
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
