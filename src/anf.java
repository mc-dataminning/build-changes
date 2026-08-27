import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class anf {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wx.c("commands.op.failed"));

   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("op").requires($$0x -> $$0x.c(3))).then(ef.a("targets", et.a()).suggests(($$0x, $$1) -> {
            auj $$2 = ((ee)$$0x.getSource()).l().ah();
            return ej.b($$2.t().stream().filter($$1x -> !$$2.f($$1x.gb())).map($$0xx -> $$0xx.gb().getName()), $$1);
         }).executes($$0x -> a((ee)$$0x.getSource(), et.a($$0x, "targets"))))
      );
   }

   private static int a(ee $$0, Collection<GameProfile> $$1) throws CommandSyntaxException {
      auj $$2 = $$0.l().ah();
      int $$3 = 0;

      for (GameProfile $$4 : $$1) {
         if (!$$2.f($$4)) {
            $$2.a($$4);
            $$3++;
            $$0.a(() -> wx.a("commands.op.success", $$1.iterator().next().getName()), true);
         }
      }

      if ($$3 == 0) {
         throw a.create();
      } else {
         return $$3;
      }
   }
}
