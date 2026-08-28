import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class amz {
   public static void a(CommandDispatcher<eq> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)er.a("list").executes($$0x -> a((eq)$$0x.getSource())))
            .then(er.a("uuids").executes($$0x -> b((eq)$$0x.getSource())))
      );
   }

   private static int a(eq $$0) {
      return a($$0, cmh::O_);
   }

   private static int b(eq $$0) {
      return a($$0, $$0x -> wu.a("commands.list.nameAndId", $$0x.af(), wu.a($$0x.fX().getId())));
   }

   private static int a(eq $$0, Function<aql, wu> $$1) {
      auh $$2 = $$0.l().ah();
      List<aql> $$3 = $$2.t();
      wu $$4 = wx.b($$3, $$1);
      $$0.a(() -> wu.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
