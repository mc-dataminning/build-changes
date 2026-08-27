import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aij {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
            .then(dv.a("uuids").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      return a($$0, ccx::O_);
   }

   private static int b(du $$0) {
      return a($$0, $$0x -> ui.a("commands.list.nameAndId", $$0x.ab(), ui.a($$0x.fR().getId())));
   }

   private static int a(du $$0, Function<alr, ui> $$1) {
      apg $$2 = $$0.m().ac();
      List<alr> $$3 = $$2.t();
      ui $$4 = ul.b($$3, $$1);
      $$0.a(() -> ui.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
