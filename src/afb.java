import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class afb {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("list").executes($$0x -> a((ds)$$0x.getSource())))
            .then(dt.a("uuids").executes($$0x -> b((ds)$$0x.getSource())))
      );
   }

   private static int a(ds $$0) {
      return a($$0, byo::H_);
   }

   private static int b(ds $$0) {
      return a($$0, $$0x -> sw.a("commands.list.nameAndId", $$0x.Z(), $$0x.fM().getId()));
   }

   private static int a(ds $$0, Function<aig, sw> $$1) {
      alk $$2 = $$0.l().ac();
      List<aig> $$3 = $$2.t();
      sw $$4 = sy.b($$3, $$1);
      $$0.a(() -> sw.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
