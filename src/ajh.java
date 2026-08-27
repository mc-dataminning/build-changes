import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ajh {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
            .then(dt.a("uuids").executes($$0x -> b((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) {
      return a($$0, cer::Q_);
   }

   private static int b(ds $$0) {
      return a($$0, $$0x -> vb.a("commands.list.nameAndId", $$0x.ad(), vb.a($$0x.fR().getId())));
   }

   private static int a(ds $$0, Function<amq, vb> $$1) {
      aqf $$2 = $$0.l().ae();
      List<amq> $$3 = $$2.t();
      vb $$4 = ve.b($$3, $$1);
      $$0.a(() -> vb.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
