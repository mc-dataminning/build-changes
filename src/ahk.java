import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ahk {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("list").executes($$0x -> a((dt)$$0x.getSource())))
            .then(du.a("uuids").executes($$0x -> b((dt)$$0x.getSource())))
      );
   }

   private static int a(dt $$0) {
      return a($$0, cbu::N_);
   }

   private static int b(dt $$0) {
      return a($$0, $$0x -> tm.a("commands.list.nameAndId", $$0x.ab(), $$0x.fQ().getId()));
   }

   private static int a(dt $$0, Function<aks, tm> $$1) {
      aoh $$2 = $$0.l().ac();
      List<aks> $$3 = $$2.t();
      tm $$4 = to.b($$3, $$1);
      $$0.a(() -> tm.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
