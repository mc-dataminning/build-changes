import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class ahy {
   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("return").requires($$0x -> $$0x.c(2)))
               .then(du.a("value", IntegerArgumentType.integer()).executes($$0x -> a((dt)$$0x.getSource(), IntegerArgumentType.getInteger($$0x, "value")))))
            .then(du.a("run").redirect($$0.getRoot(), $$0x -> ((dt)$$0x.getSource()).a(ahy::a)))
      );
   }

   private static int a(dt $$0, int $$1) {
      $$0.p().accept($$1);
      return $$1;
   }

   private static int a(CommandContext<dt> $$0, boolean $$1, int $$2) {
      int $$3 = $$1 ? $$2 : 0;
      a((dt)$$0.getSource(), $$3);
      return $$3;
   }
}
