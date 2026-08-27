import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class alv {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
            .then(dv.a("uuids").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      return a($$0, cis::O_);
   }

   private static int b(du $$0) {
      return a($$0, $$0x -> vu.a("commands.list.nameAndId", $$0x.ad(), vu.a($$0x.fY().getId())));
   }

   private static int a(du $$0, Function<apg, vu> $$1) {
      atb $$2 = $$0.l().ah();
      List<apg> $$3 = $$2.t();
      vu $$4 = vx.b($$3, $$1);
      $$0.a(() -> vu.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
