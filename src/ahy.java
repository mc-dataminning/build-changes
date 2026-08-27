import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class ahy {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(tf.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<dr> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ds.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         dr $$1 = (dr)$$0x.getSource();
         boolean $$2 = false;

         for (akk $$3 : $$1.l().F()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> tf.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
