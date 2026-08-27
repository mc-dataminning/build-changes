import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ann {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ws.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<ec> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ed.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ec $$1 = (ec)$$0x.getSource();
         boolean $$2 = false;

         for (aqe $$3 : $$1.l().K()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> ws.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
