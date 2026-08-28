import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aos {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(ww.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<ei> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ej.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ei $$1 = (ei)$$0x.getSource();
         boolean $$2 = false;

         for (aro $$3 : $$1.l().L()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> ww.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
