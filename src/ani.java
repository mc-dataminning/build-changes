import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ani {
   public static void a(CommandDispatcher<eh> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ei.a("list").executes($$0x -> a((eh)$$0x.getSource())))
            .then(ei.a("uuids").executes($$0x -> b((eh)$$0x.getSource())))
      );
   }

   private static int a(eh $$0) {
      return a($$0, cly::P_);
   }

   private static int b(eh $$0) {
      return a($$0, $$0x -> xe.a("commands.list.nameAndId", $$0x.af(), xe.a($$0x.gk().getId())));
   }

   private static int a(eh $$0, Function<aqu, xe> $$1) {
      auq $$2 = $$0.l().ah();
      List<aqu> $$3 = $$2.t();
      xe $$4 = xh.b($$3, $$1);
      $$0.a(() -> xe.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
