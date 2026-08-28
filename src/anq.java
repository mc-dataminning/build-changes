import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anq {
   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("list").executes($$0x -> a((ep)$$0x.getSource())))
            .then(eq.a("uuids").executes($$0x -> b((ep)$$0x.getSource())))
      );
   }

   private static int a(ep $$0) {
      return a($$0, cms::O_);
   }

   private static int b(ep $$0) {
      return a($$0, $$0x -> xl.a("commands.list.nameAndId", $$0x.af(), xl.a($$0x.gb().getId())));
   }

   private static int a(ep $$0, Function<arc, xl> $$1) {
      auz $$2 = $$0.l().ah();
      List<arc> $$3 = $$2.t();
      xl $$4 = xo.b($$3, $$1);
      $$0.a(() -> xl.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
