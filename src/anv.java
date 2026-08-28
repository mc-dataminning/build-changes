import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anv {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("list").executes($$0x -> a((ex)$$0x.getSource())))
            .then(ey.a("uuids").executes($$0x -> b((ex)$$0x.getSource())))
      );
   }

   private static int a(ex $$0) {
      return a($$0, cqi::m_);
   }

   private static int b(ex $$0) {
      return a($$0, $$0x -> wv.a("commands.list.nameAndId", $$0x.al(), wv.a($$0x.gh().getId())));
   }

   private static int a(ex $$0, Function<aro, wv> $$1) {
      avn $$2 = $$0.l().ag();
      List<aro> $$3 = $$2.t();
      wv $$4 = wy.b($$3, $$1);
      $$0.a(() -> wv.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
