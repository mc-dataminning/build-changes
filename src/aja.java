import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aja {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
            .then(dv.a("uuids").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      return a($$0, cdz::Q_);
   }

   private static int b(du $$0) {
      return a($$0, $$0x -> uv.a("commands.list.nameAndId", $$0x.ad(), uv.a($$0x.fS().getId())));
   }

   private static int a(du $$0, Function<amj, uv> $$1) {
      apy $$2 = $$0.l().ae();
      List<amj> $$3 = $$2.t();
      uv $$4 = uy.b($$3, $$1);
      $$0.a(() -> uv.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
