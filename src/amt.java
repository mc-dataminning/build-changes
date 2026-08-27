import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class amt {
   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("list").executes($$0x -> a((ec)$$0x.getSource())))
            .then(ed.a("uuids").executes($$0x -> b((ec)$$0x.getSource())))
      );
   }

   private static int a(ec $$0) {
      return a($$0, ckl::O_);
   }

   private static int b(ec $$0) {
      return a($$0, $$0x -> ws.a("commands.list.nameAndId", $$0x.ad(), ws.a($$0x.fZ().getId())));
   }

   private static int a(ec $$0, Function<aqf, ws> $$1) {
      aub $$2 = $$0.l().ah();
      List<aqf> $$3 = $$2.t();
      ws $$4 = wv.b($$3, $$1);
      $$0.a(() -> ws.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
