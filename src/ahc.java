import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ahc {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
            .then(dt.a("uuids").executes($$0x -> b((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) {
      return a($$0, cbl::H_);
   }

   private static int b(ds $$0) {
      return a($$0, $$0x -> te.a("commands.list.nameAndId", $$0x.ab(), $$0x.fP().getId()));
   }

   private static int a(ds $$0, Function<akj, te> $$1) {
      anx $$2 = $$0.l().ac();
      List<akj> $$3 = $$2.t();
      te $$4 = tg.b($$3, $$1);
      $$0.a(() -> te.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
