import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class aiw {
   public static void a(CommandDispatcher<du> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("list").executes($$0x -> a((du)$$0x.getSource())))
            .then(dv.a("uuids").executes($$0x -> b((du)$$0x.getSource())))
      );
   }

   private static int a(du $$0) {
      return a($$0, cdu::P_);
   }

   private static int b(du $$0) {
      return a($$0, $$0x -> ur.a("commands.list.nameAndId", $$0x.ad(), ur.a($$0x.fS().getId())));
   }

   private static int a(du $$0, Function<amf, ur> $$1) {
      apu $$2 = $$0.m().ae();
      List<amf> $$3 = $$2.t();
      ur $$4 = uu.b($$3, $$1);
      $$0.a(() -> ur.a("commands.list.players", $$3.size(), $$2.n(), $$4), false);
      return $$3.size();
   }
}
