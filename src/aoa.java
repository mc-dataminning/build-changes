import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aoa {
   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("list").executes($$0x -> a((ej)$$0x.getSource())))
            .then(ek.a("uuids").executes($$0x -> b((ej)$$0x.getSource())))
      );
   }

   private static int a(ej $$0) {
      return a($$0, crx::m_);
   }

   private static int b(ej $$0) {
      return a($$0, $$0x -> xa.a("commands.list.nameAndId", $$0x.ai(), xa.a($$0x.gi().getId())));
   }

   private static int a(ej $$0, Function<art, xa> $$1) {
      avs $$2 = $$0.l().ag();
      List<art> $$3 = $$2.t();
      xa $$4 = xd.b($$3, $$1);
      $$0.a(() -> xa.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
