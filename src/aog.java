import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aog {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wo.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ex $$1 = (ex)$$0x.getSource();
         boolean $$2 = false;

         for (arc $$3 : $$1.l().L()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> wo.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
