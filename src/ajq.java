import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ajq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ur.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         du $$1 = (du)$$0x.getSource();
         boolean $$2 = false;

         for (ame $$3 : $$1.m().H()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> ur.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
