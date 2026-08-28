import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoo {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xp.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<ep> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eq.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ep $$1 = (ep)$$0x.getSource();
         boolean $$2 = false;

         for (arf $$3 : $$1.l().K()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> xp.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
