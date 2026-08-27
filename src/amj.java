import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class amj {
   public static void a(CommandDispatcher<dv> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dw.a("list").executes($$0x -> a((dv)$$0x.getSource())))
            .then(dw.a("uuids").executes($$0x -> b((dv)$$0x.getSource())))
      );
   }

   private static int a(dv $$0) {
      return a($$0, cka::O_);
   }

   private static int b(dv $$0) {
      return a($$0, $$0x -> wi.a("commands.list.nameAndId", $$0x.ad(), wi.a($$0x.fY().getId())));
   }

   private static int a(dv $$0, Function<apv, wi> $$1) {
      atr $$2 = $$0.l().ah();
      List<apv> $$3 = $$2.t();
      wi $$4 = wl.b($$3, $$1);
      $$0.a(() -> wi.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
