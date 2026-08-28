import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anv {
   public static void a(CommandDispatcher<eu> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ev.a("list").executes($$0x -> a((eu)$$0x.getSource())))
            .then(ev.a("uuids").executes($$0x -> b((eu)$$0x.getSource())))
      );
   }

   private static int a(eu $$0) {
      return a($$0, cnx::R_);
   }

   private static int b(eu $$0) {
      return a($$0, $$0x -> xe.a("commands.list.nameAndId", $$0x.aj(), xe.a($$0x.gc().getId())));
   }

   private static int a(eu $$0, Function<ark, xe> $$1) {
      avj $$2 = $$0.l().ag();
      List<ark> $$3 = $$2.t();
      xe $$4 = xh.b($$3, $$1);
      $$0.a(() -> xe.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
