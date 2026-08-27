import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class ajl {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vb.c("commands.op.failed"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("op").requires($$0x -> $$0x.c(3))).then(dt.a("targets", eg.a()).suggests(($$0x, $$1) -> {
            aqf $$2 = ((ds)$$0x.getSource()).l().ae();
            return dw.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fR())).map($$0xx -> $$0xx.fR().getName()), $$1);
         }).executes($$0x -> a((ds)$$0x.getSource(), eg.a($$0x, "targets"))))
      );
   }

   private static int a(ds $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aqf $$2 = $$0.l().ae();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> vb.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
