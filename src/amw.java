import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class amw {
   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("list").executes($$0x -> a((ed)$$0x.getSource())))
            .then(ee.a("uuids").executes($$0x -> b((ed)$$0x.getSource())))
      );
   }

   private static int a(ed $$0) {
      return a($$0, clh::O_);
   }

   private static int b(ed $$0) {
      return a($$0, $$0x -> wu.a("commands.list.nameAndId", $$0x.ad(), wu.a($$0x.fZ().getId())));
   }

   private static int a(ed $$0, Function<aqi, wu> $$1) {
      aue $$2 = $$0.l().ah();
      List<aqi> $$3 = $$2.t();
      wu $$4 = wx.b($$3, $$1);
      $$0.a(() -> wu.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
