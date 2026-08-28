import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aon {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(xd.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<et> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)eu.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         et $$1 = (et)$$0x.getSource();
         boolean $$2 = false;

         for (arh $$3 : $$1.l().L()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> xd.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
