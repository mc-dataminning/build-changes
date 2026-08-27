import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tl.c("commands.op.failed"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("op").requires($$0x -> $$0x.c(3))).then(du.a("targets", eg.a()).suggests(($$0x, $$1) -> {
            aoj $$2 = ((dt)$$0x.getSource()).l().ac();
            return dw.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fR())).map($$0xx -> $$0xx.fR().getName()), $$1);
         }).executes($$0x -> a((dt)$$0x.getSource(), eg.a($$0x, "targets"))))
      );
   }

   private static int a(dt $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aoj $$2 = $$0.l().ac();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> tl.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
