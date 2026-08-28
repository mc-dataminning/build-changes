import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anh {
   public static void a(CommandDispatcher<et> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("list").executes($$0x -> a((et)$$0x.getSource())))
            .then(eu.a("uuids").executes($$0x -> b((et)$$0x.getSource())))
      );
   }

   private static int a(et $$0) {
      return a($$0, cmx::S_);
   }

   private static int b(et $$0) {
      return a($$0, $$0x -> wz.a("commands.list.nameAndId", $$0x.ah(), wz.a($$0x.fX().getId())));
   }

   private static int a(et $$0, Function<aqv, wz> $$1) {
      aur $$2 = $$0.l().ah();
      List<aqv> $$3 = $$2.t();
      wz $$4 = xc.b($$3, $$1);
      $$0.a(() -> wz.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
