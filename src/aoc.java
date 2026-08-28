import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aoc {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("list").executes($$0x -> a((ew)$$0x.getSource())))
            .then(ex.a("uuids").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) {
      return a($$0, cor::S_);
   }

   private static int b(ew $$0) {
      return a($$0, $$0x -> xl.a("commands.list.nameAndId", $$0x.am(), xl.a($$0x.gk().getId())));
   }

   private static int a(ew $$0, Function<arr, xl> $$1) {
      avr $$2 = $$0.l().ag();
      List<arr> $$3 = $$2.t();
      xl $$4 = xo.b($$3, $$1);
      $$0.a(() -> xl.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
