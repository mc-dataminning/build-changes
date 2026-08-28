import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ang {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("list").executes($$0x -> a((et)$$0x.getSource())))
            .then(eu.a("uuids").executes($$0x -> b((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) {
      return a($$0, cmv::O_);
   }

   private static int b(et $$0) {
      return a($$0, $$0x -> wy.a("commands.list.nameAndId", $$0x.ah(), wy.a($$0x.fY().getId())));
   }

   private static int a(et $$0, Function<aqu, wy> $$1) {
      auq $$2 = $$0.l().ah();
      List<aqu> $$3 = $$2.t();
      wy $$4 = xb.b($$3, $$1);
      $$0.a(() -> wy.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
