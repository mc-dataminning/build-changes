import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class akq {
   private static final SimpleCommandExceptionType a = new SimpleCommandExceptionType(vg.c("commands.save.alreadyOn"));

   public static void a(CommandDispatcher<ds> $$0) {
      $$0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)dt.a("save-on").requires($$0x -> $$0x.c(4))).executes($$0x -> {
         ds $$1 = (ds)$$0x.getSource();
         boolean $$2 = false;

         for (ane $$3 : $$1.l().H()) {
            if ($$3 != null && $$3.e) {
               $$3.e = false;
               $$2 = true;
            }
         }

         if (!$$2) {
            throw a.create();
         } else {
            $$1.a(() -> vg.c("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
