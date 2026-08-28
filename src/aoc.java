import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aoc {
   public static void a(CommandDispatcher<ek> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)el.a("list").executes($$0x -> a((ek)$$0x.getSource())))
            .then(el.a("uuids").executes($$0x -> b((ek)$$0x.getSource())))
      );
   }

   private static int a(ek $$0) {
      return a($$0, crz::m_);
   }

   private static int b(ek $$0) {
      return a($$0, $$0x -> xc.a("commands.list.nameAndId", $$0x.ai(), xc.a($$0x.gi().getId())));
   }

   private static int a(ek $$0, Function<arv, xc> $$1) {
      avu $$2 = $$0.l().ag();
      List<arv> $$3 = $$2.t();
      xc $$4 = xf.b($$3, $$1);
      $$0.a(() -> xc.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
