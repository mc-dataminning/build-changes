import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anw {
   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("list").executes($$0x -> a((ei)$$0x.getSource())))
            .then(ej.a("uuids").executes($$0x -> b((ei)$$0x.getSource())))
      );
   }

   private static int a(ei $$0) {
      return a($$0, cqs::m_);
   }

   private static int b(ei $$0) {
      return a($$0, $$0x -> ww.a("commands.list.nameAndId", $$0x.al(), ww.a($$0x.gh().getId())));
   }

   private static int a(ei $$0, Function<arp, ww> $$1) {
      avo $$2 = $$0.l().ag();
      List<arp> $$3 = $$2.t();
      ww $$4 = wz.b($$3, $$1);
      $$0.a(() -> ww.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
