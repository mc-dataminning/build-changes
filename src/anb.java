import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class anb {
   public static void a(CommandDispatcher<ee> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ef.a("list").executes($$0x -> a((ee)$$0x.getSource())))
            .then(ef.a("uuids").executes($$0x -> b((ee)$$0x.getSource())))
      );
   }

   private static int a(ee $$0) {
      return a($$0, clw::O_);
   }

   private static int b(ee $$0) {
      return a($$0, $$0x -> wx.a("commands.list.nameAndId", $$0x.af(), wx.a($$0x.gb().getId())));
   }

   private static int a(ee $$0, Function<aqn, wx> $$1) {
      auj $$2 = $$0.l().ah();
      List<aqn> $$3 = $$2.t();
      wx $$4 = xa.b($$3, $$1);
      $$0.a(() -> wx.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
