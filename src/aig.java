import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class aig {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("say").requires($$0x -> $$0x.c(2))).then(du.a("message", ei.a()).executes($$0x -> {
         ei.a($$0x, "message", $$1 -> {
            dt $$2 = (dt)$$0x.getSource();
            aoh $$3 = $$2.l().ac();
            $$3.a($$1, $$2, ti.a(ti.d, $$2));
         });
         return 1;
      })));
   }
}
