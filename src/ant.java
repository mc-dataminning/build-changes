import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ant {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("list").executes($$0x -> a((et)$$0x.getSource())))
            .then(eu.a("uuids").executes($$0x -> b((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) {
      return a($$0, cnu::Q_);
   }

   private static int b(et $$0) {
      return a($$0, $$0x -> xd.a("commands.list.nameAndId", $$0x.aj(), xd.a($$0x.gb().getId())));
   }

   private static int a(et $$0, Function<ari, xd> $$1) {
      avh $$2 = $$0.l().ag();
      List<ari> $$3 = $$2.t();
      xd $$4 = xg.b($$3, $$1);
      $$0.a(() -> xd.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
