import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class aml {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vs.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<du> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dv.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         du $$1 = (du)$$0x.getSource();
         boolean $$2 = false;

         for (apa $$3 : $$1.l().K()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> vs.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
