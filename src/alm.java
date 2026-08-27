import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class alm {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
            .then(dv.a("uuids").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      return a($$0, chl::Q_);
   }

   private static int b(du $$0) {
      return a($$0, $$0x -> vq.a("commands.list.nameAndId", $$0x.ad(), vq.a($$0x.fS().getId())));
   }

   private static int a(du $$0, Function<aox, vq> $$1) {
      aso $$2 = $$0.l().ag();
      List<aox> $$3 = $$2.t();
      vq $$4 = vt.b($$3, $$1);
      $$0.a(() -> vq.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
