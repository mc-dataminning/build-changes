import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class anr {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(wu.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<ed> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)ee.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ed $$1 = (ed)$$0x.getSource();
         boolean $$2 = false;

         for (aqh $$3 : $$1.l().K()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> wu.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
