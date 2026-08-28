import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anz {
   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("list").executes($$0x -> a((ew)$$0x.getSource())))
            .then(ex.a("uuids").executes($$0x -> b((ew)$$0x.getSource())))
      );
   }

   private static int a(ew $$0) {
      return a($$0, com::S_);
   }

   private static int b(ew $$0) {
      return a($$0, $$0x -> xi.a("commands.list.nameAndId", $$0x.am(), xi.a($$0x.gj().getId())));
   }

   private static int a(ew $$0, Function<aro, xi> $$1) {
      avo $$2 = $$0.l().ag();
      List<aro> $$3 = $$2.t();
      xi $$4 = xl.b($$3, $$1);
      $$0.a(() -> xi.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
