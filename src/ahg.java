import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ahg {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(te.c("commands.op.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("op").requires($$0x -> $$0x.c(3))).then(dt.a("targets", ef.a()).suggests(($$0x, $$1) -> {
            anx $$2 = ((ds)$$0x.getSource()).l().ac();
            return dv.b($$2.t().stream().filter($$1x -> !$$2.g($$1x.fP())).map($$0xx -> $$0xx.fP().getName()), $$1);
         }).executes($$0x -> a((ds)$$0x.getSource(), ef.a($$0x, "targets"))))
      );
   }

   private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      anx $$2 = $$0.l().ac();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.g($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> te.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
