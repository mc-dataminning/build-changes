import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class apm {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xv.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<ew> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ex.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ew $$1 = (ew)$$0x.getSource();
         boolean $$2 = false;

         for (ash $$3 : $$1.l().L()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> xv.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
