import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class ahe {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("list").executes($$0x -> a((dr)$$0x.getSource())))
            .then(ds.a("uuids").executes($$0x -> b((dr)$$0x.getSource())))
      );
   }

   private static int a(dr $$0) {
      return a($$0, cbm::H_);
   }

   private static int b(dr $$0) {
      return a($$0, $$0x -> tf.a("commands.list.nameAndId", $$0x.ab(), $$0x.fP().getId()));
   }

   private static int a(dr $$0, Function<akl, tf> $$1) {
      anz $$2 = $$0.l().ac();
      List<akl> $$3 = $$2.t();
      tf $$4 = th.b($$3, $$1);
      $$0.a(() -> tf.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
