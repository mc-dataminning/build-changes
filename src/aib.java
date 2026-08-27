import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aib {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ti.c("commands.save.alreadyOff"));

   public static void a(CommandDispatcher<dt> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)du.a("save-off").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         dt $$1 = (dt)$$0x.getSource();
         boolean $$2 = false;

         for (akn $$3 : $$1.l().F()) {
            if ($$3 != null && !$$3.e) {
               $$3.e = true;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> ti.c("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
