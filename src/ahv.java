import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ahv {
   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("return").requires($$0x -> $$0x.c(2)))
               .then(ds.a("value", IntegerArgumentType.integer()).executes($$0x -> a((dr)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "value")))))
            .then(ds.a("run").redirect($$0.getRoot(), $$0x -> ((dr)$$0x.getSource()).a(ahv::a)))
      );
   }

   private static int a(dr $$0, int $$1) {
      $$0.p().accept($$1);
      return $$1;
   }

   private static int a(CommandContext<dr> $$0, boolean $$1, int $$2) {
      int $$3 = $$1 ? $$2 : 0;
      a((dr)$$0.getSource(), $$3);
      return $$3;
   }
}
