import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ain {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ui.c("commands.op.failed"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("op").requires($$0x -> $$0x.c(3))).then(dv.a("targets", ei.a()).suggests(($$0x, $$1) -> {
            apg $$2 = ((du)$$0x.getSource()).m().ac();
            return dy.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fR())).map($$0xx -> $$0xx.fR().getName()), $$1);
         }).executes($$0x -> a((du)$$0x.getSource(), ei.a($$0x, "targets"))))
      );
   }

   private static int a(du $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      apg $$2 = $$0.m().ac();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> ui.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
