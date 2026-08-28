import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class any {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("list").executes($$0x -> a((ej)$$0x.getSource())))
            .then(ek.a("uuids").executes($$0x -> b((ej)$$0x.getSource())))
      );
   }

   private static int a(ej $$0) {
      return a($$0, crj::m_);
   }

   private static int b(ej $$0) {
      return a($$0, $$0x -> wy.a("commands.list.nameAndId", $$0x.ai(), wy.a($$0x.gh().getId())));
   }

   private static int a(ej $$0, Function<arr, wy> $$1) {
      avq $$2 = $$0.l().ag();
      List<arr> $$3 = $$2.t();
      wy $$4 = xb.b($$3, $$1);
      $$0.a(() -> wy.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
