import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class alq {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
            .then(dv.a("uuids").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      return a($$0, cia::Q_);
   }

   private static int b(du $$0) {
      return a($$0, $$0x -> vs.a("commands.list.nameAndId", $$0x.ad(), vs.a($$0x.fU().getId())));
   }

   private static int a(du $$0, Function<apb, vs> $$1) {
      ass $$2 = $$0.l().ah();
      List<apb> $$3 = $$2.t();
      vs $$4 = vv.b($$3, $$1);
      $$0.a(() -> vs.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
