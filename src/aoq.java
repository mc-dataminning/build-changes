import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aoq {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("list").executes($$0x -> a((ew)$$0x.getSource())))
            .then(ex.a("uuids").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) {
      return a($$0, cps::p_);
   }

   private static int b(ew $$0) {
      return a($$0, $$0x -> xv.a("commands.list.nameAndId", $$0x.al(), xv.a($$0x.gf().getId())));
   }

   private static int a(ew $$0, Function<asi, xv> $$1) {
      awi $$2 = $$0.l().ag();
      List<asi> $$3 = $$2.t();
      xv $$4 = xy.b($$3, $$1);
      $$0.a(() -> xv.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
