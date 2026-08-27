import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class aht {
   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("return").requires($$0x -> $$0x.c(2)))
               .then(dt.a("value", IntegerArgumentType.integer()).executes($$0x -> a((ds)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "value")))))
            .then(dt.a("run").redirect($$0.getRoot(), $$0x -> ((ds)$$0x.getSource()).a(aht::a)))
      );
   }

   private static int a(ds $$0, int $$1) {
      $$0.p().accept($$1);
      return $$1;
   }

   private static int a(CommandContext<ds> $$0, boolean $$1, int $$2) {
      int $$3 = $$1 ? $$2 : 0;
      a((ds)$$0.getSource(), $$3);
      return $$3;
   }
}
