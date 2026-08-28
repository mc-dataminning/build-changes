import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anu {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("list").executes($$0x -> a((ep)$$0x.getSource())))
            .then(eq.a("uuids").executes($$0x -> b((ep)$$0x.getSource())))
      );
   }

   private static int a(ep $$0) {
      return a($$0, cmy::O_);
   }

   private static int b(ep $$0) {
      return a($$0, $$0x -> xp.a("commands.list.nameAndId", $$0x.af(), xp.a($$0x.gb().getId())));
   }

   private static int a(ep $$0, Function<arg, xp> $$1) {
      avd $$2 = $$0.l().ah();
      List<arg> $$3 = $$2.t();
      xp $$4 = xs.b($$3, $$1);
      $$0.a(() -> xp.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
