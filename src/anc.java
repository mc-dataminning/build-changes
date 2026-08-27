import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anc {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("list").executes($$0x -> a((ee)$$0x.getSource())))
            .then(ef.a("uuids").executes($$0x -> b((ee)$$0x.getSource())))
      );
   }

   private static int a(ee $$0) {
      return a($$0, cly::O_);
   }

   private static int b(ee $$0) {
      return a($$0, $$0x -> wx.a("commands.list.nameAndId", $$0x.af(), wx.a($$0x.gb().getId())));
   }

   private static int a(ee $$0, Function<aqo, wx> $$1) {
      auk $$2 = $$0.l().ah();
      List<aqo> $$3 = $$2.t();
      wx $$4 = xa.b($$3, $$1);
      $$0.a(() -> wx.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
