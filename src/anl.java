import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wz.c("commands.op.failed"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("op").requires($$0x -> $$0x.c(3))).then(eu.a("targets", fi.a()).suggests(($$0x, $$1) -> {
            aur $$2 = ((et)$$0x.getSource()).l().ah();
            return ey.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fY())).map($$0xx -> $$0xx.fY().getName()), $$1);
         }).executes($$0x -> a((et)$$0x.getSource(), fi.a($$0x, "targets"))))
      );
   }

   private static int a(et $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aur $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> wz.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
