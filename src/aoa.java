import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aoa {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("list").executes($$0x -> a((ew)$$0x.getSource())))
            .then(ex.a("uuids").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) {
      return a($$0, cou::o_);
   }

   private static int b(ew $$0) {
      return a($$0, $$0x -> xj.a("commands.list.nameAndId", $$0x.al(), xj.a($$0x.gf().getId())));
   }

   private static int a(ew $$0, Function<arq, xj> $$1) {
      avq $$2 = $$0.l().ag();
      List<arq> $$3 = $$2.t();
      xj $$4 = xm.b($$3, $$1);
      $$0.a(() -> xj.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
