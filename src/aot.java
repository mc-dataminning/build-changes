import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aot {
   public static void a(CommandDispatcher<ev> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ew.a("say").requires($$0x -> $$0x.c(2))).then(ew.a("message", fm.a()).executes($$0x -> {
         fm.a($$0x, "message", $$1 -> {
            ev $$2 = (ev)$$0x.getSource();
            avn $$3 = $$2.l().ag();
            $$3.a($$1, $$2, xd.a(xd.f, $$2));
         });
         return 1;
      })));
   }
}
