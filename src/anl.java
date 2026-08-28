import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anl {
   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("list").executes($$0x -> a((ex)$$0x.getSource())))
            .then(ey.a("uuids").executes($$0x -> b((ex)$$0x.getSource())))
      );
   }

   private static int a(ex $$0) {
      return a($$0, cov::p_);
   }

   private static int b(ex $$0) {
      return a($$0, $$0x -> wo.a("commands.list.nameAndId", $$0x.al(), wo.a($$0x.gh().getId())));
   }

   private static int a(ex $$0, Function<ard, wo> $$1) {
      avc $$2 = $$0.l().ag();
      List<ard> $$3 = $$2.t();
      wo $$4 = wr.b($$3, $$1);
      $$0.a(() -> wo.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
