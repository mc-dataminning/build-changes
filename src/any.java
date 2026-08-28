import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class any {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("list").executes($$0x -> a((ev)$$0x.getSource())))
            .then(ew.a("uuids").executes($$0x -> b((ev)$$0x.getSource())))
      );
   }

   private static int a(ev $$0) {
      return a($$0, coh::S_);
   }

   private static int b(ev $$0) {
      return a($$0, $$0x -> xh.a("commands.list.nameAndId", $$0x.al(), xh.a($$0x.gj().getId())));
   }

   private static int a(ev $$0, Function<arn, xh> $$1) {
      avn $$2 = $$0.l().ag();
      List<arn> $$3 = $$2.t();
      xh $$4 = xk.b($$3, $$1);
      $$0.a(() -> xh.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
