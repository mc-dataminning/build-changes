import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aov {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xa.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<ej> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ek.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ej $$1 = (ej)$$0x.getSource();
         boolean $$2 = false;

         for (ars $$3 : $$1.l().L()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> xa.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
