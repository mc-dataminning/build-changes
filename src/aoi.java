import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aoi {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wp.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<ex> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ey.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ex $$1 = (ex)$$0x.getSource();
         boolean $$2 = false;

         for (ard $$3 : $$1.l().L()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> wp.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
