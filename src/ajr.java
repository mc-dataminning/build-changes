import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ajr {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
            .then(dt.a("uuids").executes($$0x -> b((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) {
      return a($$0, cfb::Q_);
   }

   private static int b(ds $$0) {
      return a($$0, $$0x -> vd.a("commands.list.nameAndId", $$0x.ad(), vd.a($$0x.fR().getId())));
   }

   private static int a(ds $$0, Function<ana, vd> $$1) {
      aqp $$2 = $$0.l().ae();
      List<ana> $$3 = $$2.t();
      vd $$4 = vg.b($$3, $$1);
      $$0.a(() -> vd.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
