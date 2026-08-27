import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class amx {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.op.failed"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("op").requires($$0x -> $$0x.c(3))).then(ed.a("targets", er.a()).suggests(($$0x, $$1) -> {
            aub $$2 = ((ec)$$0x.getSource()).l().ah();
            return eh.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.fZ())).map($$0xx -> $$0xx.fZ().getName()), $$1);
         }).executes($$0x -> a((ec)$$0x.getSource(), er.a($$0x, "targets"))))
      );
   }

   private static int a(ec $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      aub $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> ws.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
